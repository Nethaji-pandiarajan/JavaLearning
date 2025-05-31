package com.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

import com.vo.Employee;

public class BiConsumerSample {
	
	// Bi Consumer has two inputs and returns nothing . It has both accept and andThen methods.
	
	// If you are using andThen two input values are all of same types

	FunctionalInterface f = new FunctionalInterface();

	public static void main(String[] args) {
		BiConsumerSample bi = new BiConsumerSample();
		bi.biconsumer();
	}
	
	public void biconsumer() {
		List<Employee> empList = new ArrayList<>();
		empList = f.getListOfEmployees();
		
		BiConsumer<Employee, Employee> getGender = (age,gender) -> {
			if(gender.getGender() == "Male" && age.getAge() >30) {
				System.out.println(gender);
			}
		};
		
		
		empList.forEach(emp->{
			getGender.accept(emp, emp);
		});
		
//		BiConsumer<Integer, Integer> bi = (x,y)-> System.out.println(x+y);
//		
//		bi.accept(3, 5);
		
	}
	
	public void fetchHobbieswithNames() {
		
		List<Employee> emp = new ArrayList<>();
		emp = f.getListOfEmployees();
		
		BiConsumer<String,List<String>> withHobbies = (name,hobbies) ->  {
			System.out.println("Name:"+ name +", Hobbies"+hobbies);
		};
		
		emp.forEach(em->{
			withHobbies.accept(em.getName(), em.getHobbies());
		});
		
		
	}
	
	

}
