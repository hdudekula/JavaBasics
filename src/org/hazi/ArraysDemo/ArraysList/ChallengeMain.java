package org.hazi.ArraysDemo.ArraysList;

import java.util.Scanner;

public class ChallengeMain {
	private static Scanner scanner = new Scanner(System.in);
	private static ChallengeMobilePhone myMobile = new ChallengeMobilePhone("9731161971");

	public static void main(String[] args) {
		boolean quit = false;
		startPhone();
		printInstructions();
		while(!quit){
			System.out.println("Enter your action: (6 to show available actions");
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action){
			case 0:
				System.out.println("phone is shutting down....");
				quit = true;
				break;
			case 1:
				printContacts();
				break;
			case 2:
				addContacts();
				break;
				
			case 3:
				updateContacts();
				break;
				
			case 4:
				removeContacts();
				break;
				
			case 5:
				queryContacts();
				break;
				
			case 6:
				printInstructions();
				break;
			}
		}

	}
	
	private static void printContacts(){
		myMobile.printContacts();
	}
	private static void startPhone(){
		System.out.println("Phone is starting....");
	}
	
	private static void addContacts(){
		System.out.println("Please enter the name:");
		String name = scanner.nextLine();
		System.out.println("please enter the phone:");
		String phone = scanner.nextLine();
		ChallengeContacts newContact = new ChallengeContacts(name, phone);
		if(myMobile.addContact(newContact)){
			System.out.println("contact added, name : " +name +" phone : "+phone);
		}else
		{
		System.out.println("record is already exists "+name);
		}
	}
	
	private static void updateContacts(){
		System.out.println("Please enter the existing contact:");
		String name = scanner.nextLine();
		ChallengeContacts existingContact = myMobile.queryContact(name);
		if(existingContact == null){
			System.out.println("No records found");
			return;
		}
		
		System.out.println("Please enter new name");
		String newName = scanner.nextLine();
		System.out.println("Please enter new number");
		String newPhone = scanner.nextLine();
		ChallengeContacts existingContactRecord = new ChallengeContacts(newName, newPhone);
		if(myMobile.updateContact(existingContact, existingContactRecord)){
			System.out.println("Successfully updated record");
		}else {
			System.out.println("Error while updating record");
		}
	}
	
	
	private static void removeContacts(){
		System.out.println("Please enter the existing contact:");
		String name = scanner.nextLine();
		ChallengeContacts existingContact = myMobile.queryContact(name);
		if(existingContact == null){
			System.out.println("No records found");
			return;
		}
		
		if(myMobile.removeContact(existingContact)){
			System.out.println("Successfully deleted");
		}else{
			System.out.println("error while deleting contact");
		}
	}
	
	private static void queryContacts(){
		System.out.println("Please enter the existing contact:");
		String name = scanner.nextLine();
		ChallengeContacts existingContact = myMobile.queryContact(name);
		if(existingContact == null){
			System.out.println("No records found");
			return;
		}
		System.out.println("name :" +existingContact.getName() + " phone "+ existingContact.getPhoneNumber());
	}
	private static void printInstructions(){
		System.out.println("\n Available actions:\n press");
		System.out.println("0 - to shutdown \n" +
							"1 - to print Contacts \n" +
							"2 - to add contact \n" +
							"3 - to update contact list \n" +
							"4 - to delete contact \n" +
							"5 - search for a contact \n "+
							"6 - to print available actions");
		System.out.println("Enter your choice:");
	}
	
	
	
	 

}
