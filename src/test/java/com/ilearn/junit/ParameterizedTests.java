package com.ilearn.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTests {

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3 })
	void testValueSource(Integer n) {
		assertEquals(Math.pow(n, 2), Calculator.multiply(n, n).doubleValue(), "square is incorrect");
	}

}
