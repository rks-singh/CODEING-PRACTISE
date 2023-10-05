package com.ravi.optional;

import java.util.Optional;

public class OptionalDemo2 {

	public static void main(String[] args) {
		if (ofNullable().isPresent()) {
			System.out.println(ofNullable().get());
		}
	}

	public static Optional<String> ofNullable() {
		Optional<String> stringOptional = Optional.ofNullable("Ravi Singh");
		return stringOptional;
	}
}
