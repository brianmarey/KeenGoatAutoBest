package com.careydevelopment.autobest.masculex;

public class ProcessDinnerware extends BaseProcessor {

	private static final String CONTEXT_NAME = "dinnerware";

	private static final String[][] CATEGORIES = {{"Bowl Sets","Bowl Set"},
		{"Pasta Bowls","Pasta Bowl"},
		{"Rice Bowls","Rice Bowl"},
		{"Salad Bowls","Salad Bowl"},
		{"Soup Bowls","Soup Bowl"},
		{"Cup and Saucer Sets","Cup and Saucer Set"},
		{"Espresso Cups","Espresso Cup"},
		{"Mug Sets","Mug Set"},
		{"Teacups","Teacup"},
		{"Dinnerware Sets","Dinnerware Set"},
		{"Flatware Sets","Flatware Set"},
		{"Beer Glasses","Beer Glass"},
		{"Beer Mugs","Beer Mug"},
		{"Tumblers","Tumbler"},
		{"Wine Glasses","Wine Glass"},
		{"Champagne Glasses","Champagne Glass"},
		{"Mixed Drinkware Sets","Mixed Drinkware Set"},
		{"Highball Glasses","Highball Glass"},
		{"Martini Glasses","Martini Glass"},
		{"Shot Glasses","Shot Glass"},
		{"Iced Tea Glasses","Iced Tea Glass"},
		{"Sake Sets","Sake Set"},
		{"Serving Bowls","Serving Bowl"},
		{"Serving Trays","Serving Tray"},
		{"Platters","Platter"},
		{"Salt and Pepper Shaker Sets","Salt and Pepper Shaker Set"}};

	protected static final String[] NODES = {"9298947011","367118011","367120011","367122011","376930011","3135653011",
		"367139011","9298951011","367144011","367146011","367232011","13217731","13217761","13218451","13218541",
		"13217791","13218751","13218091","13218271","13218391","13218151","3136597011","367187011","678547011",
		"678544011","15850301"};
	
	protected static final String[] BRAND_NAMES = {"https://www.amazon.com/gp/search/other/ref=lp_9298947011_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A367107011%2Cn%3A9298947011&bbn=9298947011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512043680",
		"https://www.amazon.com/gp/search/other/ref=lp_367118011_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A367107011%2Cn%3A367118011&bbn=367118011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512043977",
		"https://www.amazon.com/gp/search/other/ref=lp_367120011_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A367107011%2Cn%3A367120011&bbn=367120011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512044117",
		"https://www.amazon.com/gp/search/other/ref=lp_367122011_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A367107011%2Cn%3A367122011&bbn=367122011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512044200",
		"https://www.amazon.com/gp/search/other/ref=lp_376930011_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A367107011%2Cn%3A376930011&bbn=376930011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512044283",
		"https://www.amazon.com/gp/search/other/ref=lp_3135653011_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A367125011%2Cn%3A3135653011&bbn=3135653011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512044381",
		"https://www.amazon.com/gp/search/other/ref=lp_367139011_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A367125011%2Cn%3A367139011&bbn=367139011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512044475",
		"https://www.amazon.com/gp/search/other/ref=lp_9298951011_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A367125011%2Cn%3A9298951011&bbn=9298951011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512044593",
		"https://www.amazon.com/gp/search/other/ref=lp_367144011_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A367125011%2Cn%3A367144011&bbn=367144011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512044691",
		"https://www.amazon.com/gp/search/other/ref=lp_367146011_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A367146011&bbn=367146011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512044789",
		"https://www.amazon.com/gp/search/other/ref=lp_367232011_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A13218891%2Cn%3A367232011&bbn=367232011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512044911",
		"https://www.amazon.com/gp/search/other/ref=lp_13217731_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A13217501%2Cn%3A13217731&bbn=13217731&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512045087",
		"https://www.amazon.com/gp/search/other/ref=lp_13217761_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A13217501%2Cn%3A13217761&bbn=13217761&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512045210",
		"https://www.amazon.com/gp/search/other/ref=lp_13218451_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A13217501%2Cn%3A13218451&bbn=13218451&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512045319",
		"https://www.amazon.com/gp/search/other/ref=lp_13218541_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A13217501%2Cn%3A16861787011%2Cn%3A13218541&bbn=13218541&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512045408",
		"https://www.amazon.com/gp/search/other/ref=lp_13217791_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A13217501%2Cn%3A16861787011%2Cn%3A13217791&bbn=13217791&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512045499",
		"https://www.amazon.com/gp/search/other/ref=lp_13218751_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A13217501%2Cn%3A13218751&bbn=13218751&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512045626",
		"https://www.amazon.com/gp/search/other/ref=lp_13218091_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A13217501%2Cn%3A13218091&bbn=13218091&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512045716",
		"https://www.amazon.com/gp/search/other/ref=lp_13218271_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A13217501%2Cn%3A13218271&bbn=13218271&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512045795",
		"https://www.amazon.com/gp/search/other/ref=lp_13218391_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A13217501%2Cn%3A13218391&bbn=13218391&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512045940",
		"https://www.amazon.com/gp/search/other/ref=lp_13218151_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A13217501%2Cn%3A13218151&bbn=13218151&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512046050",
		"https://www.amazon.com/gp/search/other/ref=lp_3136597011_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A13217501%2Cn%3A3136597011&bbn=3136597011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512046148",
		"https://www.amazon.com/gp/search/other/ref=lp_367187011_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A367165011%2Cn%3A367187011&bbn=367187011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512046406",
		"https://www.amazon.com/gp/search/other/ref=lp_678547011_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A367165011%2Cn%3A367201011%2Cn%3A678547011&bbn=678547011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512046528",
		"https://www.amazon.com/gp/search/other/ref=lp_678544011_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A13162311%2Cn%3A367165011%2Cn%3A367201011%2Cn%3A678544011&bbn=678544011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512046628",
		"https://www.amazon.com/gp/search/other/ref=lp_15850301_sa_p_89?rh=n%3A1055398%2Cn%3A%211063498%2Cn%3A284507%2Cn%3A289754%2Cn%3A289802%2Cn%3A15850301&bbn=15850301&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512046752"
	};
	
	public ProcessDinnerware() {
		this.categories = CATEGORIES;
		this.brandNames = BRAND_NAMES;
		this.contextName = CONTEXT_NAME;
		this.nodes = NODES;
	}
	
	public static void main(String[] args) {
		ProcessDinnerware pm = new ProcessDinnerware();
		pm.go();
	}
}
