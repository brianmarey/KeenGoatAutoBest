package com.careydevelopment.autobest.util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.careydevelopment.autobest.domain.Product;

public class AmazonDocumentParser {

	private String url;
	
	public AmazonDocumentParser(String url) {
		this.url = url;
	}
	
	
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		
		Document document = getDocument();
		NodeList itemList = document.getElementsByTagName("Item");
		
		for (int i=0; i<itemList.getLength(); i++) {
			Product product = getProduct(itemList.item(i));
			products.add(product);
		}
		
		return products;
	}
	
	
	private Product getProduct(Node node) {
		Product product = new Product();
		
		Element element = (Element) node;
        product.setLink(getTagValue("DetailPageURL", element));
        product.setImageUrl(getGrandchildTagValue("LargeImage", "URL", element));
        product.setDescription(getGreatGrandchildTagValue("EditorialReviews", "EditorialReview", "Content", element));
        product.setTitle(getGrandchildTagValue("ItemAttributes", "Title", element));
        product.setHighestPrice(getGreatGrandchildTagValue("VariationSummary", "HighestPrice", "FormattedPrice", element));
        product.setLowestPrice(getGreatGrandchildTagValue("VariationSummary", "LowestPrice", "FormattedPrice", element));
        
		return product;
	}
	
	
    private String getTagValue(String tag, Element element) {
    	String value = null;
    	
    	if (element != null && tag != null) {
            NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
            Node node = (Node) nodeList.item(0);
            value = node.getNodeValue();    		
    	}
    	
    	return value;
    }

    
    private String getGrandchildTagValue(String childTag, String grandchildTag, Element element) {
    	Node childNode = element.getElementsByTagName(childTag).item(0);
    	return getTagValue(grandchildTag, (Element)childNode);
    }

    
    private String getGreatGrandchildTagValue(String childTag, String grandchildTag, String greatGrandchildTag, Element element) {
    	Node childNode = element.getElementsByTagName(childTag).item(0);
    	
    	if (childNode != null) {
        	Node grandchildNode = ((Element)childNode).getElementsByTagName(grandchildTag).item(0);
        	return getTagValue(greatGrandchildTag, (Element)grandchildNode);    		
    	}
    	
    	return null;
    }
    
    
	private Document getDocument() {
		Document document  = null;
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setNamespaceAware(true);
			
			DocumentBuilder parser = factory.newDocumentBuilder();
			
			URL urlConn = new URL(url);
			HttpURLConnection httpcon = (HttpURLConnection) urlConn.openConnection();
		    httpcon.addRequestProperty("User-Agent", "Mozilla/4.76");
		    
		    InputStream is = httpcon.getInputStream();
		   
		    //Reader reader = new InputStreamReader(is,"ISO-8859-1");
		    Reader reader = new InputStreamReader(is,"UTF-8");
		    //Reader reader = new InputStreamReader(is,"US-ASCII");
		    
		    InputSource ins = new InputSource(reader);
		    //ins.setEncoding("ISO-8859-1");
		    ins.setEncoding("UTF-8");
		    //ins.setEncoding("US-ASCII");

			document = parser.parse(ins);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return document;
	}
}
