package org.hazi.AutoandUnboxing;

import java.util.Scanner;

public class ChallengeMain {
	private static Scanner scanner = new Scanner(System.in);
	private static ChallengeBank bank = new ChallengeBank("SuperBank");

	public static void main(String[] args) {
		boolean quit = false;
		int choice =0;
		printInstructions();
		while(!quit){
			System.out.println("Please enter your choice:");
			choice = scanner.nextInt();
			switch(choice){
			case 0 :
				printInstructions();
				break;
			case 1 :
				addBranchName();
				break;
			case 2 :
				viewBranchList();
				break;
			}
		}
		

	}
	
	public static void printInstructions(){
		System.out.println("press : \n" +
							"0. to view Instructions \n"+
							"1. to add branch name \n" +
							"2. to add customers to branch \n"+
							"3.to add transaction to customer \n" +
							"4. to view the customer list");
	}
	
	public static void addBranchName(){
		System.out.print("Please enter the branch name :");
		String name = scanner.nextLine();
		
			}
	
	public static void viewBranchList(){
		
		for(int i=0; i<bank.getBranches().size(); i++){
			System.out.println((i+1) +". " +bank.getBranches().get(i));
		}
	}

}
