package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SkipLimitSamples {

	static List<String> fruits = Arrays.asList("Apple", "Mango", "Grapes","Orange","Banana","Jack");

	public static void main(String[] args) {

		fruits.stream().limit(3).forEach(System.out::println);
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6);
		
		Optional<Integer> ab = num.stream().skip(4).reduce((a,b)->a+b);
		
		System.out.println("skip :" +ab.get());
		
		Optional<Integer> cd = num.stream().limit(4).reduce((a,b)->a+b);
		System.out.println("limit :" + cd.get());
		
	}

}
