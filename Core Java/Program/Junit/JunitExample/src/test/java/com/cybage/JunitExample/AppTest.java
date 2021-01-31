package com.cybage.JunitExample;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	void testArray() {
		System.out.println("----APP TEST------TestArr-----");
		int exp[] = {1,2,3,4,5};
		int act[] = {1,2,3,4,5};
		assertArrayEquals(exp,act);
	}
}
