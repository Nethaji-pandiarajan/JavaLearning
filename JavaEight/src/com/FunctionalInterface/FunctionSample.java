package com.FunctionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import com.vo.Employee;

public class FunctionSample {

	public static void main(String[] args) {

		FunctionSample fs = new FunctionSample();
		//fs.withString();
//		fs.andThenAndCompose();
//		fs.identity();
		usingEmployee();
		
	}
	
	
	public static void usingEmployee() {
		
		FunctionalInterface fi = new FunctionalInterface();
		List<Employee> emp =fi.getListOfEmployees();
				
		Predicate<Employee> o = x-> x.getAge() >=28;
		
		Function<List<Employee>,Map<String,Long>> salary = (x) ->{
			Map<String,Long> m = new HashMap<>();
			x.forEach(em->{
				if(o.test(em)) {
					m.put(em.getName(), em.getSalary());
				}
			});
			return m;
		};
		
		System.out.println(salary.apply(emp));;
		
	}
	
	
	public void identity() {
		
		Function<String,String> i = Function.identity();
		
		System.out.println(i.apply("test"));
		
	}
	
	public void andThenAndCompose() {
		
		Function<String,String> f1 = x -> x.toUpperCase();
		Function<String,String> f2 = x->x.toUpperCase().concat("rockzs");
		
		String result = f1.andThen(f2).apply("Nethaji");
		System.out.println("andThen: " + result);
		
		String compose = f1.compose(f2).apply("Nethaji");
		System.out.println("Compose " + compose);
		
	}
	
	
	

	public void withString() {
		Function<String, Integer> sf = x -> x.length();

		Integer a = sf.apply("Nethaji");
		System.out.println(a);
	}

	public void withInteger() {
		
		Function<Integer, Integer> f = x -> x;

		int a = f.apply(5);
		System.out.println(a);
	}

}
