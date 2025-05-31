package com.Streams.Terminal;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamJoiningExample {

	public static void main(String[] args) {
		simpleJoining();

	}

	public static void simpleJoining() {

		char c[] = { 'a', 'b', 'c', 'd' }; // used to help join the char to String

		String a = Stream.of(c).map(arr->new String(arr)).collect(Collectors.joining());
		
		System.out.println(a);

		String result = IntStream.range(0, c.length).mapToObj(i -> String.valueOf(c[i])).collect(Collectors.joining("-"));

		System.out.println("Using Delimiter: " + result);
		
		String result1 = IntStream.range(0, c.length).mapToObj(i -> String.valueOf(c[i])).collect(Collectors.joining("-","{","}"));

		System.out.println("Using Delimiter: " + result1);

	}

}
