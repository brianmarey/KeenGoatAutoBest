package com.careydevelopment.autobest.masculex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.careydevelopment.autobest.domain.Post;
import com.careydevelopment.autobest.domain.Product;
import com.careydevelopment.autobest.util.AmazonDocumentParser;
import com.careydevelopment.autobest.util.SellerUrlHelper;
import com.careydevelopment.autobest.util.SlugHelper;

public class ProcessCaptainKurt extends BaseProcessor {

	private static final String CONTEXT_NAME = "captkurt";

	private static final String[][] CATEGORIES = {{"Fishing Rods","Fishing Rod"},
		{"Fishing Reels","Fishing Reel"},
		{"Rod and Reel Combos","Rod and Reel Combo"},
		{"Downriggers","Downrigger"},
		{"Fishing Plugs","Fishing Plug"},
		{"Spinning Lures","Spinning Lure"},
		{"Fishing Spoons","Fishing Spoon"},
		{"Fishing Teasers","Fishing Teaser"},
		{"Topwater Lures","Topwater Lures"},
		{"Fishing Bait Rigs","Fishing Bait Rig"},
		{"Fishing Jigs","Fishing Jig"},
		{"Braided Line Options","Braided Line"},
		{"Fluorocarbon Line Options","Fluorocarbon Line"},
		{"Fly Line Options","Fly Line"},
		{"Monofilament Line Options","Monofilament Line"}};

	private static final String[] NODES = {"3409871","3409711","3409791","3409011","3409621","3409661","3409671","3409691",
		"3409701","3409551","3409601","3473351","3473321","13362831011","3473331"};
	
	private static final String[] BRAND_NAMES = {"https://www.amazon.com/gp/search/other/ref=lp_3409871_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3408951%2Cn%3A3409871&bbn=3409871&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511959678",
		"https://www.amazon.com/gp/search/other/ref=lp_3409871_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3408951%2Cn%3A3409871&bbn=3409871&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511959678",
		"https://www.amazon.com/gp/search/other/ref=lp_3409871_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3408951%2Cn%3A3409871&bbn=3409871&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511959678",
		"https://www.amazon.com/gp/search/other/ref=lp_3409011_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3408951%2Cn%3A6680005011%2Cn%3A3409011&bbn=3409011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511962788",
		"https://www.amazon.com/gp/search/other/ref=lp_3409621_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3408951%2Cn%3A6680002011%2Cn%3A6680009011%2Cn%3A3409621&bbn=3409621&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511963023",
		"https://www.amazon.com/gp/search/other/ref=lp_3409661_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3408951%2Cn%3A6680002011%2Cn%3A6680009011%2Cn%3A3409661&bbn=3409661&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511963117",
		"https://www.amazon.com/gp/search/other/ref=lp_3409671_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3408951%2Cn%3A6680002011%2Cn%3A6680009011%2Cn%3A3409671&bbn=3409671&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511963188",
		"https://www.amazon.com/gp/search/other/ref=lp_3409691_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3408951%2Cn%3A6680002011%2Cn%3A6680009011%2Cn%3A3409691&bbn=3409691&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511963292",
		"https://www.amazon.com/gp/search/other/ref=lp_3409701_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3408951%2Cn%3A6680002011%2Cn%3A6680009011%2Cn%3A3409701&bbn=3409701&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511963371",
		"https://www.amazon.com/gp/search/other/ref=lp_3409551_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3408951%2Cn%3A6680002011%2Cn%3A6680008011%2Cn%3A3409551&bbn=3409551&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511963473",
		"https://www.amazon.com/gp/search/other/ref=lp_3409601_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3408951%2Cn%3A6680002011%2Cn%3A6680008011%2Cn%3A3409601&bbn=3409601&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511963571",
		"https://www.amazon.com/gp/search/other/ref=lp_3473351_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3408951%2Cn%3A3473311%2Cn%3A3473351&bbn=3473351&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511963833",
		"https://www.amazon.com/gp/search/other/ref=lp_3473321_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3408951%2Cn%3A3473311%2Cn%3A3473321&bbn=3473321&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511963928",
		"https://www.amazon.com/gp/search/other/ref=lp_13362831011_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3408951%2Cn%3A3473311%2Cn%3A13362831011&bbn=13362831011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511964122",
		"https://www.amazon.com/gp/search/other/ref=lp_3473331_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3408951%2Cn%3A3473311%2Cn%3A3473331&bbn=3473331&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511964201"
	};
	
	private static final String[] ROD_TYPES = {"Fly Fishing","Offshore","Spinning","Surf Fishing","Trolling"};
	
	private Map<String,List<String>> nodeKeywords = new HashMap<String,List<String>>();
	
	
	public ProcessCaptainKurt() {
		this.categories = CATEGORIES;
		this.brandNames = BRAND_NAMES;
		this.contextName = CONTEXT_NAME;
		this.nodes = NODES;
		
		nodeKeywords.put(NODES[0], Arrays.asList(ROD_TYPES));
		nodeKeywords.put(NODES[1], Arrays.asList(ROD_TYPES));
		nodeKeywords.put(NODES[2], Arrays.asList(ROD_TYPES));
	}
	
	
	public static void main(String[] args) {
		ProcessCaptainKurt pm = new ProcessCaptainKurt();
		pm.go();
	}
	
	
	protected void addListicle(Post post, String node, String brand, String category) {
		List<String> keywords = nodeKeywords.get(node);
		
		if (keywords == null) {
			addListicle(post, node, brand, category, null);
		} else {
			for (String keyword : keywords) {
				String title = "The 20 Best " + brand + " " + keyword + " " + category + " for 2018";
				post.setTitle(title);
				
				String slug = SlugHelper.getSlug(title);
				post.setSlug(slug);
				
				addListicle(post, node, brand, category, keyword);
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {}
			}
		}
	}
	
	
	private void addListicle(Post post, String node, String brand, String category, String keyword) {
		List<Product> allProducts = new ArrayList<Product>();
		
		for (int i=1;i<=2;i++) {
			SellerUrlHelper urlHelper = new SellerUrlHelper(brand,node,i,keyword);
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
}
