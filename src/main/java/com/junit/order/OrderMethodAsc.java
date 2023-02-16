package com.junit.order;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderMethodAsc {
	@Test
    public void testC() {
        System.out.println("third");
    }
    @Test
    public void testB() {
        System.out.println("second");
    }
    @Test
    public void testA() {
        System.out.println("first");
    }
}
