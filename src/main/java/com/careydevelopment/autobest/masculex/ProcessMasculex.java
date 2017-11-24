package com.careydevelopment.autobest.masculex;

public class ProcessMasculex extends BaseProcessor {
		
	protected String[][] categories = {{"Men's Polo Shirts","Men's Polo Shirt"},
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

	protected String[] nodes = {"1045640","1045630","1045626","2476516011","1045658","2476494011","2528780011","2476604011",
		"1045564","2476497011","2476498011","2476500011","2476501011","2528724011","2528725011","1045686","1045694"};
	
	protected String[] brandNames = {"https://www.amazon.com/gp/search/other/ref=lp_1045640_sa_p_89?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A1040658%2Cn%3A2476517011%2Cn%3A1045640&bbn=1045640&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511013168",
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
	
	protected String contextName = "masculex";
	
	public static void main(String[] args) {
		ProcessMasculex pm = new ProcessMasculex();
		pm.go();
	}
}
