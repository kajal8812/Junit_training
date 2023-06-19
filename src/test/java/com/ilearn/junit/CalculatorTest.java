package com.ilearn.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class CalculatorTest {

	@BeforeEach
	void before_each(TestInfo t) {
		System.out.println("prepare environmentbefore test " + t.getDisplayName());
	}

	@AfterEach
	void after_each(TestInfo t) {
		System.out.println("cleanup environmentbefore test " + t.getDisplayName());
	}

	@BeforeAll
	static void before_all(TestInfo t) {
		System.out.println("getting all connections " + t.getDisplayName());
	}

	@AfterAll
	static void after_all(TestInfo t) {
		System.out.println("closing all connections " + t.getDisplayName());
	}

	@DisplayName("successful addition")
	@Test
	void test_addition_success() {
		assertEquals(3, Calculator.add(1, 2));
	}

	@DisplayName("failure addition")
	@Test
	void test_addition_failure() {
		assertNotEquals(0, Calculator.add(1, 0));
	}

	@Test
	void test_TrueResponse() {
		assertTrue(Calculator.multiply(3, 6).compareTo(18) == 0);
	}

	@Test
	void test_nullResponse() {
		assertNull(Calculator.divide(1, 0));
	}

	@Test
	void test_exceptions() {
		assertThrows(NullPointerException.class, () -> Calculator.add(null, null));
	}

}
