package org.hazi.AutoandUnboxing;


import java.util.Scanner;

public class PracticeSchool {
private static Scanner scanner = new Scanner(System.in);
private static PracticeStudents student = new PracticeStudents();

public static void main(String[] args){
	boolean quit = false;
	
	
	while(!quit){
		int choice = 0;
		System.out.println("Please enter your choice:");
		choice = scanner.nextInt();
		scanner.nextLine();
	switch(choice){
	case 0: 
		System.out.println("1. to add students and 2.to view the students");
		break;
		
	case 1:
		studentAddition();
		break;
		
	case 2:
		viewStudent();
		break;
		
	case 3:
		quit = true;
		break;
		
	case 4:
		modify();
		break;
		
	}
	}
	
	
	
}

private static void studentAddition() {
	System.out.println("Enter the student name:");
	
	student.addStudents(scanner.nextLine());
	}

private static void viewStudent(){
	student.printStudents();
}

private static void modify(){
	System.out.println("please enter the position :");
	int p = scanner.nextInt();
	System.out.println("please enter the new name");
	String newName = scanner.nextLine();
	scanner.nextLine();
	student.modifyStudentNames(p-1, newName);
}

	
	
	

}
