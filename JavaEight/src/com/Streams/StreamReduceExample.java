package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.FunctionalInterface.FunctionalInterface;
import com.vo.Employee;

public class StreamReduceExample {

	static FunctionalInterface fi = new FunctionalInterface();
	static List<Employee> employeeList = fi.getListOfEmployees();

	public static void main(String[] args) {

		//simpleReduce();
		//rangeWise();
		//combineEmployeeName();
		getLeastAge();
	}

	public static void simpleReduce() {

		List<Integer> num = Arrays.asList(1, 4, 6, 8, 10);

		Optional<Integer> ab = num.stream().reduce((a, b) -> a + b); // (BinaryOperator) -> Need to use
		
		System.out.println(ab.get()); // to get value from optional
	}
	
	public static void rangeWise() {
		
		List<Integer> num = Arrays.asList(1, 4, 6, 8, 10);

		int ab = num.stream().reduce(0,(a, b) -> a + b);  // for addition need to give 0 (it starts from that)
		
		int mul = num.stream().reduce(1, (a,b)->a*b); // for mul (need to give 1) ,anything by 0 is 0
		
		System.out.println("Multiply: " + mul);
		
		System.out.println("Sum: "+ ab);
	}
	
	public static void combineEmployeeName() {
		
		String names = employeeList.stream().map(x->x.getName()).reduce("",(a,b)->a.concat(b));
		
		System.out.println(names);
		
	}
	
	public static void getLeastAge() {
		
		Optional<Employee> emp = employeeList.stream().reduce((x,y)->x.getAge()<y.getAge() ? x:y);
		
		System.out.println("less age :" + emp.get());
	}
}
