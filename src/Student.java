package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String student_id;
	private String courses="" ;
	private int tuition_balance;
	private static int costOfcourse = 2000;
	private static int id = 100;
	
	//Constructor
	public Student() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter Student's first name: ");
		this.firstname = inp.nextLine();
		
		System.out.print("Enter Student's last name: ");
		this.lastname = inp.nextLine();
		
		System.out.print("1 - Freshman\n2- Sophomore\n3 - Junior\n4 - Senior\nEnter Student's class level: ");
		this.gradeyear = inp.nextInt();
			
		setStudentID();
		
	}
	
	//Generate ID
	private void setStudentID() {
		// Grade level + Static iD
		id++;
		this.student_id =  gradeyear + "" + id;
		
	}
	
	//Enroll in courses	
	public void enroll() {
		do {
			System.out.print("Enter course to enroll(E to exit): ");
			Scanner inp = new Scanner(System.in);
			String course = inp.nextLine();
			if(!course.equals("E")) {
				courses = courses + "\n  " + course;
				tuition_balance += costOfcourse;
			}
			else {
				break;
				}
		} while(1!=0);
	}
		
	
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is: Rs." + tuition_balance);
	}
	//Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment amount :Rs. ");
		Scanner inp = new Scanner(System.in);
		int pay = inp.nextInt();
		tuition_balance -= pay;
		System.out.println("Thank you for your payment of Rs." + pay);
		viewBalance();
	}
	
	//Show status
	public String displayInfo() {
		return "Name : "+ firstname +" "+ lastname +
				"\nGrade Level : "+ gradeyear +
				"\nStudent ID : "+ student_id +
				"\nCourses Enrolled:" +  courses +
				"\nTotal Balance: Rs. "+ tuition_balance ;
	}
	
}

