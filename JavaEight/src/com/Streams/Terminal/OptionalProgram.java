package com.Streams.Terminal;

import java.util.Optional;

public class OptionalProgram {

	public static void main(String[] args) {
		
		  String[] words = new String[10];
		  String word = Optional.ofNullable(words[5])
                  .map(String::toLowerCase)
                  .orElse("default");

		  System.out.print(word +"\n");
		 
		
		String name = "HCLTECH";
		reverseString(name);
		
	}
	
	public static void reverseString(String name) {
		String s = "Hello";
		
		String rever = "";
		
		for(int i = s.length()-1;i>=0;i--) {
			rever += s.charAt(i);
		}
		
		System.out.println(rever);
	}
	
	

}
