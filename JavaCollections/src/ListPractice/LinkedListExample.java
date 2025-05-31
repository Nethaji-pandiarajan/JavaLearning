package ListPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> color = new LinkedList<>();

		color.add("Red");
		color.add("Blue");
		color.add("Green");
		color.add("Green");
		color.add("Green");
		color.add("Pink");

		simpleExample(color);

//		retriveElements(color);

		iteratingLinkedList(color);
//		removeLinkedList(color);

	}

	public static void simpleExample(LinkedList color) {
		// Add to linked list at specific index
		color.add(2, "Yellow");
		System.out.println("Specific position " + color);

		// add at first
		color.addFirst("Black");
		System.out.println("Add at first : " + color);

		color.addLast("Rose");
		System.out.println("Add at last: " + color);

	}

	public static void retriveElements(LinkedList<String> color) {

		String first = color.getFirst();
		System.out.println("First Element :" + first);

		String last = color.getLast();
		System.out.println("Last Element :" + last);

		String index = color.get(3);
		System.out.println("at index : " + index);

		for (String c : color) {
			System.out.println(c);
		}

	}

	public static void iteratingLinkedList(LinkedList<String> color) {

		boolean contains = color.contains("Red");
		System.out.println(contains);

		int a = color.indexOf("Rose");
		System.out.println(a);
		
		int lastIndexOf = color.lastIndexOf("Green");
		System.out.println(lastIndexOf);
		
		Iterator<String> it = color.iterator();
		while(it.hasNext()) {
			String c = it.next();
			System.out.println(c);
		}
		
		

	}

	public static void removeLinkedList(LinkedList<String> color) {

		color.remove(0);

		color.remove("Yellow");

		color.removeFirst();

		color.removeLast();
		color.removeFirstOccurrence("Green");

//		color.clear();

		System.out.println(color);
	}

}
