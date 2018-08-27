package com.beews.util.json;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class DataUtil {
	
	private DataUtil() {
		throw new IllegalStateException("Util Class");
	}
	
	private static final  DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy hh'h':mm'm':SS's'");
	private static final  DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	public static DateTimeFormatter getDataTimeFormat() {
		return TIME_FORMATTER;
	}
	
	public static DateTimeFormatter getDataFormat() {
		return DATE_FORMATTER ;
	}
	
	public static LocalDate parseData(String dataAte) {
		return LocalDate.parse(dataAte,DataUtil.getDataFormat());
	}
	
	public static LocalDateTime parseDataTime(String dataAte) {
		return LocalDateTime.parse(dataAte,DataUtil.getDataTimeFormat());
	}
	
	
	public static String maxDate() {
		return LocalDateTime.MAX.format(getDataTimeFormat());
		
	}
	
	public static String minDate() {
		return LocalDateTime.MIN.format(getDataTimeFormat());
		
	}
}
