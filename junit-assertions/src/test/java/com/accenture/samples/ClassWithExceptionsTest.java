package com.accenture.samples;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassWithExceptionsTest {
	
	   @Test
	   public void ShouldReturnName() throws Exception
	   {
			 ClassWithExceptions classWithException = new ClassWithExceptions();
			                            
			 String result = classWithException.sayHello("amish");
			 Assertions.assertNotNull(result);
			            
	   }
	
	    @Test
	    public void ShouldReturnNullException() throws Exception {
	    	ClassWithExceptions classWithException = new ClassWithExceptions();		 
	    	assertThrows(NullPointerException.class, () -> classWithException.sayHello(null),"Name cannot be null");
			            
	   }
}
