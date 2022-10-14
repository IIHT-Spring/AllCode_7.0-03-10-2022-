package com.base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	// assertEquals(expected and actual)
	// assertArrayEquals(expectedArray and actualArray)
	// assertItreableEquals(expectedArray and actualArray)
	private MathUtils mathUtils;

	@BeforeEach
	void initEach() {
		mathUtils = new MathUtils();
	}

	@Nested
	class AddTest {
		
	  @Test
		void testAddTwoPositiveNumbers() {
			assertEquals(30, mathUtils.add(10, 20), "add method returing the sum of two positive numbers ");
		}
		@Test
		void testAddTwoNegativeNumbers() {
			assertEquals(-2, mathUtils.add(-1, -1), "add method returing the sum of two negative numbers ");
		}

		@Test
		void testAddoneNegativeNumberAndOnePositiveNumber() {
			assertEquals(0, mathUtils.add(-1, 1),
					"add method returing the sum of one negative numbers and one positive number ");
		}
	}
	
	@Test
	void testMultiply() {
		assertAll(
				() -> assertEquals(0, mathUtils.multiply(10, 0)),
				() -> assertEquals(10, mathUtils.multiply(10, 1)),
				() -> assertEquals(100, mathUtils.multiply(10,10))
				);
	}
	
	@Test
	void computeCircleArea() {
		assertEquals(314.1592653589793238, mathUtils.computeCircleArea(10), "should return right circle area");
	}
	
	@Test
	void TestDivide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.division(1, 0), "division should throw an error if there denominator is 0");
	}


}
