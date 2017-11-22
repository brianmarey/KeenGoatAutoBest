package com.careydevelopment.autobest.masculex;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import com.careydevelopment.autobest.domain.Context;
import com.careydevelopment.autobest.domain.Post;
import com.careydevelopment.autobest.domain.Product;
import com.careydevelopment.autobest.util.AmazonDocumentParser;
import com.careydevelopment.autobest.util.BrandParser;
import com.careydevelopment.autobest.util.IntroHelper;
import com.careydevelopment.autobest.util.Sanitizer;
import com.careydevelopment.autobest.util.SellerUrlHelper;
import com.careydevelopment.autobest.util.SlugHelper;

public class ProcessMasculex {

	private Connection connect = null;
	private Properties props = null;
	private int contextId;
	
	
	private static final String[][] CATEGORIES = {{"Men's Polo Shirts","Men's Polo Shirt"}};
	private static final String[] NODES = {"1045640"};
	private static final String[] BRANDS = {"https://www.amazon.com/gp/search/other/ref=lp_1045640_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A2476517011%2Cn%3A1045640&bbn=1045640&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511013168"};
	
	private String CONTEXT_NAME = "masculex";
	
	public static void main(String[] args) {
		ProcessMasculex pm = new ProcessMasculex();
		pm.go();
	}
	
	
	private void go() {		
		try {
			props = getProperties();
			String connectionString = props.getProperty("jdbc.connection");	
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection(connectionString);
			
			fetchContext();
			
			for (int i=0; i<CATEGORIES.length; i++) {
				processCategory(i);
			}
			
			PreparedStatement ps = connect.prepareStatement("select * from post");
			ResultSet rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connect != null) {
				try {
					connect.close();
				} catch (Exception e) {}
			}
		}
	}
	
	
	private void fetchContext() {
		try (PreparedStatement ps = connect.prepareStatement("select id from context where name=?")) {
			ps.setString(1, CONTEXT_NAME);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				contextId = rs.getInt(1);
			} else {
				throw new RuntimeException("Can't find context!");
			}
			
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	private Properties getProperties() {
		Properties prop = new Properties();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		
		try (InputStream in = loader.getResourceAsStream("application.properties")) {
			prop.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return prop;
	}
	
	
	private void processCategory(int index) {
		String category = CATEGORIES[index][0];
		String node = NODES[index];

		List<String> brands = BrandParser.parse(BRANDS[index]);
		List<String> titles = new ArrayList<String>();

		int i=0;
		
		for (String brand : brands) {
			Post post = new Post();
			
			String title = "The 20 Best " + brand + " " + category;
			title = Sanitizer.sanitize(title);
						
			if (notFound(titles, title)) {
				titles.add(title);
				String intro = IntroHelper.getIntro(brand, CATEGORIES[index][1]); 
				String slug = SlugHelper.getSlug(title);
				
				post.setDate(new Date());
				post.setIntro(intro);
				post.setSlug(slug);
				post.setTitle(title);
				
				addListicle(post, node, brand);
			}
			
			i++;
			if (i>1) break;
		}
	}

	
	private void addListicle(Post post, String node, String brand) {
		addPost(post);
		if (post.getId() > 0) addList(post, node, brand);
		else throw new RuntimeException ("Couldn't find ID!");
	}
	
	
	private void addList(Post post, String node, String brand) {
		for (int i=1;i<=2;i++) {
			SellerUrlHelper urlHelper = new SellerUrlHelper(brand,node,i,null);
			String url = urlHelper.getUrl();

			AmazonDocumentParser parser = new AmazonDocumentParser(url);
			List<Product> products = parser.getProducts();
			
			for (Product product : products) {
				product.setPostId(post.getId());
				persistProduct(product);
			}
		}
	}
	
	
	private void persistProduct(Product product) {
		try (PreparedStatement ps = connect.prepareStatement("insert into product (title, description, post_id, link, imageUrl, highestPrice, lowestPrice) values (?,?,?,?,?,?,?)")) {
			ps.setString(1, product.getTitle());
			ps.setString(2, product.getDescription());
			ps.setInt(3, product.getPostId());
			ps.setString(4, product.getLink());
			ps.setString(5, product.getImageUrl());
			ps.setString(6,  product.getHighestPrice());
			ps.setString(7, product.getLowestPrice());
			
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private void addPost(Post post) {
		int id = 0;
		
		try (PreparedStatement ps = connect.prepareStatement("insert into post (slug,intro,date,title,context_id) values (?,?,?,?,?)")) {
			ps.setString(1, post.getSlug());
			ps.setString(2, post.getIntro());
			ps.setDate(3, new java.sql.Date(post.getDate().getTime()));
			ps.setString(4, post.getTitle());
			ps.setInt(5, contextId);
			
			ps.execute();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (PreparedStatement ps = connect.prepareStatement("select id from post where slug = ?")) {
			ps.setString(1, post.getSlug());
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getInt(1);
				post.setId(id);
			}			
			
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private boolean notFound(List<String> list, String str) {
		boolean notFound = true;
		
		for (String item : list) {
			if (item.toLowerCase().trim().equals(str.toLowerCase().trim())) {
				notFound = false;
				break;
			} 
		}
		
		return notFound;
	}
}
