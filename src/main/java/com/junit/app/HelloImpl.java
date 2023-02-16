package com.junit.app;

public class HelloImpl {
	private String message;
	
	   public HelloImpl(String message){
	      this.message = message;
	   }
	      
	   public String printMessage(){
	      System.out.println(message);
	      return message;
	   }   
}
