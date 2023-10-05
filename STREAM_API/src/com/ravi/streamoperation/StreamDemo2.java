package com.ravi.streamoperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Ravi");
		names.add("Rohan");
		names.add("Sohan");
		names.add("Mohan");

		// collection can be modified any number of times.
		System.out.println(names);
		names.remove("Mohan");
		System.out.println(names);

		// stream can not be modified.
		// names.stream().add(); // no any method like add()

		// collection can be traversed any number of times.
		System.out.println(".".repeat(30));
		names.forEach(System.out::println);
		System.out.println(".".repeat(30));
		names.forEach(System.out::println);
		System.out.println(".".repeat(30));

		// stream can be traversed only once.

		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);
		System.out.println(".".repeat(30));
		// nameStream.forEach(System.out::println);

	}
}
