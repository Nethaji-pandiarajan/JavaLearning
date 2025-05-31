package com.Streams;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class FactoryMethodsInStream {

	public static void main(String[] args) {
		//iterateMethod();
		generateMethod();
	}
	
	public static void iterateMethod() {   // ordered -infinte loop
		UnaryOperator<Integer> un = x->x+5;
		
		Stream<Integer> s = Stream.iterate(0, un).limit(10); // seed, UnaryOperator
		
		s.forEach(System.out::println);
		
	}
	
	public static void generateMethod() {  // unordered - infine loop
		
		Supplier<Double> sup = Math::random;
		
		Stream<Double> s = Stream.generate(sup).limit(10);  // Supplier as input
		
		s.forEach(System.out::println);
	}
	
	public static void ofMethod() {
		
		Stream<Integer> s = Stream.of(1,2,3,4,5);
		
		
	}
}
