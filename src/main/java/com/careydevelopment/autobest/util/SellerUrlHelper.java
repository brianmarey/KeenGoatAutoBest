package com.careydevelopment.autobest.util;

import java.util.HashMap;
import java.util.Map;


public class SellerUrlHelper {
		
	public static final String SORT_BOOKS_BESTSELLERS = "salesrank";

    /*
     * Your AWS Access Key ID, as taken from the AWS Your Account page.
     */
    private static final String AWS_ACCESS_KEY_ID = "AKIAIRWIB43UG2D76MEA";

    /*
     * Your AWS Secret Key corresponding to the above ID, as taken from the AWS
     * Your Account page.
     */
    private static final String AWS_SECRET_KEY = "g9LgGMKSRg6tq5pLYrHeg1LNTSk06wcgOJfBGyqY";

    /*
     * Use one of the following end-points, according to the region you are
     * interested in:
     * 
     *      US: ecs.amazonaws.com 
     *      CA: ecs.amazonaws.ca 
     *      UK: ecs.amazonaws.co.uk 
     *      DE: ecs.amazonaws.de 
     *      FR: ecs.amazonaws.fr 
     *      JP: ecs.amazonaws.jp
     * 
     */
    private static final String ENDPOINT = "ecs.amazonaws.com";

    private SignedRequestsHelper helper;
    
    private String seller;
    private String browseNode;
    private int pageNumber = 0;
    private String keyword = null;
    
    private boolean onlyAmazon = true;
    
    public SellerUrlHelper() {
        try {
            helper = SignedRequestsHelper.getInstance(ENDPOINT, AWS_ACCESS_KEY_ID, AWS_SECRET_KEY);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
    
    public SellerUrlHelper(String seller,String browseNode,int pageNumber,String keyword) {
    	this.seller = seller;
    	this.browseNode = browseNode;
    	this.pageNumber = pageNumber;
    	this.keyword = keyword;
    	
        try {
            helper = SignedRequestsHelper.getInstance(ENDPOINT, AWS_ACCESS_KEY_ID, AWS_SECRET_KEY);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    public String getUrl(String sortType) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("Service", "AWSECommerceService");
        params.put("Version", "2011-08-01");
        params.put("Operation", "ItemSearch");
        params.put("ResponseGroup", "Large,EditorialReview,Variations,ItemAttributes");
        params.put("SearchIndex", "Apparel");
        params.put("AssociateTag", "brmca-20");
        params.put("BrowseNode", browseNode);
        //if (brand!=null) params.put("Brand", brand);
        params.put("Availability", "Available");
        //if (onlyAmazon) params.put("MerchantId", "Amazon");
        //if (seller !=null) params.put("MerchantId", seller);
        params.put("Sort", sortType);
        params.put("ItemPage", new Integer(pageNumber).toString());
        if (keyword != null) params.put("Keywords", keyword);
        
        String requestUrl = helper.sign(params);
        
        System.err.println("Amazon URL is " + requestUrl);
        
        return requestUrl;
    }
    
    /*public String getUrl2(String sortType) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("Service", "AWSECommerceService");
        params.put("Version", "2011-08-01");
        params.put("Operation", "ItemSearch");
        params.put("ResponseGroup", "EditorialReview,OfferFull,Variations,ItemAttributes");
        params.put("SearchIndex", "Apparel");
        params.put("AssociateTag", "brmca-20");
        params.put("BrowseNode", browseNode);
        if (brand!=null) params.put("Brand", brand);
        params.put("Availability", "Available");
        params.put("MerchantId", "Amazon");
        params.put("sort", sortType);
        params.put("ItemPage", new Integer(pageNumber).toString());
        if (keyword != null) params.put("Keywords", keyword);
        
        String requestUrl = helper.sign(params);
        
        System.err.println("Amazon URL is " + requestUrl);
        
        return requestUrl;
    }*/
    
    
    public String getUrl() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("Service", "AWSECommerceService");
        params.put("Version", "2011-08-01");
        params.put("Operation", "ItemSearch");
        params.put("ResponseGroup", "Large,EditorialReview,ItemAttributes");
        params.put("SearchIndex", "Apparel");
        params.put("AssociateTag", "brmca-20");
        params.put("BrowseNode", browseNode);
        //if (brand!=null) params.put("Brand", brand);
        params.put("Availability", "Available");
        //if (onlyAmazon) 
        if (seller !=null) params.put("MerchantId", seller);
        //params.put("Sort", "salesrank");
        params.put("ItemPage", new Integer(pageNumber).toString());
        if (keyword != null) params.put("Keywords", keyword);
        
        String requestUrl = helper.sign(params);
        
        System.err.println("Amazon URL is " + requestUrl);
        
        return requestUrl;
    }
    
    
    public String getSpecificItemUrl(String sku) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("Service", "AWSECommerceService");
        params.put("Version", "2011-08-01");
        params.put("Operation", "ItemLookup");
        params.put("ResponseGroup", "Variations,Large");
        params.put("AssociateTag", "brmca-20");
        params.put("ItemId", sku);
        
        String requestUrl = helper.sign(params);
        
        //System.err.println("Specific item URL is " + requestUrl);
        
        return requestUrl;
    }
    
    
    public static void main(String[] args) {
    	SellerUrlHelper h = new SellerUrlHelper(null,"1045630",1,"flannel");
    	h.getUrl();
    }

	public boolean isOnlyAmazon() {
		return onlyAmazon;
	}

	public void setOnlyAmazon(boolean onlyAmazon) {
		this.onlyAmazon = onlyAmazon;
	}
}
