package com.Streams;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreams {
	
	public static void main(String[] args) {
		//intStreamUsage();
		whyUseIntStream();
		
		System.out.println("Sum:" +  Unboxing(boxingExample()));
	}
	
	
	
	public static void intStreamUsage() { //Same in Long Stream, and Double Stream
		
		IntStream li = IntStream.range(0, 6);
		IntStream li2 = IntStream.rangeClosed(0, 6);
		
		li.forEach(System.out::println);
		System.out.println("_______________________________________________");
		li2.forEach(System.out::println);
		
		LongStream lss = LongStream.range(0, 6);
		DoubleStream ds = LongStream.range(0, 6).asDoubleStream();
		
		
		
	}
	
	public static void whyUseIntStream() {
		
		// For sum if we go for stream (need to do reduce((a,b)->a+b)
		
		int s = IntStream.range(0, 5).sum();
		
		OptionalDouble sa = IntStream.range(0,5).average();
		
		System.out.println("Sum:" + s +",Average:"+ sa);
		
		
	}
	
	public static List<Integer> boxingExample() {
		return IntStream.range(0, 10)  // primitive int
				.boxed() // Wrapped into Integer (Stream of Integer)
				.collect(Collectors.toList());
	}
	
	public static int Unboxing(List<Integer> li) {
		return li.stream().mapToInt(Integer::valueOf).sum();
	}

}
