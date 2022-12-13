package com.accenture.samples;

public class BooleanAssertion {
	
	String [] dayOfWeek = new String [] {"Monday", "Tuesday", "Wednesday","Thursday","Friday"};
		
		
		
	

	public boolean isWeekDay(String nameOfADay) 
	{
		boolean flag = false;
		for(String day : dayOfWeek) {
			if(day.equalsIgnoreCase(nameOfADay)) {
				flag =true;
			}
		}
		return flag;
	}
}
