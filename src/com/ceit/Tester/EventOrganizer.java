package com.ceit.Tester;
import com.ceit.core.Person;
import com.ceit.core.Student;
import com.ceit.core.Faculty;
import java.util.Scanner;

	public class EventOrganizer {
		
	public static void menu() {
		System.out.println("*******************************");
		System.out.println("|********** MENU *************|");
		System.out.println("*******************************");
		System.out.println("1- Register faculty ");
		System.out.println("2- Register student ");
		System.out.println("3- Display members ");
		System.out.println("4- Introduce faculty ");
		System.out.println("5- Introduce student ");
		System.out.println("0- Quit ");
	}
	public static Person registerMembers() {
		Person per = new Person("","");
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter person first name: ");
		per.fName=sc.next();
		System.out.print("Enter person last name: ");
		per.lName=sc.next();
		return per;
	}
	public static void displayInfo( Person [] per ) {
		System.out.println(" *** Registered members info *** ");
		for(int i=0;i<per.length;i++) {
			System.out.println("Member "+(i+1)+", "+per[i].toString());
		}
	}
	public static void introduceStudent(Student stud) {
		 stud.introduce();
		}
	public static void introduceFaculty(Faculty fact) {
		 fact.introduce();
	}
	
	public static void main(String[] args) {
		int capacity=1;
		int choice=1;
		int counter=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the event capacity: ");
		capacity=sc.nextInt();
		Person [] pers= new Person[capacity];
				
		for (int i =  0 ; i < pers.length ; i++) {       //initialization of the Person array
			pers[i] =  new Person("","");  
	    }
		while( choice!=0 ) {
			menu(); 									//displaying the menu
			System.out.print("Enter your choice: ");
			choice=sc.nextInt();	
			switch (choice) {
				case 1: 
					if(counter<capacity) 				//register a faculty only if capacity is not reached
						{
							pers[counter]=registerMembers();
							counter++;
						}
					else
						{
							System.out.println(" !!! The event area reached its max capacity !!! ");
						}
					
					break;
				case 2: 
					if(counter<capacity) 				//register a student only if capacity is not reached
						{
							pers[counter]=registerMembers();
							counter++;
						}
					else
						{
							System.out.println(" !!! The event area has reached its max capacity !!! ");
						}
					break;
				case 3: displayInfo(pers);
					break;
//				case 4: introduceFaculty(facult[Stcounter]);
//					break;
//				case 5: introduceStudent(stds[Fccounter]);
//					break;
				case 0: System.out.println(" Thanks for visiting our event ");
				break;	
				default: System.out.println(" !! Please enter a valid choice !! ");
					break;
			}
		}
	}
}

