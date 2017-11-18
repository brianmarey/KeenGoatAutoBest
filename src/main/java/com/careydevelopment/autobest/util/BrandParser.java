package com.careydevelopment.autobest.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrandParser {

	public static void main(String[] args) {
		List<String> list = parse("https://www.amazon.com/gp/search/other/ref=lp_1045640_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A2476517011%2Cn%3A1045640&bbn=1045640&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511013168");
		for (String brand : list) {
			System.err.println(brand);
		}
	}
	
	public static List<String> parse(String url) {
		List<String> list = new ArrayList<String>();
		InputStream is = null;
		HttpURLConnection httpcon = null;
		BufferedReader reader = null;
		
		try {
			URL urlConn = new URL(url);
			httpcon = (HttpURLConnection) urlConn.openConnection();
		    httpcon.addRequestProperty("User-Agent", "Mozilla/4.76");
		    
		    is = httpcon.getInputStream();
		   
		    //Reader reader = new InputStreamReader(is,"ISO-8859-1");
		    //Reader reader = new InputStreamReader(is,"UTF-8");
		    //reader = new InputStreamReader(is,"US-ASCII");
		    
		    reader = new BufferedReader(new InputStreamReader(is,"UTF-8"));

		    StringBuilder sb = new StringBuilder();
		    String inputLine;
		    while ((inputLine = reader.readLine()) != null) {
		    	//System.err.println(inputLine);
		    	sb.append(inputLine);
		    }
		    	
		            
		    String contents = sb.toString();
		    
		    
		    //System.err.println(contents);

		    list=getBrands(contents);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) reader.close();
				if (is != null) is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

	
	private static List<String> getBrands(String contents) {
		List<String> list = new ArrayList<String>();
		
		int start = 0;
		while (contents.indexOf("refinementLink", start) > -1) {
			int brandStart = contents.indexOf("refinementLink", start) + 16;
			int brandEnd = contents.indexOf("<", brandStart + 1);
			String brand = contents.substring(brandStart,brandEnd);
			list.add(brand);
			start = brandEnd;
		}
		
		return list;
	}
}
