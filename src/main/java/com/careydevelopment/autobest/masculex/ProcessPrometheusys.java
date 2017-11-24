package com.careydevelopment.autobest.masculex;

public class ProcessPrometheusys extends BaseProcessor {

	private static final String CONTEXT_NAME = "prometheusys";

	private static final String[][] CATEGORIES = {{"Laptops","Laptop"},
			{"Chromebooks","Chromebook"},
			{"All-in-One Desktops","All-in-One Desktop"},
			{"Mini Desktop PCs","Mini Desktop PC"},
			{"Tower Desktop PCs","Tower Desktop PC"},
			{"Tablets", "Tablet"},
			{"PC Monitors", "PC Monitor"},
			{"Modems", "Modem"},
			{"Laptop Network Adapters", "LaptopNetwork Adapter"},
			{"USB Network Adapters","USB Network Adapter"},
			{"Powerline Network Adapters","Powerline Network Adapter"},
			{"Routers","Router"},
			{"External Hard Drives","External Hard Drive"},
			{"Internal Hard Drives","Internal Hard Drive"},
			{"Internal Solid State Drives","Internal Solid State Drive"},
			{"USB Flash Drives","USB Flash Drive"},
			{"CPUs","CPU"},
			{"Computer Cases","Computer Case"},
			{"Graphics Cards","Graphics Card"},
			{"PC Headsets","PC Headset"},
			{"PC Microphones","PC Microphone"},
			{"Computer Speakers","Computer Speaker"},
			{"Webcams","Webcam"},
			{"PC Keyboards","PC Keyboard"},
			{"Mice","Mouse"},
			{"Uninterrupted Power Supply Options","Uninterrupted Power Supply"}};

	protected static final String[] NODES = {"13896615011","14808788011","13896603011","13896591011","13896597011","13284673011","1292115011",
			"284715","13983731","13983791","1194444","300189", "595048", "1254762011", "1292116011", "3151491","229189","572238",
			"284822","3015405011","3015406011","172471","172511","12879431","11036491","764572"};
	
	protected static final String[] BRAND_NAMES = {"https://www.amazon.com/gp/search/other/ref=lp_13896615011_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A13896617011%2Cn%3A565108%2Cn%3A13896615011&bbn=13896615011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511550142",
		"https://www.amazon.com/gp/search/other/ref=lp_13896615011_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A13896617011%2Cn%3A565108%2Cn%3A13896615011&bbn=13896615011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511550142",
		"https://www.amazon.com/gp/search/other/ref=lp_13896603011_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A13896617011%2Cn%3A565098%2Cn%3A13896603011&bbn=13896603011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511550432",
		"https://www.amazon.com/gp/search/other/ref=lp_13896591011_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A13896617011%2Cn%3A565098%2Cn%3A13896591011&bbn=13896591011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511550557",
		"https://www.amazon.com/gp/search/other/ref=lp_13896597011_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A13896617011%2Cn%3A565098%2Cn%3A13896597011&bbn=13896597011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511550668",
		"https://www.amazon.com/gp/search/other/ref=lp_13896597011_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A13896617011%2Cn%3A565098%2Cn%3A13896597011&bbn=13896597011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511550668",
		"https://www.amazon.com/gp/search/other/ref=lp_1292115011_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A1292115011&bbn=1292115011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511551057",
		"https://www.amazon.com/gp/search/other/ref=lp_284715_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A172504%2Cn%3A284715&bbn=284715&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511551158",
		"https://www.amazon.com/gp/search/other/ref=lp_13983731_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A172504%2Cn%3A490499011%2Cn%3A13983731&bbn=13983731&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511551307",
		"https://www.amazon.com/gp/search/other/ref=lp_13983791_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A172504%2Cn%3A490499011%2Cn%3A13983791&bbn=13983791&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511551421",
		"https://www.amazon.com/gp/search/other/ref=lp_1194444_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A172504%2Cn%3A490499011%2Cn%3A1194444&bbn=1194444&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511551545",
		"https://www.amazon.com/gp/search/other/ref=lp_300189_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A172504%2Cn%3A300189&bbn=300189&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511551663",
		"https://www.amazon.com/gp/search/other/ref=lp_595048_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A1292110011%2Cn%3A595048&bbn=595048&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511551798",
		"https://www.amazon.com/gp/search/other/ref=lp_1254762011_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A1292110011%2Cn%3A1254762011&bbn=1254762011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511551933",
		"https://www.amazon.com/gp/search/other/ref=lp_1292116011_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A1292110011%2Cn%3A1292116011&bbn=1292116011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511552071",
		"https://www.amazon.com/gp/search/other/ref=lp_3151491_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A1292110011%2Cn%3A3151491&bbn=3151491&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511552172",
		"https://www.amazon.com/gp/search/other/ref=lp_229189_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A193870011%2Cn%3A229189&bbn=229189&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511552959",
		"https://www.amazon.com/gp/search/other/ref=lp_572238_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A193870011%2Cn%3A572238&bbn=572238&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511553082",
		"https://www.amazon.com/gp/search/other/ref=lp_284822_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A193870011%2Cn%3A284822&bbn=284822&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511553368",
		"https://www.amazon.com/gp/search/other/ref=lp_3015405011_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A172456%2Cn%3A11548951011%2Cn%3A3015405011&bbn=3015405011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511553518",
		"https://www.amazon.com/gp/search/other/ref=lp_3015406011_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A172456%2Cn%3A11548951011%2Cn%3A3015406011&bbn=3015406011&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511553600",
		"https://www.amazon.com/gp/search/other/ref=lp_172471_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A172456%2Cn%3A11548951011%2Cn%3A172471&bbn=172471&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511553712",
		"https://www.amazon.com/gp/search/other/ref=lp_172511_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A172456%2Cn%3A11548951011%2Cn%3A172511&bbn=172511&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511553796",
		"https://www.amazon.com/gp/search/other/ref=lp_12879431_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A172456%2Cn%3A11548956011%2Cn%3A12879431&bbn=12879431&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511553944",
		"https://www.amazon.com/gp/search/other/ref=lp_11036491_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A172456%2Cn%3A11548956011%2Cn%3A11036491&bbn=11036491&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511554024",
		"https://www.amazon.com/gp/search/other/ref=lp_764572_sa_p_89?rh=n%3A172282%2Cn%3A%21493964%2Cn%3A541966%2Cn%3A172456%2Cn%3A764572&bbn=764572&pickerToList=lbr_brands_browse-bin&ie=UTF8&qid=1511554190"
	};
	
	public ProcessPrometheusys() {
		this.categories = CATEGORIES;
		this.brandNames = BRAND_NAMES;
		this.contextName = CONTEXT_NAME;
		this.nodes = NODES;
	}
	
	public static void main(String[] args) {
		ProcessPrometheusys pm = new ProcessPrometheusys();
		pm.go();
	}
}
