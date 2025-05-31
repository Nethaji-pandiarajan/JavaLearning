package com.Streams.Terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.FunctionalInterface.FunctionalInterface;
import com.vo.Employee;

public class PartitionByExamples {

	/*
	 * Used to separate by using True and False
	 */

	static FunctionalInterface fi = new FunctionalInterface();
	static List<Employee> employeeList = fi.getListOfEmployees();

	public static void main(String[] args) {
		//partitionByOne();
		partionByTwo();
	}

	public static void partitionByOne() { // Predicates
		Map<Boolean, List<Employee>> m = employeeList.stream().collect(Collectors.partitioningBy(x->x.getGender() == "Male"));
		
		System.out.println(m);
	}
	
	public static void partionByTwo() {
		
		Map<Boolean,Set<Employee>> e =  employeeList.stream()
					.collect(Collectors.partitioningBy(x->x.getGender() == "Male",Collectors.toSet()));
		System.out.println(e);
	}

}
