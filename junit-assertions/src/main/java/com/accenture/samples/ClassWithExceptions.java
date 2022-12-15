package com.accenture.samples;

import java.lang.*;

public class ClassWithExceptions {
	
	//This could qualify for two exception tests. 
    //1. Assert it throws the correct exception. 
    // 2. Assert correct exception message
	
	public String sayHello(String yourName) throws Exception
    {
        if (yourName == null)
        {
            throw new NullPointerException(yourName);
        }
        return "Hello " + yourName;

    }

}
