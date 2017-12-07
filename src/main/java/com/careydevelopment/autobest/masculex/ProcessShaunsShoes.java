package com.careydevelopment.autobest.masculex;

public class ProcessShaunsShoes extends BaseProcessor {

	private static final String CONTEXT_NAME = "shaun";

	private static final String[][] CATEGORIES = {{"Men's Running Shoes","Pair of Men's Running Shoes"},
		{"Men's Cross-Training Shoes","Pair of Men's Cross-Training Shoes"},
		{"Men's Golf Shoes","Pair of Men's Golf Shoes"},
		{"Men's Tennis & Racquet Sport Shoes",""},
		{"Men's Walking Shoes",""},
		{"Men's Water Shoes",""},
		{"Men's Wrestling Shoes",""},
		{"Men's Bowling Shoes",""},
		{"Men's Dance Shoes",""},
		{"Men's Fashion Sneakers",""},
		{"Men's Loafers ",""},
		{"Men's Mules & Clogs",""},
		{"Men's Oxfords",""},
		{"Men's Work Shoes",""},
		{"Women's Running Shoes",""},
		{"Women's Cross Training Shoes",""},
		{"Women's Golf Shoes",""},
		{"Women's Tennis Shoes",""},
		{"Women's Cycling Shoes",""},
		{"Women's Walking Shoes",""},
		{"Women's Dance Shoes",""},
		{"Women's Skateboard Shoes",""},
		{"Women's Water Shoes",""},
		{"Women's Bowling Shoes",""},
		{"Women's Fashion Sneakers",""},
		{"Women's Flats",""},
		{"Women's Loafers",""},
		{"Women's Mules & Clogs",""},
		{"Women's Oxfords",""},
		{"Women's Pumps",""},
		{"Women's Flat Sandals",""},
		{"Women's Flip-Flops",""},
		{"Women's Heeled Sandals",""},
		{"Women's Athletic Sandals",""},
		{"Women's Platform Sandals",""},
		{"Women's Slide Sandals",""},
		{"Women's Slippers",""},
		{"Women's Work Shoes",""}};
	

	protected static final String[] NODES = {"679286011","679271011","679278011","3420963011","679303011","679304011","679305011","679268011","679273011","679312011","679313011","3420996011","679319011","679334011","679360011","679351011","679353011","3412245011","679352011","679377011","679339011","679369011","679378011","679348011","679394011","679399011","679404011","679410011","679415011","679416011","10509644011","10509645011","10509650011","679365011","10509646011","10509649011","679433011","679442011",}
;
	
