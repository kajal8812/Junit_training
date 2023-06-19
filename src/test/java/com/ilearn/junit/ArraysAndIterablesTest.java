package com.ilearn.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

class ArraysAndIterablesTest {

	@Test
	void test_ArrayEqual() {
		String[] s1 = { "hello", "world" };
		String[] s2 = { "hello", "world" };
		assertArrayEquals(s1, s2);
	}

	@Test
	void test_iterables() {
		List<Integer> i1 = List.of(1, 2, 3);
		List<Integer> i2 = List.of(1, 2, 3);
		assertIterableEquals(i1, i2);

		Set<Integer> hs1 = new HashSet();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		assertIterableEquals(hs1, i1);
	}

}
