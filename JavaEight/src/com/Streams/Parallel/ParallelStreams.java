package com.Streams.Parallel;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreams {

	public static void main(String[] args) {

		System.out.println("Available cores: " + Runtime.getRuntime().availableProcessors());

		String str[] = { "1", "2", "3", "4", "5" };

		System.out.println("Sequential Run");

		//sequentialRun(Arrays.stream(str));
		
		sequentialRun(Arrays.stream(str).parallel());

	}

	public static void sequentialRun(Stream<String> str) {
		str.forEach(s -> {
			System.out.println(System.nanoTime() + " Value :" + s + ":" + Thread.currentThread().getName());
			try {

			} catch (Exception e) {
				e.printStackTrace();
			}
		});

	}

}
