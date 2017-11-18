package com.careydevelopment.autobest.masculex;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.careydevelopment.autobest.util.BrandParser;
import com.careydevelopment.autobest.util.Sanitizer;

public class ProcessMasculex {

	private Connection connect = null;
	private Properties props = null;

	
	private static final String[] CATEGORIES = {"Men's Polo Shirts"};
	private static final String[] NODES = {"1045640"};
	private static final String[] BRANDS = {"https://www.amazon.com/gp/search/other/ref=lp_1045640_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A2476517011%2Cn%3A1045640&bbn=1045640&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511013168"};
	
	
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
		String category = CATEGORIES[index];
		String node = NODES[index];

		List<String> brands = BrandParser.parse(BRANDS[index]);
				
		for (String brand : brands) {
			List<String> titles = new ArrayList<String>();
			
			String title = "The 20 Best " + brand + " " + category;
			title = Sanitizer.sanitize(title);
			
			if (notFound(titles, title)) {
				titles.add(title);
				System.err.println(title);
			}
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
