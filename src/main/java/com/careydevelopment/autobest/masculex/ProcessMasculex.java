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
		
	private static final String[][] CATEGORIES = {{"Men's Polo Shirts","Men's Polo Shirt"},
		{"Men's Button-Down Casual Shirts","Men's Button-Down Casual Shirt"},
		{"Men's Dress Shirts","Men's Dress Shirt"},
		{"Men's Pullover Sweaters","Men's Pullover Sweater"},
		{"Men's Cardigans","Men's Cardigan"},
		{"Men's Active Jackets","Men's Active Jacket"},
		{"Men's Lightweight Jackets","Men's Lightweight Jacket"},
		{"Men's Raincoats","Men's Raincoat"},
		{"Men's Jeans","Pair of Men's Jeans"},
		{"Men's Dress Pants","Pair of Men's Dress Pants"},
		{"Men's Casual Pants","Pair of Men's Casual Pants"},
		{"Men's Cargo Shorts","Pair of Men's Cargo Shorts"},
		{"Men's Denim Shorts","Pair of Men's Denim Shorts"},
		{"Men's Flat Front Shorts","Pair of Men's Flat Front Shorts"},
		{"Men's Pleated Shorts","Pair of Men's Pleated Shorts"},
		{"Men's Suits","Men's Suit"},
		{"Men's Sport Coats","Men's Sport Coat"}};

	private static final String[] NODES = {"1045640","1045630","1045626","2476516011","1045658","2476494011","2528780011","2476604011",
		"1045564","2476497011","2476498011","2476500011","2476501011","2528724011","2528725011","1045686","1045694"};
	
	private static final String[] BRANDS = {"https://www.amazon.com/gp/search/other/ref=lp_1045640_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A2476517011%2Cn%3A1045640&bbn=1045640&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511013168",
		"https://www.amazon.com/gp/search/other/ref=lp_1045630_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A2476517011%2Cn%3A1045630&bbn=1045630&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511439580",
		"https://www.amazon.com/gp/search/other/ref=lp_1045626_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A2476517011%2Cn%3A1045626&bbn=1045626&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511439864",
		"https://www.amazon.com/gp/search/other/ref=lp_2476516011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A1044442%2Cn%3A2476516011&bbn=2476516011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511439922",
		"https://www.amazon.com/gp/search/other/ref=lp_1045658_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A1044442%2Cn%3A1045658&bbn=1045658&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511440023",
		"https://www.amazon.com/gp/search/other/ref=lp_2476494011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A1045830%2Cn%3A2476494011&bbn=2476494011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511440117",
		"https://www.amazon.com/gp/search/other/ref=lp_2528780011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A1045830%2Cn%3A2528780011&bbn=2528780011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511440261",
		"https://www.amazon.com/gp/search/other/ref=lp_2476604011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A1045830%2Cn%3A2476604011&bbn=2476604011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511440372",
		"https://www.amazon.com/gp/search/other/ref=lp_1045564_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A1045564&bbn=1045564&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511441022",
		"https://www.amazon.com/gp/search/other/ref=lp_2476497011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A1045558%2Cn%3A2476497011&bbn=2476497011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511441149",
		"https://www.amazon.com/gp/search/other/ref=lp_2476498011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A1045558%2Cn%3A2476498011&bbn=2476498011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511441227",
		"https://www.amazon.com/gp/search/other/ref=lp_2476500011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A1045560%2Cn%3A2476500011&bbn=2476500011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511441326",
		"https://www.amazon.com/gp/search/other/ref=lp_2476501011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A1045560%2Cn%3A2476501011&bbn=2476501011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511441441",
		"https://www.amazon.com/gp/search/other/ref=lp_2528724011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A1045560%2Cn%3A2528724011&bbn=2528724011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511441530",
		"https://www.amazon.com/gp/search/other/ref=lp_2528725011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A1045560%2Cn%3A2528725011&bbn=2528725011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511441660",
		"https://www.amazon.com/gp/search/other/ref=lp_1045686_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A1045684%2Cn%3A1045686&bbn=1045686&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511442009",
		"https://www.amazon.com/gp/search/other/ref=lp_1045694_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A1045684%2Cn%3A1045694&bbn=1045694&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511442100"};
	
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

		for (String brand : brands) {
			try {
				Post post = new Post();
				
				String title = "The 20 Best " + brand + " " + category + " for 2018";
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
					Thread.sleep(1000);
				}	
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	private void addListicle(Post post, String node, String brand) {
		List<Product> allProducts = new ArrayList<Product>();
		
		for (int i=1;i<=2;i++) {
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
	
	
	private void addList(Post post, List<Product> products) {
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
