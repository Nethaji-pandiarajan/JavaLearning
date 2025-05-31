package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.FunctionalInterface.FunctionalInterface;
import com.vo.Employee;

public class StreamsFilter {

	static FunctionalInterface fi = new FunctionalInterface();
	static List<Employee> employeeList = fi.getListOfEmployees();

	public static void main(String[] args) {
		usingPredicatesinFilter();
		simpleExample();
	}

	public static void simpleExample() {

		List<String> names = Arrays.asList("Sam", "Ram", "Gokul", "Nethaji", "Shiva", "Bala");
		names.stream().filter(x -> x.startsWith("S")).forEach(System.out::println);
	}

	public static void usingPredicatesinFilter() {
		
		Predicate<Employee> pre1 = x->x.getAge() > 28;
		
		employeeList.stream().filter(pre1).forEach(System.out::println);
		
	}

}
