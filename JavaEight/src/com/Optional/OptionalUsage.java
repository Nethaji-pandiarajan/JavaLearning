package com.Optional;

import java.util.Optional;

public class OptionalUsage {
	

	
	public static void main(String[] args) {
		
//		
//		  Optional<String> s = Optional.ofNullable("java"); 
//		  Optional<String> a = 
//		  Optional.ofNullable(null); System.out.println(s); // Optional[java]
//		  System.out.println(a); // Optional.empty System.out.println(s.get()); // To
//		  
//		  Optional<String> oo = Optional.ofNullable(getName(null));
//		  System.out.println(oo);
//		 
//		
//		System.out.println(Optional.empty());
//		
//		isPresentCheck();
		
		System.out.println(ofMethod());
		
		
	}
	
	public static String getName(String name) {
		if(name != null) {
			return name;
		}else {
			return "Not found";
		}
	}
	
	public static void isPresentCheck() {
		Optional<String> name = Optional.ofNullable(null);
		name = Optional.empty();
		System.out.println(name.isPresent() ? name.get() : "Not found");
		
	}
	
	public static String ofMethod() {
		String name = null;
		Optional<String> a = Optional.of(name); // not nullable if you know this (or it will throw Null pointer exception)
		if(a.isPresent()) {
			return name;
		}else {
			return "Not null";
		}
		
	}

}
