package com.careydevelopment.autobest.masculex;

public class ProcessWatches extends BaseProcessor {

	private static final String CONTEXT_NAME = "watts";

	private static final String[][] CATEGORIES = {{"Men's Watches","Men's Watch"},
		{"Women's Watches","Women's Watch"}
	};

	protected static final String[] NODES = {"6358540011","6358544011"};
	
	protected static final String[] BRAND_NAMES = {"https://www.amazon.com/gp/search/other/ref=lp_6358540011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A6358539011%2Cn%3A6358540011&bbn=6358540011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512216834",
		"https://www.amazon.com/gp/search/other/ref=lp_6358544011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A6358543011%2Cn%3A6358544011&bbn=6358544011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512217017"
	};
	
	public ProcessWatches() {
		this.categories = CATEGORIES;
		this.brandNames = BRAND_NAMES;
		this.contextName = CONTEXT_NAME;
		this.nodes = NODES;
		
		this.numberOfItems = 40;
	}
	
	public static void main(String[] args) {
		ProcessWatches pm = new ProcessWatches();
		pm.go();
	}
}
