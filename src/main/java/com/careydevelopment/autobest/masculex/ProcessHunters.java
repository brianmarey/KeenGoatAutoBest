package com.careydevelopment.autobest.masculex;

public class ProcessHunters extends BaseProcessor {

	private static final String CONTEXT_NAME = "hunters";

//	private static final String[][] CATEGORIES = {{"Hunting Apparel Options","Hunting Apparel"},
//		{"Men's Hunting Boots","Pair of Men's Hunting Boots"},
//		{"Women's Hunting Boots","Pair of Women's Hunting Boots"},
//		{"Men's Hunting Hats","Men's Hunting Hat"},
//		{"Women's Hunting Hats","Women's Hunting Hat"},
//		{"Deer Calls","Deer Call"},
//		{"Duck Calls","Duck Call"},
//		{"Elk Calls","Elk Call"},
//		{"Goose Calls","Goose Call"},
//		{"Turkey Calls","Turkey Call"},
//		{"Trail Cameras","Trail Camera"},
//		{"Game Finders","Game Finder"},
//		{"GPS Trackers","GPS Tracker"},
//		{"Gun Sights","Gun Sight"},
//		{"Gun Grips","Gun Grip"},
//		{"Gun Safes","Gun Safe"},
//		{"Hunting Knives","Hunting Knife"},
//		{"Tactical Knives","Tactical Knife"},
//		{"Hunting Bags","Hunting Bag"},
//		{"Scent Eliminators","Scent Eliminator"},
//		{"Tree Stands","Tree Stand"},
//		{"Hunting Blinds","Hunting Blind"},
//		{"Safety Belts","Safety Belt"},
//		{"Two-Way Radios","Two-Way Radio"}
//	};

	
	private static final String[][] CATEGORIES = {{"Compound Bows","Compound Bow"},
		{"Recurve Bows","Recurve Bow"},
		{"Basic Bows","Basic Bow"},
		{"Longbows","Long Bow"},
		{"Arrows","Arrow"},
		{"Broadheads","Broadhead"},
		{"Field Points","Field Point"},
		{"Crossbows","Crossbow"},
		{"Earmuffs","Pair of Earmuffs"},
		{"Safety Glasses","Pair of Safety Glasses"},
		{"Earplugs","Set of Earplugs"}
	};

	
//	protected static final String[] NODES = {"3412971","679283011","679358011","2578659011","2578660011","3413151",
//		"3413171","3413181","3413201","3413321","3413551","3413581","617650011","3226129011","4200811","4200861",
//		"3413611","3222119011","13364373011","3413671","3413751","3413441","3413651","912322"};

