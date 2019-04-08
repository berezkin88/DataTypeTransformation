package com.javaTasks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DigitsSumTest {

	@Test
	void testSumInt123() {
		DigitsSum ds = new DigitsSum(123);
		
		assertEquals(6, ds.sum());
	}
	
	@Test
	void testSumStr123() {
		DigitsSum ds = new DigitsSum(123);
		
		assertEquals(6, ds.sumStr());
	}
	
	

}
