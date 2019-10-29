package com.ceit.core;

public class Student extends Person{
	public int gradYear;      //graduation year
	public String crseName;   //course name
	
	public Student(String _fName, String _lName, int _gradYear, String _crseName) {
		super(_fName,_lName);
		gradYear=_gradYear;
		crseName=_crseName;
	}
	public void introduce() {
	System.out.println("Student "+this.fName+" is graduated in: "+this.gradYear);	
	}
	public void feedback() {
		System.out.println("Feedback submitted");
	}
	public String toString() {
		   return "First name : " + this.fName + ", Last name : " + this.lName 
				   + ", Graduation year : " + this.gradYear + ", Course name : " + this.crseName;
		}
	
}
