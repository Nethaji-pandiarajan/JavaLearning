package com.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMap {
	
	public static void main(String[] args) {
		System.out.println("map2Double : "+ map2Double());
		System.out.println("map2Long : "+ map2Long());
		System.out.println("map2Obj :"+ map2Object());
		
	}
	
	public static double map2Double() {
		return IntStream.range(0, 10).mapToDouble(x->x).sum();
	}
	
	public static long map2Long() {
		return IntStream.range(0, 10).mapToLong(x->x).sum();
	}
	
	public static List<Integer> map2Object() {
		return IntStream.range(0, 10).mapToObj(x->x).collect(Collectors.toList());
	}
	

}
