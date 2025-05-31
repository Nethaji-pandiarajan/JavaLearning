package com.FunctionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.vo.Employee;

public class ConsumerAndPredicateExampe {
	
	static Predicate<Employee> age = (x) -> x.getAge() > 30;
	
	static Predicate<Employee> gender = (x) -> x.getGender() == "Male";
	
	static BiPredicate<Integer,String> ageAndGender = (age,gender) -> age > 30 && gender == "Male";
	
	static BiConsumer<String,List<String>> nameWithHobbies = (name,hobbies)->System.out.println("Name : " + name + ",Hobbies " + hobbies );
	
	static Consumer<Employee> employee = x -> {
		if(age.and(gender).test(x)) {
			nameWithHobbies.accept(x.getName(), x.getHobbies());
		}
	};
	
	
	public static void main(String[] args) {
		
		FunctionalInterface fi = new FunctionalInterface();
		List<Employee> e = fi.getListOfEmployees();
		
		e.forEach(employee);
		
	}

}
