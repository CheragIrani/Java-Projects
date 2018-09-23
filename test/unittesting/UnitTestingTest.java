package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestingTest {

	@Test
	public void testSum() {
		int expected = 9;
		int actual = UnitTesting.sum(5, 4);
		assertEquals(expected, actual);
	}
	@Test
	public void testComputePositive() {
		int expected = -2;
		int actual = UnitTesting.compute(2);
		assertEquals(expected, actual);
	}
	@Test
	public void testComputeNegative() {
		int expected = 4;
		int actual = UnitTesting.compute(-2);
		assertEquals(expected, actual);
	}

}
