package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.FunctionalInterface.FunctionalInterface;
import com.vo.Employee;

public class StreamMap {

	/*
	 * Map  parameter (Function(input,output)
	 * 
	 */

	static FunctionalInterface fi = new FunctionalInterface();
	static List<Employee> employeeList = fi.getListOfEmployees();

	public static void main(String[] args) {
		// fruitsLength();
		// fruitsLengthInIntegerList();
		// employeeNameToUpperCase();
		employeeNameLength();

	}

	public static void fruitsLength() {

		List<String> fruits = Arrays.asList("Apple", "Mango", "Banana", "Grapes", "Orange");
		fruits.stream().map(x -> x.length()).forEach(System.out::println);

	}

	public static void fruitsLengthInIntegerList() {
		List<String> fruits = Arrays.asList("Apple", "Mango", "Banana", "Grapes", "Orange");

		List<Integer> a = fruits.stream().map(x -> x.length()).collect(Collectors.toList());
		System.out.println("Length of the fruit in List :" + a);
	}

	public static void employeeNameToUpperCase() {

		List<String> employeeName = employeeList.stream().map(x -> x.getName().toUpperCase())
				.collect(Collectors.toList());
		System.out.println("Employee Name in upper case :" + employeeName);

	}

	public static void employeeNameToLowerCase() {

		List<String> employeeName = employeeList.stream().map(Employee::getName).map(String::toLowerCase)
				.collect(Collectors.toList());
		System.out.println("Employee Name in Lower case: " + employeeName);
	}

	public static void employeeNameLength() {

		Function<Employee, String> name = x -> x.getName();
		Function<String, Integer> fun = x -> x.length();

		List<Integer> length = employeeList.stream().map(name).map(fun).collect(Collectors.toList());
		System.out.println("Length of name: " + length);

	}
	
	public static void mapToIntUsage() {
		
		List<Integer> sumi = Arrays.asList(1,2,3,4);
		
		int sumValue = sumi.stream().mapToInt(i->i).sum();
		
		System.out.println(sumValue);
	}

}
