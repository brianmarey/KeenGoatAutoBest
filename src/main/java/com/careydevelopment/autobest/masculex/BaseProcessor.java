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

import com.careydevelopment.autobest.domain.Post;
import com.careydevelopment.autobest.domain.Product;
import com.careydevelopment.autobest.util.AmazonDocumentParser;
import com.careydevelopment.autobest.util.BrandParser;
import com.careydevelopment.autobest.util.IntroHelper;
import com.careydevelopment.autobest.util.Sanitizer;
import com.careydevelopment.autobest.util.SellerUrlHelper;
import com.careydevelopment.autobest.util.SlugHelper;

public abstract class BaseProcessor {
	
	private Connection connect = null;
	private Properties props = null;
	private int contextId;
	
	protected String[][] categories = {{}};
	protected String[] nodes = {};
	protected String[] brandNames = {};
	protected String contextName;
	
	protected int numberOfItems = 20;
	
	protected void go() {		
		try {
			props = getProperties();
			String connectionString = props.getProperty("jdbc.connection");	
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection(connectionString);
			
			fetchContext();
			
			for (int i=0; i<categories.length; i++) {
				try {
					processCategory(i);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}			
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
			ps.setString(1, contextName);
			
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
		String category = categories[index][0];
		String node = nodes[index];

		List<String> brands = BrandParser.parse(brandNames[index]);
		List<String> titles = new ArrayList<String>();

		for (String brand : brands) {
			try {
				Post post = new Post();
				
				String title = "The " + numberOfItems + " Best " + brand + " " + category + " for 2018";
				title = Sanitizer.sanitize(title);
							
				if (notFound(titles, title)) {
					titles.add(title);
					String intro = IntroHelper.getIntro(brand, categories[index][1]); 
					String slug = SlugHelper.getSlug(title);
					
					post.setDate(new Date());
					post.setIntro(intro);
					post.setSlug(slug);
					post.setTitle(title);
					
					addListicle(post, node, brand, category);
					Thread.sleep(1000);
				}	
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//handle no brand
		try {
			Post post = new Post();
			
			String title = "The " + numberOfItems + " Best " + category + " for 2018";
			title = Sanitizer.sanitize(title);
						
			if (notFound(titles, title)) {
				titles.add(title);
				String intro = IntroHelper.getIntro(null, categories[index][1]); 
				String slug = SlugHelper.getSlug(title);
				
				post.setDate(new Date());
				post.setIntro(intro);
				post.setSlug(slug);
				post.setTitle(title);
				
				addListicle(post, node, null, category);
				Thread.sleep(1000);
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	protected void addListicle(Post post, String node, String brand, String category) {
		List<Product> allProducts = new ArrayList<Product>();
		
		int count = numberOfItems / 10;
		
		for (int i=1;i<=count;i++) {
			SellerUrlHelper urlHelper = new SellerUrlHelper(brand,node,i,null);
			String url = urlHelper.getUrl();

			AmazonDocumentParser parser = new AmazonDocumentParser(url);
			List<Product> products = parser.getProducts();
			allProducts.addAll(products);
		}
		
		if (allProducts != null && allProducts.size() > 17) {
			addPost(post);
			if (post.getId() > 0) addList(post, allProducts);
			else throw new RuntimeException ("Couldn't find ID!");			
		}
	}
	
	
	protected void addList(Post post, List<Product> products) {
		for (Product product : products) {
			try {
				product.setPostId(post.getId());
				persistProduct(product);
			} catch (Exception e) {
				e.printStackTrace();
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
	
	
	protected void addPost(Post post) {
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
