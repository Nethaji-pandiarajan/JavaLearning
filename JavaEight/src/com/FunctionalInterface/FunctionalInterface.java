package com.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.vo.Employee;

public class FunctionalInterface {

	public List<Employee> getListOfEmployees() {
		return new ArrayList<>(Arrays.asList(
				new Employee(101, "Nethaji", "Male", 25, 120000,
						Arrays.asList("Cricket", "Chess", "VolleyBall", "Watching Movies")),
				new Employee(102, "Lina", "Female", 30, 110000,
						Arrays.asList("Football", "Hockey", "Listening Music", "Chess")),
				new Employee(103, "Alice Smith", "Female", 28, 105000,
						List.of("Music", "Cricket", "Listening Music", "Idle")),
				new Employee(104, "Bob Johnson", "Male", 35, 125000, List.of("Walking", "Cricket")),
				new Employee(105, "Manoj", "Male", 27, 12000, List.of("Music", "Football", "Carrom", "Eating")),
				new Employee(106, "Hari", "Male", 18, 80000, List.of("Cricket", "Music", "Listening Music")),
				new Employee(107, "Larry", "Female", 48, 105000, List.of("Music", "Cricket")),
				new Employee(108, "Helana", "Female", 48, 105000, List.of("Music", "Cricket")),
				new Employee(109, "Johnny", "Male", 39, 125000, List.of("Walking", "Cricket")),
				new Employee(110, "Sathis", "Male", 21, 12000, List.of("Music", "Football","Listening Music")),
				new Employee(111, "Akash", "Male", 29, 80000, List.of("Cricket", "Music","Carrom"))));
	}
	
	public Optional<Employee> getOptionalEmployee(){
		Employee e = new Employee(101, "Nethaji", "Male", 25, 120000,
						Arrays.asList("Cricket", "Chess", "VolleyBall", "Watching Movies"));
		
		return Optional.of(e);
	}

	public void comparator(int a, int b) {

		// Before Java 8
		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer x, Integer y) {
				return x.compareTo(y);
			}

		};

		// After java 8
		Comparator<Integer> comp = (x, y) -> x.compareTo(y);
		comp.compare(3, 5);

	}

	public void runnableUse() {
		// Anonymous Inner Class - befor java 8
		Runnable t1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 1");
			}
		};

		new Thread(t1).start();

		Runnable t2 = () -> System.out.println("Thread 2");

		new Thread(t2).start();

		// Using Java 8
		new Thread(() -> System.out.println("Thread 3")).start();
	}

//	public List<Employee> getListOfEmployees() {
//
//		return new ArrayList<>(
//				Arrays.asList(new Employee(101, "Nethaji", 25, 120000), new Employee(102, "John Doe", 30, 110000),
//						new Employee(103, "Alice Smith", 28, 105000), new Employee(104, "Bob Johnson", 35, 125000),
//						new Employee(105, "Manoj", 23, 12000), new Employee(106, "Hari", 20, 80000)));
//
//	}

}
