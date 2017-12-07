package com.careydevelopment.autobest.masculex;

public class ProcessAphrelia extends BaseProcessor {

	private static final String CONTEXT_NAME = "aphrelia";

	private static final String[][] CATEGORIES = {{"Body Glitter Options","Body Glitter"},
		{"Body Paint Options","Body Paint"},
		{"Concealer Options","Concealer"},
		{"Bronzing Powder Options","Bronzing Powder"},
		{"Eye Concealer Options","Eye Concealer"},
		{"Eyebrow Color Options","Eyebrow Color"},
		{"Eyeliner Options","Eyeliner"},
		{"Eyeshadow Options","Eyeshadow"},
		{"Eyeshadow Bases","Eyeshadow Base"},
		{"Eye Glitter Options","Eye Glitter"},
		{"Lash Enhancers","Lash Enhancer"},
		{"Mascara Options","Mascara"},
		{"Blotting Paper Options","Blotting Paper"},
		{"Makeup Sponges","Makeup Sponge"},
		{"Blush Brushes","Blush Brush"},
		{"Concealer Brushes","Concealer Brush"},
		{"Contour Brushes","Contour Brush"},
		{"Fan Brushes","Fan Brush"},
		{"Foundation Brushes","Foundation Brush"},
		{"Kabuki Brushes","Kabuki Brush"},
		{"Powder Puffs","Powder Puff"},
		{"Lip Glosses","Lip Gloss"},
		{"Lip Liners","Lip Liner"},
		{"Lip Plumpers","Lip Plumper"},
		{"Lip Stains","Lip Stain"},
		{"Lipstick Options","Lipstick"},
		{"Lipstick Primers","Lipstick Primer"},
		{"Blush Options","Blush"},
		{"Face Bronzers","Face Bronzer"},
		{"Foundation Options","Foundation"},
		{"Foundation Primers","Foundation Primer"},
		{"Face Powder Options","Face Powder"},
		{"Makeup Palettes","Makeup Palette"},
		{"Eye Makeup Removers","Eye Makeup Remover"},
		{"Face Makeup Removers","Face Makeup Remover"},
		{"Lip Makeup Removers","Lip Makeup Remover"},
		{"Makeup Sets","Makeup Set"},
		{"Curing Lamps","Curing Lamp"},
		{"Nail Polish Options","Nail Polish"},
		{"Nail Dryers","Nail Dryer"},
		{"Nail Polish Removers","Nail Polish Remover"},
		{"Top Coats","Top Coat"},
		{"Base Coats","Base Coat"},
		{"Nail Thickening Solutions","Nail Thickening Solution"},
		{"Brush Sets","Brush Set"},
		{"Makeup Air Brushes","Makeup Air Brush"},
		{"Brow Brushes","Brow Brush"},
		{"Eyeshadow Brushes","Eyeshadow Brush"},
		{"Eyeliner Brushes","Eyeliner Brush"},
		{"Mascara Brushes","Mascara Brush"},
		{"Eyelash Curlers","Eyelash Curler"},
		{"Lip Brushes","Lip Brush"}
	};

	protected static final String[] NODES = {"11058301","702382011","11058321","11058311","16228107011","11058451",
		"11058521","11058361","16228108011","3006286011","10312668011","11058611","11058701","11059501","16228311011",
		"16228312011","16228313011","16228314011","16228315011","16228316011","16228317011","11059041","11059101",
		"14104641","11059051","11059111","11059221","11058711","11058781","11058871","388109011","11058971","2265896011",
		"11059241","11059251","3782991","11059301","13861691011","11059321","3784801","11059371","17269951011",
		"17269952011","3782871","11059451","13861673011","13861671011","11059421","16228318011","13861670011","11059481",
		"11059441"};
	
	protected static final String[] BRAND_NAMES = {"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",
			"https://www.amazon.com/gp/search/other/ref=lp_11058281_sa_p_89?rh=n%3A3760911%2Cn%3A%2111055981%2Cn%3A11058281&bbn=11058281&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512599398",			
	};

	
	public ProcessAphrelia() {
		this.categories = CATEGORIES;
		this.brandNames = BRAND_NAMES;
		this.contextName = CONTEXT_NAME;
		this.nodes = NODES;
	}
	
	public static void main(String[] args) {
		ProcessAphrelia pm = new ProcessAphrelia();
		pm.go();
	}
}
