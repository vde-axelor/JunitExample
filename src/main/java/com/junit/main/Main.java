package com.junit.main;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.junit.testclass.HelloTestCases;

public class Main {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(HelloTestCases.class);
		
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	}

}
