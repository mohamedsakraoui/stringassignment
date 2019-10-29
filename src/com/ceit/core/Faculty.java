package com.ceit.core;

public class Faculty extends Person{
	public int yrsOfExp;	 //years of experience
	public String wrkDomain; //work domain
	
	public Faculty(String _fName, String _lName, int _yrsOfExp, String _wrkDomain) {
		super(_fName,_lName);
		yrsOfExp=_yrsOfExp;
		wrkDomain=_wrkDomain;
	}
	
	public void introduce() {
		System.out.println("Faculty "+this.lName +" has: "+this.yrsOfExp+" years of experience.");
	}
	public void evaluate() {
		System.out.println("Students evaluated");
	}
	public String toString() {
		   return "First name : " + this.fName + ", Last name : " + this.lName 
				   + ", Years of experience : " + this.yrsOfExp + ", Work domain : " + this.wrkDomain;
		}
	
}
