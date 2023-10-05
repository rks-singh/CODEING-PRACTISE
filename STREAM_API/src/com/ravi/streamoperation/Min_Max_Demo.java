package com.ravi.streamoperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Min_Max_Demo {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
		System.out.println("Max Value =" + getMaxValue(integerList));
		System.out.println("Min value =" + getMinValue_1(integerList));
		getMinValue_2(integerList).ifPresent(System.out::println);
	}

	public static int getMaxValue(List<Integer> integerList) {
		return integerList.stream().reduce(0, (x, y) -> x > y ? x : y);
//        or
//                .reduce(0,Integer::max);
	}

	// not a good approach to find minimum value in list
	public static int getMinValue_1(List<Integer> integerList) {
		return integerList.stream().reduce(0, Integer::min);
	}

	// correct approach to find minimum value in list
	public static Optional<Integer> getMinValue_2(List<Integer> integerList) {
		return integerList.stream().reduce(Integer::min);
	}

}
