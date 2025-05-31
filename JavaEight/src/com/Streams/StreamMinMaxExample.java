package com.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.FunctionalInterface.FunctionalInterface;
import com.vo.Employee;

public class StreamMinMaxExample {

	static FunctionalInterface fi = new FunctionalInterface();
	static List<Employee> employeeList = fi.getListOfEmployees();

	// if we need to get max value it will obtain 1 value . Either it may contain
	// many values

	public static void main(String[] args) {

		getMaxAge();
		multipleFilter();

		minSalary();

	}

	private static void minSalary() {
		Optional<Employee> minSalary = employeeList.stream().min(Comparator.comparing(Employee::getSalary));

		System.out.println(minSalary.get());
	}

	public static Employee getMaxAge() {
		Optional<Employee> maxSalary = employeeList.stream().max(Comparator.comparing(Employee::getAge));

		System.out.println(maxSalary.get());

		return maxSalary.get();
	}

	// if we need to fetch max Values with multiple then

	public static void multipleFilter() {
		List<Employee> maxAgeList = null;
		Employee e = getMaxAge();
		if (e != null) {
			maxAgeList = employeeList.stream().filter(x -> x.getAge() == e.getAge()).collect(Collectors.toList());
		}

		System.out.println(maxAgeList);

	}
}
