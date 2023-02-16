package com.junit.order;

import org.junit.Test;
import org.junit.runner.OrderWith;
import org.junit.runner.manipulation.Alphanumeric;

@OrderWith(Alphanumeric.class)
public class OrderMethodTest {
	 @Test
	    public void testB() {
	        System.out.println("first");
	    }
	    @Test
	    public void testA() {
	        System.out.println("second");
	    }
	    @Test
	    public void testC() {
	        System.out.println("third");
	    }
}
