package com.careydevelopment.autobest.util;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Sanitizer {

	private static final Pattern DIACRITICS_AND_FRIENDS = Pattern.compile("[\\p{InCombiningDiacriticalMarks}\\p{IsLm}\\p{IsSk}]+");

	private static final String[][] REPLACEMENTS = {{"&#039;","'"},{"&amp;","&"}};
	
	
	public static String stripDiacritics(String str) {
	    str = Normalizer.normalize(str, Normalizer.Form.NFD);
	    str = DIACRITICS_AND_FRIENDS.matcher(str).replaceAll("");
	    return str;
	}
	
	
	public static String sanitize(String s) {
		String returnValue = stripDiacritics(s);
		
		for (int i=0; i<REPLACEMENTS.length;i++) {
			if (returnValue.indexOf(REPLACEMENTS[i][0]) > -1) {
				int loc = returnValue.indexOf(REPLACEMENTS[i][0]);
				
				returnValue = returnValue.substring(0,loc) + REPLACEMENTS[i][1] + returnValue.substring(loc + REPLACEMENTS[i][0].length(), returnValue.length());
			}
		}
		
		return returnValue;
	}
}
