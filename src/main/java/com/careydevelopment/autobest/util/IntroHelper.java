package com.careydevelopment.autobest.util;

public class IntroHelper {

	public static String getIntro(String brand, String singular) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Looking for a great ");
		sb.append(singular);
		sb.append("? Here are the top 20 options.");
		
		return sb.toString();
	}
}
