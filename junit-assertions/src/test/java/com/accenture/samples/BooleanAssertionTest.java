package com.accenture.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class BooleanAssertionTest {

	
	@Test
	void shouldReturnFalseWhenSatudary() {
		String nameOfDay = "Saturday";
		
		BooleanAssertion booleanAssertion = new BooleanAssertion();
		boolean isWeekDay = booleanAssertion.isWeekDay(nameOfDay);
		
		assertFalse(isWeekDay);
	}
	
	@Test
	void shouldReturnTrueWhenMonday() {
		String nameOfDay = "Monday";
		
		BooleanAssertion booleanAssertion = new BooleanAssertion();
		boolean isWeekDay = booleanAssertion.isWeekDay(nameOfDay);
		
		assertTrue(isWeekDay);
	}
	
	@Test
	void shouldReturnFalseWhenWrongInput() {
		String nameOfDay = "ABC";
		
		BooleanAssertion booleanAssertion = new BooleanAssertion();
		boolean isWeekDay = booleanAssertion.isWeekDay(nameOfDay);
		
		assertFalse(isWeekDay);
	}

}
