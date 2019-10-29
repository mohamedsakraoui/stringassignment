package com.ceit.core;

public class Person {
	public String fName; //first name
	public String lName; //last name
	
	public Person(String _fName, String _lName) {
		fName=_fName;
		lName=_lName;
	}
	
	public String toString() {
		   return "First name : " + this.fName + ", Last name : " + this.lName;
		}
}
