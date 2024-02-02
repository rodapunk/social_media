package com.ecm.social_media.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class URL {
	public static String decodeParam(String text) {
		try {
			return URLDecoder.decode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
	
	public static LocalDate convertLocalDate(String textDate, LocalDate defaultValue) {
		try {
			return LocalDate.parse(textDate, DateTimeFormatter.ISO_DATE);
		} catch (Exception e) {
			return defaultValue;
		}
	}
}