package com.junit.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Tests {
	@Test
	public void testApp() {
		int val1 = 5;
		int val2 = 6;

		String str = "Junit is working fine";
		String str1="Junit is working fine";
		String str2=null;
		
		String[] expectedArray = { "one", "two", "three" };
		String[] resultArray = { "one", "two", "four" };
		
		assertTrue(val1 < val2);
		assertSame(val1, val2);
		assertNull(str2);
		assertNotSame(str, str1);
		assertNotNull(str1);
		assertEquals("Junit is working fine", str);
		assertFalse(val1 < val2);
		assertArrayEquals(expectedArray, resultArray);
	}
}
