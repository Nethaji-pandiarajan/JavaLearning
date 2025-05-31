package com.DefaultCustomSort;

import java.util.Comparator;
import java.util.List;

import com.FunctionalInterface.FunctionalInterface;
import com.vo.Employee;

public class CustomSorting {
	
	static FunctionalInterface fi = new FunctionalInterface();
	
	static List<Employee> employeeList = fi.getListOfEmployees();
	
	public static void main(String[] args) {
		
		Comparator<Employee> compareWithAge = Comparator.comparing(Employee::getAge);
		Comparator<Employee> salary = Comparator.comparing(Employee::getSalary);
		
		
		Comparator<Employee> comp = Comparator.comparing(Employee::getAge).reversed();
		
		
		employeeList.sort(compareWithAge);
		employeeList.sort(comp);
		
		
		//employeeList.sort(compareWithAge.thenComparing(salary));
		employeeList.forEach(x->{
			System.out.println(x);
		});
	}
	
	
	// NullsFirst , NullsLast, naturalOrder(ascending order), reverseOrder(descending order) 

}
