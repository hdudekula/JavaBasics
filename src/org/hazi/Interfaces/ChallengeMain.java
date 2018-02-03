package org.hazi.Interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public class ChallengeMain {

	public static void main(String[] args) {
		ChallengePlayer hazi = new ChallengePlayer("hazi", 20, 100);
		System.out.println(hazi.toString());
		hazi.setStrength(80);
		saveObject(hazi);
		System.out.println(hazi);
		hazi.setWeapon("doubleside sword");
		saveObject(hazi);
		loadObject(hazi);
		System.out.println(hazi);
		
		ChallengeISavable wereWolf = new ChallengeMonster("haziD", 50, 90);
		System.out.println(wereWolf);
		saveObject(wereWolf);

	}
	
	public static ArrayList<String> readValues(){
		ArrayList<String> values = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index =0;
		System.out.println("Please enter your choice \n"+
							" 0 - to quit \n"+
							" 1 - to enter values ");
		
		while(!quit){
			System.out.println("choose :");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice){
			case 0 : 
				quit = true;
				break;
				
			case 1 :
				System.out.print("Enter a string : ");
				String stringInput = scanner.nextLine();
				values.add(index, stringInput);
				index++;
				break;
			}
		}
		return values;
	}
	
	public static void saveObject(ChallengeISavable objectToSave){
		for(int i=0; i<objectToSave.write().size(); i++){
			System.out.println("Saving "+objectToSave.write().get(i) + " to storage place");
			
		}
	}
	
	public static void loadObject(ChallengeISavable objectToLoad){
		ArrayList<String> values = readValues();
		objectToLoad.read(values);
	}

}
