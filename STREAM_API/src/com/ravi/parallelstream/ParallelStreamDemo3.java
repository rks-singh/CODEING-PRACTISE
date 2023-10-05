package com.ravi.parallelstream;

import java.util.List;
import java.util.stream.IntStream;

// Parallel Stream takes more time than Sequential Stream.
// because of boxing concept.
public class ParallelStreamDemo3 {
	public static void main(String[] args) {
		List<Integer> integerSum = IntStream.rangeClosed(1, 50).boxed().toList();
		System.out.println(sequentialSum(integerSum));
		System.out.println(parallelSum(integerSum));
	}

	public static int sequentialSum(List<Integer> integerSum) {

		long startTime = System.currentTimeMillis();
		int sum = integerSum.stream().reduce(0, Integer::sum);
		long endTime = System.currentTimeMillis();
		System.out.println("Duration of Execution of Sequential Stream ::" + (endTime - startTime));
		return sum;
	}

	public static int parallelSum(List<Integer> integerSum) {
		long startTime = System.currentTimeMillis();
		int sum = integerSum.parallelStream().reduce(0, Integer::sum);
		long endTime = System.currentTimeMillis();
		System.out.println("Duration of Execution of Parallel Stream ::" + (endTime - startTime));
		return sum;
	}
}
