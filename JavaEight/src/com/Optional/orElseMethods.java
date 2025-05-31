package com.Optional;

import java.util.Optional;

import com.FunctionalInterface.FunctionalInterface;
import com.vo.Employee;

public class orElseMethods {

	static FunctionalInterface fi = new FunctionalInterface();

	public static void main(String[] args) {
//		orElseMethod();
//		orElseGet();
		orElseThrow();
	}

	public static void orElseMethod() {

		Optional<Employee> emp = fi.getOptionalEmployee();
		Optional<Employee> emp1 = Optional.of(new Employee());
		String name = emp.map(Employee::getName).orElse("No Name Found");

		System.out.println(name);

		String name1 = emp1.map(Employee::getName).orElse("No Name Found");
		System.out.println(name1);

	}

	public static void orElseGet() {
		Optional<Employee> emp = fi.getOptionalEmployee();
		String name = emp.map(Employee::getName).orElseGet(()->
		{
			return "Not Found";
		});
		System.out.println(name);
	}
	
	public static void orElseThrow() {
		Optional<Employee> emp = fi.getOptionalEmployee();
		Optional<Employee> emp1 = Optional.of(new Employee());
		String name = emp1.map(Employee::getName).orElseThrow(()->{
			throw new RuntimeException("Not found");
		});
		System.out.println(name);
		
	}

}
