package com.Streams.Terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSumAvgTerminal {
	
	public static void main(String[] args) {
		
		List<Integer> a = Arrays.asList(1,2,3,4,5,6);
		// Summing int - Function
		int sum = a.stream().collect(Collectors.summingInt(x->x));
		System.out.println("Sum:" +sum);
		
		double avg = a.stream().collect(Collectors.averagingDouble(x->x));
		System.out.println("Average: "+ avg);
		
	}

}
