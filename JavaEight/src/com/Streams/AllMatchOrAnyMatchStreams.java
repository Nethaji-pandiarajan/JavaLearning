package com.Streams;

import java.util.Arrays;
import java.util.List;

public class AllMatchOrAnyMatchStreams {
	
	static List<String> fruits = Arrays.asList("Apple","Mango","Grapes");
	
	public static void main(String[] args) {
		
		allMatchExa();
		anyMatchExample();
	}
	
	public static void allMatchExa() {
		
		boolean check = fruits.stream().allMatch(x->x.length()>8);
		System.out.println(check);
		
	}
	
	public static void anyMatchExample() {
		boolean checkAnyMatch = fruits.stream().anyMatch(x->x.length()==6);
		System.out.println(checkAnyMatch);

	}

}
