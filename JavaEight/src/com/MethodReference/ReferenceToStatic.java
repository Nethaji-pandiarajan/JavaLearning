package com.MethodReference;

import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

import com.vo.Employee;

public class ReferenceToStatic {

	// ClassName :: staticmethodName

	public static void main(String[] args) {
		basicExample();
		Predicate<Employee> checkAge = ReferenceToStatic::checkAge;
		
	}

	public static boolean checkAge(Employee x) {
		return x.getAge() > 28;
	}

	private static void basicExample() {

		// Before Java 8
		int c = ReferenceToStatic.add(3, 4);
		System.out.println(c);

		// After Java 8

		// Need to assign to a Functional Interface on left side to perform this
		IntBinaryOperator a = ReferenceToStatic::add;

		c = a.applyAsInt(3, 4);
		System.out.println(c);
	}

	public static int add(int x, int y) {
		return x + y;
	}

}
