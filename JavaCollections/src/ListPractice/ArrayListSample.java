package ListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListSample {

	/*
	 * int DEFAULT_CAPACITY = 10;
	 */

	public static void main(String[] args) {
		//simpleExample();
		//initializeUsingCollectionsConstructor();
		iteratingArrayList();
	}

	public static void simpleExample() {
		List<String> fruits = new ArrayList<>();

		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Banana");
		fruits.add("Watermelon");

		// Accessing values in arrayList 
		
		String first = fruits.get(1);
		System.out.println(first);
		
		// Set values in index
		fruits.set(3, first);
		System.out.println(fruits);
		
		fruits.remove(5);
		
		fruits.remove(first);
		
		List<String> subFruits = new ArrayList<>();
		subFruits.add("Mango");
		subFruits.add("Orange");
		
		fruits.removeAll(subFruits);
		
		System.out.println(fruits);
		
		// It clears all the elements in the list
		fruits.clear();
		
	}

	public static void initializeUsingCollectionsConstructor() {

		List<Integer> firstFive = new ArrayList<>();
		firstFive.add(1);
		firstFive.add(2);
		firstFive.add(3);
		firstFive.add(4);
		firstFive.add(5);

		List<Integer> firstTen = new ArrayList<>(firstFive);

		List<Integer> nextFive = new ArrayList<>();
		nextFive.add(6);
		nextFive.add(7);
		nextFive.add(8);
		nextFive.add(9);
		nextFive.add(10);

		firstTen.addAll(nextFive);
		System.out.println(firstTen);

	}
	
	public static void iteratingArrayList() {
		
		List<String> subject = new ArrayList<>();
		
		subject.add("Tamil");
		subject.add("English");
		subject.add("Maths");
		subject.add("Social");
		
		// By using for loop 
		for(int i =0;i < subject.size();i++) {
			System.out.println(subject.get(i));
		}
		
		// Enhanced for loop
		for(String s: subject) {
			System.out.println(s);
		}
		
		// using iterator 
		
		Iterator<String> iterator = subject.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// using java 8 streams
		
		subject.stream().forEach(System.out::println);
		
		// sorting in ascending order
		Collections.sort(subject);
		System.out.println(subject);
		
		Collections.reverse(subject);
		System.out.println(subject);
		
		
	}

}
