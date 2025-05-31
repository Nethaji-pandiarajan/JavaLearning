package com.Streams;

import java.util.List;
import java.util.Optional;

import com.FunctionalInterface.FunctionalInterface;
import com.vo.Employee;

public class FindAnyFindFirstExample {

	static FunctionalInterface fi = new FunctionalInterface();
	static List<Employee> employeeList = fi.getListOfEmployees();

	public static void main(String[] args) {

		findFirst();
		findAny();
	}
	
	public static void findFirst() {
		
		Optional<Employee> a = employeeList.stream().filter(x->x.getAge()==48).findAny(); //(any of the matching data)
		System.out.println(a.get());
		
	}
	
	public static void findAny() {
		
		Optional<Employee> a = employeeList.stream().filter(x->x.getAge()==48).findFirst(); // only returns the first data..
		System.out.println(a.get());
	}

}
