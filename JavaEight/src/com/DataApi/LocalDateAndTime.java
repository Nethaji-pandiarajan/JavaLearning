package com.DataApi;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateAndTime {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate specificDate = LocalDate.of(2025, 4, 8);
		LocalDate parsedDate = LocalDate.parse("2025-04-08");
		
		LocalDateTime l = LocalDateTime.now(); 
		System.out.println("Now: " + l);
		System.out.println("Today: " + today);
		System.out.println("Specific Date: " + specificDate);
		System.out.println("Parsed Date: " + parsedDate);

		// Date operations
		System.out.println("Tomorrow: " + today.plusDays(1));
		System.out.println("Last week: " + today.minusWeeks(1));
		System.out.println("Is Leap Year: " + today.isLeapYear());
	}
	
	

}
