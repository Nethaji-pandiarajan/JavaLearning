package com.Interface;

import java.util.List;

import com.FunctionalInterface.FunctionalInterface;

public class EmployeeInfo implements EmployeeDetails{

	@Override
	public double calculateSalary(int a) {
		return a+1000;
	}
	
	@Override
	public int hobbiesCount(List<String> h) {
		return h.size()+2;
	}
	
	public static void main(String[] args) {
		EmployeeInfo ei = new EmployeeInfo();
		System.out.println(ei.calculateSalary(4000));
		
		FunctionalInterface fi = new FunctionalInterface();
		
		List<String> lis = EmployeeDetails.employeeName(fi.getListOfEmployees());
		
		lis.forEach(x->{System.out.println(x);});
		
	}
	
	

}
