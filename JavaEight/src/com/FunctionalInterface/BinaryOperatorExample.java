package com.FunctionalInterface;

import java.util.Comparator;
import java.util.function.*;

public class BinaryOperatorExample {
	
	public static void main(String[] args) {
		
		Comparator<Integer> comp = (x,y)->x.compareTo(y);
		
		BinaryOperator<Integer> a  = BinaryOperator.maxBy(comp);
		BinaryOperator<Integer> b  = BinaryOperator.minBy(comp);
		
		System.out.println("max : " + a.apply(5, 2));
		System.out.println("min : " + b.apply(5, 2));
		
	}

}
