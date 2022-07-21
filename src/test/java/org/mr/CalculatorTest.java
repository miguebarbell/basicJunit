package org.mr;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
	@Test
	@DisplayName("3 + 2 = 5")
	void addTwoIntegers() {
		int result = Calculator.add(3, 2);
		assertEquals(5, result);
	}

	@Test
	@DisplayName("3.3 + 1 = 4.3")
	void addDoubleWithInteger() {
		double result = Calculator.add(3.3, 1);
		assertEquals(4.3, result);
	}

	@Test
	@DisplayName("3.3 + 1.3 = 4.6")
	void addTwoDouebles() {
		double result = Calculator.add(3.3, 1.3);
		assertEquals(4.6, result);
	}


}
