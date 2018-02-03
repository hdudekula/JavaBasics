package org.hazi.ArraysDemo.ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class MainGrocerList {
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstructions();
		while(!quit){
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice){
			case 0 :
				printInstructions();
				break;
			case 1 :
				groceryList.printGroceryList();
				break;
			case 2 :
				addItem();
				break;
			case 3 :
				modifyItem();
				break;
			case 4 :
				removeItem();
				break;
			case 5 :
				searchItem();
				break;
			case 6 :
				processArrayList();
				break;
			case 7 :
				quit = true;
				break;
			}
		}
	
	}
	public static void printInstructions(){
		System.out.println("Enter 0 to select your choice");
		System.out.println("Enter 1 to print the grocery list");
		System.out.println("Enter 2 to add Item to list");
		System.out.println("Enter 3 to modify Item in the list");
		System.out.println("Enter 4 to remove Item from the list");
		System.out.println("Enter 5 to search for Item in the list");
		System.out.println("Enter 6 to processArrayList");
		System.out.println("Enter 7 to quit the application");
	}
	
	public static void addItem(){
		System.out.print("Please enter the grocery item: ");
		groceryList.addGroceryList(scanner.nextLine());
		
	}
	
	public static void modifyItem(){
		System.out.print("Please enter Item number:");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter replacement item:");
		String Item = scanner.nextLine();
		groceryList.modifyGroceryList(itemNo-1, Item);
		
	}
	
	public static void removeItem(){
		System.out.print("Enter the Item number:");
		int itemNo = scanner.nextInt();
		groceryList.removeGroceryList(itemNo-1);
	}
	
	public static void searchItem(){
		System.out.print("Enter the Item:");
		String Item = scanner.nextLine();
		if(groceryList.findGroceryList(Item)!=null){
			System.out.println("found "+Item +" in our grocery list");
		}else {
			System.out.println("no seach results found for "+Item);
		}
	}
	
	/*This method allows us to access the array elements without using for loop */
	public static void processArrayList(){
		/* 1 way to access the array list*/
		ArrayList<String> newArray = new ArrayList<String>();
		newArray.addAll(groceryList.getGroceryList());
		/* another way to access the array list*/
		ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
		nextArray.size();
		
		/* this is another way to access array list */
		
		String[] myArray = new String[groceryList.getGroceryList().size()];
		myArray = groceryList.getGroceryList().toArray(myArray);
	}

}
