package com.junit.test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.junit.main.Main;

public class Tests {
	@Test
	public void testZero() {
		int expect  = 0;
		int generated = new Main().calsi(0, 7, 2);
		assertEquals("Zero value Test : ",expect, generated);
		
	}
	
}
