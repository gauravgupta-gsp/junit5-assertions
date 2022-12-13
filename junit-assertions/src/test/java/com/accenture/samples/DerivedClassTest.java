package com.accenture.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DerivedClassTest {

	@Test
	public void compareTwoSameClassInstances() {
		DerivedClass instance1 = DerivedClass.getInstance();
		DerivedClass instance2 = DerivedClass.getInstance();
		
		assertInstanceOf(Animal.class, instance2);
	}
	
	@Test
	public void compareTwoInstances() {
		DerivedClass instance1 = DerivedClass.getInstance();
		DerivedClass instance2 = DerivedClass.getInstance();
			
		assertEquals(instance1, instance2);
	} 

}
