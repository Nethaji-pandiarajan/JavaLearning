package com.FunctionalInterface;

import java.util.List;
import java.util.function.Consumer;

import com.vo.Employee;

public class ConsumersExample {

	// accept, andThen

	FunctionalInterface f = new FunctionalInterface();

	public static void main(String[] args) {

		ConsumersExample ce = new ConsumersExample();
		ce.usingAndThen();
//		ce.usingEmployeeList();
//		ce.withCondition();

	}

	public void simpleConsumer() {
		Consumer<Integer> i = (x) -> System.out.println(x);
		i.accept(3);

		Consumer<String> con = (s) -> System.out.println(s.toUpperCase());

		con.accept("Nethaji");
	}

	public void usingEmployeeList() {

		List<Employee> e = f.getListOfEmployees();

		Consumer<Employee> j = (x) -> {
			if (x.getAge() == 25) {
				System.out.println(x.getName());
			}

		};

		Consumer<Employee> k = (x) -> System.out.println(x.getName());

		e.forEach(x -> {
			j.andThen(k).andThen(k).accept(x);
		});

		
		 List<Employee> empList = f.getListOfEmployees();
		 
		 Consumer<Employee> empConsumer = (emp) -> System.out.println(emp);
		 Consumer<Employee> empConsumer1 = (emp) ->
		 System.out.println(emp.getName().toUpperCase());
		 
		 empList.forEach(empConsumer); empList.forEach((emp) ->
		 System.out.println(emp.getId()));
		 empList.forEach(empConsumer.andThen(empConsumer1));
		 

	}

	public void usingAndThen() {

		Consumer<Integer> c1 = (x) -> System.out.println(x + 10);
		Consumer<Integer> c2 = (x) -> System.out.println(x * 2);

		c1.accept(4);
		c2.accept(4);

		c1.andThen(c2).accept(4);
	}

	public void withCondition() {

		List<Employee> empList = f.getListOfEmployees();

		Consumer<Employee> empConsumer1 = (emp) -> System.out.println(emp.getName().toUpperCase());

		Consumer<Employee> c1 = (x) -> {
			if (x.getAge() >= 25) {
				System.out.println(x);
			}
		};

		empList.forEach(emp -> {
			empConsumer1.andThen(c1).accept(emp);
		});

//		empList.forEach(x -> {
//			if (x.getAge() >= 25) {
//				c1.andThen(empConsumer1).accept(x);
//			};
//		});
	}

}
