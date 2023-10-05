package com.ravi.parallelstream;

import java.util.stream.IntStream;

public class ParallelStream {
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println("Sequential Stream ::" + sumSequentialStream());
		System.out.println("Parallel Stream ::" + sumParallelStream());

	}

	public static int sumSequentialStream() {
		return IntStream.rangeClosed(1, 100).sum();
	}

	public static int sumParallelStream() {
		return IntStream.rangeClosed(1, 100).parallel().sum();
	}
}
