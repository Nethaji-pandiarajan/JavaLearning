package com.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.vo.Employee;
import com.FunctionalInterface.FunctionalInterface;

public class CustomSortingExample {

	static FunctionalInterface fi = new FunctionalInterface();
	static List<Employee> employeeList = fi.getListOfEmployees();

	public static void main(String[] args) {
		simpleLambdaSort();
	}

	public static void simpleSort() {
		List<Employee> emp = employeeList.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());

		System.out.println(emp);
	}

	public static void simpleLambdaSort() {

		List<Employee> emp = employeeList.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
				.collect(Collectors.toList());

		System.out.println(emp);
	}
	
}
