package com.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.FunctionalInterface.FunctionalInterface;
import com.vo.Employee;

public class StreamFlatMap {

	// Flattern the structure (Stream(stream) to Single stream.

	static FunctionalInterface fi = new FunctionalInterface();
	static List<Employee> employeeList = fi.getListOfEmployees();

	public static void main(String[] args) {
		oddEvenExample();
		sortedReverseHobbies();
		sortedHobbies();
		countHobbies();
	}

	public static void oddEvenExample() {

		List<Integer> odd = Arrays.asList(1, 3, 5, 7, 9);
		List<Integer> even = Arrays.asList(0, 2, 4, 6, 8);

		List<List<Integer>> listOfList = Arrays.asList(odd, even);

		System.out.println("Before Flattern List : " + listOfList);

		List<Integer> flatternList = listOfList.stream().flatMap(List::stream).collect(Collectors.toList());

		System.out.println("Flat List :" + flatternList);

	}

	public static void filterHobbies() {
		List<String> hobbies = employeeList.stream().map(x -> x.getHobbies()).flatMap(List::stream)
				.collect(Collectors.toList());

		System.out.println("Hobbies List " + hobbies);

	}

	public static void filterHobbiesWithDistinct() {

		List<String> hobbies = employeeList.stream().map(x -> x.getHobbies()).flatMap(List::stream).distinct()
				.collect(Collectors.toList());

		System.out.println("Hobbies List with distinct" + hobbies);

	}

	public static void sortedHobbies() {

		List<String> hobbies = employeeList.stream().map(x -> x.getHobbies()).flatMap(List::stream).distinct().sorted()
				.collect(Collectors.toList());

		System.out.println("Hobbies List with sorted" + hobbies);
	}

	public static void sortedReverseHobbies() {

		List<String> hobbies = employeeList.stream().map(x -> x.getHobbies()).flatMap(List::stream).distinct()
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println("Hobbies List with sorted" + hobbies);
	}
	
	public static void countHobbies() {
		
		long count = employeeList.stream().map(x->x.getHobbies()).flatMap(List::stream).distinct().count();
		System.out.println("Count of Hobbies : " + count);
	}

}
