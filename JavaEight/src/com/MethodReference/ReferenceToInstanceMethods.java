package com.MethodReference;

import java.util.function.Function;

public class ReferenceToInstanceMethods {
	
	// object :: methodName

	public static void main(String[] args) {
		
		ReferenceToInstanceMethods r = new ReferenceToInstanceMethods();
		Function<String,String > a = r::myName;
		System.out.println(a.apply("Nethaji"));
		
	}
	
	
	String myName(String a) {
		return a;
	}
}
