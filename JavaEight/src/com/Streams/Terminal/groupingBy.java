package com.Streams.Terminal;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.FunctionalInterface.FunctionalInterface;
import com.vo.Employee;

public class groupingBy {
	static FunctionalInterface fi = new FunctionalInterface();
	static List<Employee> employeeList = fi.getListOfEmployees();

	public static void main(String[] args) {
		//groupByGender();
		//groupByTwoLevel();
		groupByThirdLevel();

	}
	
	public static void groupByGender() { // with single parameter - Function
		
		Map<String,List<Employee>> emp = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender)); 
		System.out.println(emp);
	}
	
	public static void groupByTwoLevel() { //(Function,Collector)
		Map<String, Map<String, List<Employee>>> e= employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
				Collectors.groupingBy(emp->emp.getAge() <= 30 ? "Young" : "Old")));
		
		System.out.println(e);
		
	}
	
	public static void groupByThirdLevel() { //(Function,Supplier,Collector)
		Map<String, List<Employee>> e= employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
				LinkedHashMap::new,Collectors.toList()));
		
		System.out.println(e);
	}

}