	protected static final String[] NODES = {"3395551","3395581","719938011","719939011","3395501","719936011","719937011",
		"3395561","3413511","3413661","3413521"};
	
//	protected static final String[] BRAND_NAMES = {"https://www.amazon.com/gp/search/other/ref=lp_3412971_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A13364362011%2Cn%3A3412971&bbn=3412971&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512138335",
//		"https://www.amazon.com/gp/search/other/ref=lp_2352357011_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A13364362011%2Cn%3A2352357011&bbn=2352357011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512138450",
//		"https://www.amazon.com/gp/search/other/ref=lp_2352357011_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A13364362011%2Cn%3A2352357011&bbn=2352357011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512138450",
//		"https://www.amazon.com/gp/search/other/ref=lp_2515131011_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A13364362011%2Cn%3A2515131011&bbn=2515131011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512138655",
//		"https://www.amazon.com/gp/search/other/ref=lp_2515131011_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A13364362011%2Cn%3A2515131011&bbn=2515131011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512138655",
//		"https://www.amazon.com/gp/search/other/ref=lp_3413111_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A3413111&bbn=3413111&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512139181",
//		"https://www.amazon.com/gp/search/other/ref=lp_3413111_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A3413111&bbn=3413111&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512139181",
//		"https://www.amazon.com/gp/search/other/ref=lp_3413111_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A3413111&bbn=3413111&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512139181",
//		"https://www.amazon.com/gp/search/other/ref=lp_3413111_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A3413111&bbn=3413111&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512139181",
//		"https://www.amazon.com/gp/search/other/ref=lp_3413111_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A3413111&bbn=3413111&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512139181",
//		"https://www.amazon.com/gp/search/other/ref=lp_3413551_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A13364359011%2Cn%3A162017011%2Cn%3A3413551&bbn=3413551&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512139515",
//		"https://www.amazon.com/gp/search/other/ref=lp_3413581_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A13364367011%2Cn%3A3413581&bbn=3413581&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512139606",
//		"https://www.amazon.com/gp/search/other/ref=lp_617650011_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A172526%2Cn%3A617650011&bbn=617650011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512139689",
//		"https://www.amazon.com/gp/search/other/ref=lp_3226129011_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A13364359011%2Cn%3A13364369011%2Cn%3A4200781%2Cn%3A3226129011&bbn=3226129011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512139798",
//		"https://www.amazon.com/gp/search/other/ref=lp_4200811_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A13364359011%2Cn%3A13364369011%2Cn%3A4200781%2Cn%3A4200811&bbn=4200811&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512139925",
//		"https://www.amazon.com/gp/search/other/ref=lp_4200861_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A13364359011%2Cn%3A13364369011%2Cn%3A3413341%2Cn%3A4200861&bbn=4200861&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512140117",
//		"https://www.amazon.com/gp/search/other/ref=lp_3413611_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A3226379011%2Cn%3A3413611&bbn=3413611&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512140369",
//		"https://www.amazon.com/gp/search/other/ref=lp_3222119011_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3222111011%2Cn%3A3222119011&bbn=3222119011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512144939",
//		"https://www.amazon.com/gp/search/other/ref=lp_13364373011_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A13364372011%2Cn%3A13364373011&bbn=13364373011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512145075",
//		"https://www.amazon.com/gp/search/other/ref=lp_3413671_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A3304318011%2Cn%3A3413671&bbn=3413671&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512145264",
//		"https://www.amazon.com/gp/search/other/ref=lp_3413751_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A3304321011%2Cn%3A3413751&bbn=3413751&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512145393",
//		"https://www.amazon.com/gp/search/other/ref=lp_3413441_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A3304321011%2Cn%3A3413441&bbn=3413441&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512145488",
//		"https://www.amazon.com/gp/search/other/ref=lp_3413651_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3412851%2Cn%3A3304321011%2Cn%3A3413651&bbn=3413651&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512145586",
//		"https://www.amazon.com/gp/search/other/ref=lp_912322_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A172623%2Cn%3A172654%2Cn%3A912322&bbn=912322&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512145792"
//	};

	
	protected static final String[] BRAND_NAMES = {"https://www.amazon.com/gp/search/other/ref=lp_3395521_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3395321%2Cn%3A3395521&bbn=3395521&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512155906",
		"https://www.amazon.com/gp/search/other/ref=lp_3395521_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3395321%2Cn%3A3395521&bbn=3395521&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512155906",
		"https://www.amazon.com/gp/search/other/ref=lp_3395521_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3395321%2Cn%3A3395521&bbn=3395521&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512155906",
		"https://www.amazon.com/gp/search/other/ref=lp_3395521_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3395321%2Cn%3A3395521&bbn=3395521&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512155906",
		"https://www.amazon.com/gp/search/other/ref=lp_3395501_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3395321%2Cn%3A3395451%2Cn%3A13370726011%2Cn%3A3395501&bbn=3395501&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512156333",
		"https://www.amazon.com/gp/search/other/ref=lp_719936011_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3395321%2Cn%3A3395451%2Cn%3A719936011&bbn=719936011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512156388",
		"https://www.amazon.com/gp/search/other/ref=lp_719937011_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3395321%2Cn%3A3395451%2Cn%3A719937011&bbn=719937011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512156472",
		"https://www.amazon.com/gp/search/other/ref=lp_3395561_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A3395321%2Cn%3A3395561&bbn=3395561&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512156564",
		"https://www.amazon.com/gp/search/other/ref=lp_3304074011_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A13364359011%2Cn%3A3304074011&bbn=3304074011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512156743",
		"https://www.amazon.com/gp/search/other/ref=lp_3304074011_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A13364359011%2Cn%3A3304074011&bbn=3304074011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512156743",
		"https://www.amazon.com/gp/search/other/ref=lp_3304074011_sa_p_89?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A706813011%2Cn%3A13364359011%2Cn%3A3304074011&bbn=3304074011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1512156743"
	};

	
	public ProcessHunters() {
		this.categories = CATEGORIES;
		this.brandNames = BRAND_NAMES;
		this.contextName = CONTEXT_NAME;
		this.nodes = NODES;
	}
	
	public static void main(String[] args) {
		ProcessHunters pm = new ProcessHunters();
		pm.go();
	}
}
