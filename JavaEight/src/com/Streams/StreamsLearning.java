package com.Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.FunctionalInterface.FunctionalInterface;
import com.vo.Employee;

public class StreamsLearning {

	static FunctionalInterface f = new FunctionalInterface();

	static List<Employee> employeeList = f.getListOfEmployees();

	public static void main(String[] args) {

		// usingEmployee();
		filterHobbies();
		filterHobbiesWithDistinct();
	}

	public static void simpleExample() {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6);

		s.forEach(System.out::println);
		
		// If we are using the same stream then it will automatically close and
		// s.forEach(x->System.out.println(x));
	}

	public static void usingEmployee() {

		Map<String, List<String>> hobbies = employeeList.stream().filter(x -> x.getGender() == "Male")
				.collect(Collectors.toMap(Employee::getName, Employee::getHobbies));
		
		
		System.out.println(hobbies);

	}

	public static void filterHobbies() {
		Stream<Employee> hobbies = employeeList.stream();
				
		List<String> b =  hobbies.map(x -> x.getHobbies()).flatMap(List::stream)
				.collect(Collectors.toList());

		System.out.println("Hobbies List " + hobbies);

	}
	
	public static void filterHobbiesWithDistinct() {
		
		List<String> hobbies = employeeList.stream().map(x -> x.getHobbies()).flatMap(List::stream).distinct()
				.collect(Collectors.toList());
		
		System.out.println(hobbies);
	}

}
