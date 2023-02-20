package org.ssglobal.training.codes.test;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ssglobal.training.codes.MathOp;

public class TestMathOp {
	private MathOp mo;
	
	@BeforeEach
	public void setup() {
		mo = new MathOp();
	}
	
	@AfterEach
	public void teardown() {
		mo = null;
	}
	
	@Test
	public void testDivOp() {
		assertDoesNotThrow(() -> {
			int result = mo.div(10, 2);
			assertEquals(5, result);
		});
	}
	
	@Test
	public void testDivOpRainy() {
		assertThrows(ArithmeticException.class,() -> {
			int result = mo.div(10, 0);
			assertEquals(5, result);
		});
	}
	
	@Test
	public void testDisplay() {
		int[] testdata = {10,20,30,40};
		int[] result = mo.display(testdata);
		assertSame(testdata, result);
	}
	
	@Test
	public void testDisplayRainy() {
		int[] testdata = null;
		int[] result = mo.display(testdata);
		assertSame(testdata, result);
	}
	
	@Test
	public void testAddOp() {
		int result = mo.add(2, 3);
		assertEquals(5, result);
	}
}
