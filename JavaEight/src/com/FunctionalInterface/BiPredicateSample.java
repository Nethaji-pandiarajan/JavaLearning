package com.FunctionalInterface;

import java.util.List;
import java.util.function.BiPredicate;

import com.vo.Employee;

public class BiPredicateSample {

	public static void main(String[] args) {
		
		FunctionalInterface fi = new FunctionalInterface();
		
		List<Employee> e = fi.getListOfEmployees();
		
	}
	
	public void simpleBiPredicatewithInteger() {
		
		BiPredicate<Integer,Integer> sam = (x,y)-> x>y;
		
		sam.test(5, 7);
	}
	
}
