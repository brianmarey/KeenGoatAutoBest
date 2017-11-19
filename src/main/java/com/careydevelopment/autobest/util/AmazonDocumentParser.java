package com.careydevelopment.autobest.util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class AmazonDocumentParser {

	private String url;
	
	public AmazonDocumentParser(String url) {
		this.url = url;
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
		    //Reader reader = new InputStreamReader(is,"UTF-8");
		    Reader reader = new InputStreamReader(is,"US-ASCII");
		    
		    InputSource ins = new InputSource(reader);
		    //ins.setEncoding("ISO-8859-1");
		    //ins.setEncoding("UTF-8");
		    ins.setEncoding("US-ASCII");

			document = parser.parse(ins);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return document;
	}
}