	protected static final String[] BRAND_NAMES = {"https://www.amazon.com/gp/search/other/ref=lp_679286011_sa_p_89/138-9669766-3388447?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A6127770011%2Cn%3A679286011&bbn=679286011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676437",
			"https://www.amazon.com/gp/search/other/ref=lp_679271011_sa_p_89/144-4833573-6278644?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A6127770011%2Cn%3A679271011&bbn=679271011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676439",
			"https://www.amazon.com/gp/search/other/ref=lp_679278011_sa_p_89/139-1670815-3396906?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A6127770011%2Cn%3A679278011&bbn=679278011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676441",
			"https://www.amazon.com/gp/search/other/ref=lp_3420963011_sa_p_89/138-9492148-9743931?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A6127770011%2Cn%3A3420963011&bbn=3420963011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676444",
			"https://www.amazon.com/gp/search/other/ref=lp_679303011_sa_p_89/139-3230955-1763558?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A6127770011%2Cn%3A679303011&bbn=679303011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676448",
			"https://www.amazon.com/gp/search/other/ref=lp_679304011_sa_p_89/147-5653239-8276925?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A6127770011%2Cn%3A679304011&bbn=679304011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676450",
			"https://www.amazon.com/gp/search/other/ref=lp_679305011_sa_p_89/135-3164657-6825726?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A6127770011%2Cn%3A679305011&bbn=679305011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676452",
			"https://www.amazon.com/gp/search/other/ref=lp_679268011_sa_p_89/146-2725584-1521503?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A6127770011%2Cn%3A679268011&bbn=679268011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676453",
			"https://www.amazon.com/gp/search/other/ref=lp_679273011_sa_p_89/133-4848367-9451410?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A6127770011%2Cn%3A679273011&bbn=679273011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676455",
			"https://www.amazon.com/gp/search/other/ref=lp_679312011_sa_p_89/147-7148625-2104919?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A679312011&bbn=679312011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676457",
			"https://www.amazon.com/gp/search/other/ref=lp_679313011_sa_p_89/133-6352577-1351460?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A679313011&bbn=679313011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676459",
			"https://www.amazon.com/gp/search/other/ref=lp_3420996011_sa_p_89/142-3756201-0363742?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A3420996011&bbn=3420996011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676460",
			"https://www.amazon.com/gp/search/other/ref=lp_679319011_sa_p_89/140-2641688-2250239?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A679319011&bbn=679319011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676462",
			"https://www.amazon.com/gp/search/other/ref=lp_679334011_sa_p_89/147-6391426-3004858?rh=n%3A7141123011%2Cn%3A7147441011%2Cn%3A679255011%2Cn%3A679334011&bbn=679334011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676464",
			"https://www.amazon.com/gp/search/other/ref=lp_679360011_sa_p_89/139-4744337-9388745?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A6127771011%2Cn%3A679360011&bbn=679360011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676466",
			"https://www.amazon.com/gp/search/other/ref=lp_679351011_sa_p_89/145-8864395-5069245?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A6127771011%2Cn%3A679351011&bbn=679351011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676468",
			"https://www.amazon.com/gp/search/other/ref=lp_679353011_sa_p_89/147-4069972-9174965?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A6127771011%2Cn%3A679353011&bbn=679353011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676470",
			"https://www.amazon.com/gp/search/other/ref=lp_3412245011_sa_p_89/146-4894050-3997858?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A6127771011%2Cn%3A3412245011&bbn=3412245011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676471",
			"https://www.amazon.com/gp/search/other/ref=lp_679352011_sa_p_89/144-3804625-1554315?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A6127771011%2Cn%3A679352011&bbn=679352011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676473",
			"https://www.amazon.com/gp/search/other/ref=lp_679377011_sa_p_89/142-1369702-1781752?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A6127771011%2Cn%3A679377011&bbn=679377011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676475",
			"https://www.amazon.com/gp/search/other/ref=lp_679339011_sa_p_89/140-7624416-9437741?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A6127771011%2Cn%3A679339011&bbn=679339011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676477",
			"https://www.amazon.com/gp/search/other/ref=lp_679369011_sa_p_89/133-7964940-3317428?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A6127771011%2Cn%3A679369011&bbn=679369011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676479",
			"https://www.amazon.com/gp/search/other/ref=lp_679378011_sa_p_89/130-7526397-9297154?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A6127771011%2Cn%3A679378011&bbn=679378011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676481",
			"https://www.amazon.com/gp/search/other/ref=lp_679348011_sa_p_89/144-2575214-3052631?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A6127771011%2Cn%3A679348011&bbn=679348011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676483",
			"https://www.amazon.com/gp/search/other/ref=lp_679394011_sa_p_89/130-7803104-0984202?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679394011&bbn=679394011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676485",
			"https://www.amazon.com/gp/search/other/ref=lp_679399011_sa_p_89/140-1885280-4072737?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679399011&bbn=679399011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676486",
			"https://www.amazon.com/gp/search/other/ref=lp_679404011_sa_p_89/133-2871175-8572953?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679404011&bbn=679404011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676488",
			"https://www.amazon.com/gp/search/other/ref=lp_679410011_sa_p_89/146-0777818-0735461?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679410011&bbn=679410011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676490",
			"https://www.amazon.com/gp/search/other/ref=lp_679415011_sa_p_89/130-7917503-1632968?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679415011&bbn=679415011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676492",
			"https://www.amazon.com/gp/search/other/ref=lp_679416011_sa_p_89/139-2000844-4887231?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679416011&bbn=679416011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676494",
			"https://www.amazon.com/gp/search/other/ref=lp_10509644011_sa_p_89/140-8387425-9774162?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679425011%2Cn%3A10509644011&bbn=10509644011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676495",
			"https://www.amazon.com/gp/search/other/ref=lp_10509645011_sa_p_89/138-1639783-5141919?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679425011%2Cn%3A10509645011&bbn=10509645011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676497",
			"https://www.amazon.com/gp/search/other/ref=lp_10509650011_sa_p_89/138-8160530-1342817?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679425011%2Cn%3A10509650011&bbn=10509650011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676499",
			"https://www.amazon.com/gp/search/other/ref=lp_679365011_sa_p_89/146-1631774-0365640?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679425011%2Cn%3A679365011&bbn=679365011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676501",
			"https://www.amazon.com/gp/search/other/ref=lp_10509646011_sa_p_89/130-2656537-9681837?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679425011%2Cn%3A10509646011&bbn=10509646011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676503",
			"https://www.amazon.com/gp/search/other/ref=lp_10509649011_sa_p_89/144-6470447-9987235?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679425011%2Cn%3A10509649011&bbn=10509649011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676504",
			"https://www.amazon.com/gp/search/other/ref=lp_679433011_sa_p_89/133-6692771-1829165?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679433011&bbn=679433011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676506",
			"https://www.amazon.com/gp/search/other/ref=lp_679442011_sa_p_89/130-4932113-8628059?rh=n%3A7141123011%2Cn%3A7147440011%2Cn%3A679337011%2Cn%3A679442011&bbn=679442011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512676508",
			};

	
	public ProcessShaunsShoes() {
		if (CATEGORIES.length != BRAND_NAMES.length && NODES.length != CATEGORIES.length) {
			throw new RuntimeException ("Array sizes don't match!");
		}
		
		this.categories = CATEGORIES;
		this.brandNames = BRAND_NAMES;
		this.contextName = CONTEXT_NAME;
		this.nodes = NODES;
	}
	
	public static void main(String[] args) {
		ProcessShaunsShoes pm = new ProcessShaunsShoes();
		pm.go();
	}
}
