package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input for new addition 
		
		System.out.print("Enter number of new students to enroll: ");
		Scanner inp = new Scanner(System.in);
		int num = inp.nextInt();
		Student[] students = new Student[num];
		
		//Create new student
		for(int i = 0; i<num; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			
		}
		for(int i = 0; i<num; i++) {
			System.out.println(students[i].displayInfo());
		}
	}

}
