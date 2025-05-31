package com.Interface;

import java.util.List;
import java.util.stream.Collectors;

import com.vo.Employee;

public interface EmployeeDetails {
	
	double calculateSalary(int a);
	
	default int hobbiesCount(List<String> hobbies) {
		return hobbies.size();
	}
	
	static List<String> employeeName(List<Employee> e){
		return e.stream().map(x->x.getName()).collect(Collectors.toList());
	} 
}
