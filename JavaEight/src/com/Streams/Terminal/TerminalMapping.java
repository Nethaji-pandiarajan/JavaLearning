package com.Streams.Terminal;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.FunctionalInterface.FunctionalInterface;
import com.vo.Employee;

public class TerminalMapping {

	static FunctionalInterface fi = new FunctionalInterface();
	static List<Employee> employeeList = fi.getListOfEmployees();

	public static void main(String[] args) {
		simpleExample();
	}

	public static void simpleExample() {

		// to Set can be used ..
		List<String> a = employeeList.stream().collect(Collectors.mapping(Employee::getName, Collectors.toList()));
		System.out.println(a);

		Long b = employeeList.stream().collect(Collectors.mapping(Employee::getName, Collectors.counting()));
		System.out.println(b);
	}

	public static void toSet() {
		List<String> names = List.of("Java", "Python", "Java", "C++");

		Set<String> uniqueNames = names.stream().collect(Collectors.toSet());

		System.out.println(uniqueNames);
	}

}
