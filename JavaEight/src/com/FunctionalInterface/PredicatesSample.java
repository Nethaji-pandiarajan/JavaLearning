package com.FunctionalInterface;

import java.util.List;
import java.util.function.Predicate;

import com.vo.Employee;

public class PredicatesSample {
	
	public static void main(String[] args) {
		
		PredicatesSample ps = new PredicatesSample();
		
//		ps.simplePredicatesWithInteger();
//		ps.employeeTest();
		
		ps.notAndNegateExample();
	}
	
	public void employeeTest() {
		
		FunctionalInterface fi = new FunctionalInterface();
		
		List<Employee> e = fi.getListOfEmployees();
		
		Predicate<Employee> em = (x)-> x.getAge() == 25;
		
		e.forEach(emp -> {
			if(em.test(emp)) {
				System.out.println(emp);
			}
		});
		
	}
	
	public void simplePredicatesWithInteger() {
		
		Predicate<Integer> p = (x)-> (x>2);
		
		boolean result = p.test(5);
		System.out.println(result);
		
		Predicate<Integer> equal = x->x==5;
		
		boolean r = p.and(equal).test(5);
		System.out.println(r);
		
		
		boolean or = p.or(equal).test(10);
		System.out.println(or);
		
		boolean a = p.negate().test(1);  //negation !(not)
		System.out.println(a);
		
	}
	
	public void notAndNegateExample() {
		
		Predicate<Integer> isEven = (x)-> x % 2==0;
		
		// Introduced in Java 8  (Default Method)
		boolean a = isEven.negate().test(3);
		
		System.out.println("Using Negate" + a);
		
		// Introduced in Java 11 (Static Method)
		boolean b = Predicate.not(isEven).test(2);
		
		System.out.println("Using Not :" + b);
		
		
	}

}
