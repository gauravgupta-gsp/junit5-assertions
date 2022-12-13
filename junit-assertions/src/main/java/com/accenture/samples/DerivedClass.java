package com.accenture.samples;

public class DerivedClass implements Animal{

	private static DerivedClass instance; 
	
	public DerivedClass() {}
	
	
	public static DerivedClass getInstance() {		
		if(instance == null) {
			instance = new DerivedClass();
		}
		return instance;
	}
	
	public void move() {
		throw new UnsupportedOperationException("This method is yet to be implemented..");
		
	}
	

}
