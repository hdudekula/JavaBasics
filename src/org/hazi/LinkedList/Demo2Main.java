package org.hazi.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;



public class Demo2Main {

	public static void main(String[] args) {
		LinkedList<String> placestoVisit = new LinkedList<String>();
		/*commenting for the purpose of testing addInOrder method
		placestoVisit.add("bapatla");
		placestoVisit.add("guntur");
		placestoVisit.add("Vijayawada");
		placestoVisit.add("AndhraPradesh");
		placestoVisit.add("India");
		
		printList(placestoVisit);
		
		placestoVisit.add(1, "ponnur");
		printList(placestoVisit);
		
		placestoVisit.remove(1);
		printList(placestoVisit);
		*/
		
		addInOrder(placestoVisit, "bapatla");
		addInOrder(placestoVisit, "guntur");
		addInOrder(placestoVisit, "vijayawada");
		addInOrder(placestoVisit, "andhraPradesh");
		addInOrder(placestoVisit, "india");
		addInOrder(placestoVisit, "bapatla");
		addInOrder(placestoVisit, "bestapalem");
		printList(placestoVisit);
		visit(placestoVisit);
	}
	
	private static void printList(LinkedList<String> linkedList){
		Iterator<String> i = linkedList.iterator();
		while(i.hasNext()){
			System.out.println("now visiting :"+i.next());
		}
		System.out.println("===================");
	}
	
	public static boolean addInOrder(LinkedList<String> stringList, String newCity){
		ListIterator<String> stringIterator = stringList.listIterator();
		while(stringIterator.hasNext()){
		int comparator = stringIterator.next().compareTo(newCity);
		if(comparator == 0){
			System.out.println(newCity + " is already exists as destination");
			return false;
		}else if(comparator > 0 ){
			stringIterator.previous();
			stringIterator.add(newCity);
			return true;
		}else if(comparator < 0){
			
		}
		}
		stringIterator.add(newCity);
		return true;
	}
	
	private static void visit(LinkedList<String> cities){
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		ListIterator<String> listIterator = cities.listIterator();
		printmenu();
		
			if(cities.isEmpty()){
				System.out.println("no list of cities been found");
			}else {
				System.out.println("cities are: "+listIterator.next());
			}
		while(!quit){
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action){
			case 0:
				System.out.println("no places to visit..go home");
				quit = true;
				break;
				
			case 1:
				if(listIterator.hasNext()){
				System.out.println("now visiting : "+listIterator.next());
				} else {
					System.out.println("you have reached end of the list");
				}
				break;
				
			case 2:
				if(listIterator.hasPrevious()){
				System.out.println("now visiting :"+listIterator.previous());
				} else {
					System.out.println("we have reached starting of the list");
				}
				break;
				
			case 3:
				printmenu();
				break;
			}
			
			
			
			
		}
	}
	
	public static void printmenu(){
		System.out.println("choose action :"+
							" 0 - to go home" +
							" 1 - to go first place"+
							" 2 - to go to last place"+
							" 3 - to view the options");
	}

}
