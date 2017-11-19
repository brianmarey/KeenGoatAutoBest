package com.careydevelopment.autobest.util;

public class SlugHelper {

	public static String getSlug(String title) {
		String slug = title.toLowerCase().trim();
		
        slug = slug.replaceAll("\\s+","_");
        
		return slug;
	}
}
