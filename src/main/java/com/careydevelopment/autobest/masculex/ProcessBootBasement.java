package com.careydevelopment.autobest.masculex;

public class ProcessBootBasement extends BaseProcessor {

	private static final String CONTEXT_NAME = "boot-basement";

	private static final String[][] CATEGORIES = {{"Men's Chelsea Boots","Pair of Men's Chelsea Boots"},
		{"Men's Chukka Boots","Pair of Men's Chukka Boots"},
		{"Men's Motorcycle Boots","Pair of Men's Motorcycle Boots"},
		{"Men's Oxford and Derby Boots","Pair of Men's Oxford and Derby Boots"},
		{"Men's Western Boots","Pair of Men's Western Boots"},
		{"Men's Rain Boots","Pair of Men's Rain Boots"},
		{"Men's Snow Boots","Pair of Men's Snow Boots"},
		{"Men's Hiking Boots","Pair of Men's Hiking Boots"},
		{"Men's Hunting Boots","Pair of Men's Hunting Boots"},
		{"Men's Work Boots","Pair of Men's Work Boots"},
		{"Women's Ankle Boots","Pair of Women's Ankle Boots"},
		{"Women's Mid-Calf Boots","Pair of Women's Mid-Calf Boots"},
		{"Women's Knee-High Boots","Pair of Women's Knee-High Boots"},
		{"Women's Over-the-Knee Boots","Pair of Women's Over-the-Knee Boots"}};

	protected static final String[] NODES = {"11721157011","11721158011","11721160011","11721163011","11721159011",
		"679266011","5658904011","679280011","679283011","11721164011","11721153011","11721154011","11721155011","11721156011"};
	
	protected static final String[] BRAND_NAMES = {"https://www.amazon.com/gp/search/other/ref=lp_11721157011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A679307011%2Cn%3A11721157011&bbn=11721157011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511816488",
		"https://www.amazon.com/gp/search/other/ref=lp_11721158011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A679307011%2Cn%3A11721158011&bbn=11721158011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511816636",
		"https://www.amazon.com/gp/search/other/ref=lp_11721160011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A679307011%2Cn%3A11721160011&bbn=11721160011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511816710",
		"https://www.amazon.com/gp/search/other/ref=lp_11721163011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A679307011%2Cn%3A11721163011&bbn=11721163011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511816838",
		"https://www.amazon.com/gp/search/other/ref=lp_11721159011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A679307011%2Cn%3A11721159011&bbn=11721159011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511816959",
		"https://www.amazon.com/gp/search/other/ref=lp_679266011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A679307011%2Cn%3A679266011&bbn=679266011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511817031",
		"https://www.amazon.com/gp/search/other/ref=lp_5658904011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A679307011%2Cn%3A5658904011&bbn=5658904011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511817128",
		"https://www.amazon.com/gp/search/other/ref=lp_679280011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A679307011%2Cn%3A679280011&bbn=679280011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511817188",
		"https://www.amazon.com/gp/search/other/ref=lp_679283011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A679307011%2Cn%3A679283011&bbn=679283011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511817283",
		"https://www.amazon.com/gp/search/other/ref=lp_11721164011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A679307011%2Cn%3A11721164011&bbn=11721164011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511817409",
		"https://www.amazon.com/gp/search/other/ref=lp_11721153011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679380011%2Cn%3A11721153011&bbn=11721153011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511817588",
		"https://www.amazon.com/gp/search/other/ref=lp_11721154011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679380011%2Cn%3A11721154011&bbn=11721154011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511817633",
		"https://www.amazon.com/gp/search/other/ref=lp_11721155011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679380011%2Cn%3A11721155011&bbn=11721155011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511817714",
		"https://www.amazon.com/gp/search/other/ref=lp_11721156011_sa_p_89?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679380011%2Cn%3A11721156011&bbn=11721156011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511817793"
	};
	
	public ProcessBootBasement() {
		this.categories = CATEGORIES;
		this.brandNames = BRAND_NAMES;
		this.contextName = CONTEXT_NAME;
		this.nodes = NODES;
	}
	
	public static void main(String[] args) {
		ProcessBootBasement pm = new ProcessBootBasement();
		pm.go();
	}
}
