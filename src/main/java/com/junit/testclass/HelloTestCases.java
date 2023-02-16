package com.junit.testclass;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.junit.app.HelloImpl;

public class HelloTestCases {
	String message = "Hello World";	
	   HelloImpl Message = new HelloImpl(message);

	   @Test
	   public void testPrintMessage() {
	      assertEquals(message,Message.printMessage());
	   }
}
