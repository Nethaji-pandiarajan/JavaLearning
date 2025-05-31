package com.FunctionalInterface;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;

import com.vo.Employee;

public class SupplierSample {
	
	public static void main(String[] args) {
		FunctionalInterface f = new FunctionalInterface();
		
		Supplier<List<Employee>> s = ()-> f.getListOfEmployees();
		
		System.out.println(s.get());
		
	}
	

}
