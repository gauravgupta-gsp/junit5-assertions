package com.accenture.samples;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualitySampleTest {
	
	private EqualitySample equalitySample = new EqualitySample();
	  
	 @Test
	 public void ShouldReturnAmishGetWelcomMessageTest()
    {
		String expected = "amish";

	    String actual = equalitySample.GetWelcomeMessage(expected);
		            
		// string equality assertion
	    Assertions.assertEquals("Welcome " + expected, actual);
		                
	}

	@Test
    public void GetTextAppendWithRandomNumberTest()
   {
	  String expected = "Hello";

	  String actual = equalitySample.GetTextAppendWithRandomNumber(expected);

	  // string non-equality assertion
	  Assertions.assertNotEquals(expected, actual);
		            
   }


   @Test
   public void TwoNumberAdditonTest()
  {

    int i = 10;  
    int j = 20;

    int actual = equalitySample.AddNumbers(i, j);

    //equality assertion
    Assertions.assertEquals((i + j), actual);
		            
  }

 @Test
 public void GetMaturityAmountTest()
 {
	 int principal = 100;
	 int interest = 8;

	 double MaturityAmount = equalitySample.GetMaturityAmount(principal, interest);

	//delta assertion
	 Assertions.assertEquals(principal + interest, MaturityAmount);

    //equality assertion
	 Assertions.assertEquals(100 + (100 * 8 / 100), MaturityAmount);
	 
 }

 @Test
 public void WeekendDaysTest()
 {

	List<String> weekDays = new ArrayList<String>();
	weekDays = equalitySample.WeekendDays();

    int countOfWeekDays = weekDays.size();

	// non nullable assertion 
    Assertions.assertNotNull(countOfWeekDays);

    weekDays.add("monday");
    weekDays.add("tuesday");
    weekDays.add("wedensday");
    weekDays.add("friday");

    // delta assertion 
    Assertions.assertEquals(countOfWeekDays + 4, weekDays.size());
		            
  }

}
