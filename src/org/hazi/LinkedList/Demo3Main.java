package org.hazi.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo3Main {

	public static void main(String[] args) {
		LinkedList<String> linkedli = new LinkedList<String>();
		boolean goingForward = true;
		
		linkedli.add("bread");
		linkedli.add("jam");
		linkedli.add("biscuit");
		linkedli.add("milk");
		linkedli.add("sugar");
		
		printValues(linkedli);
		
		ListIterator<String> list = linkedli.listIterator(linkedli.size());
		while(list.hasPrevious()){
			System.out.println(list.previous());
		}
	
		

	}
	
	public static void printValues(LinkedList list){
		ListIterator<String> lis = list.listIterator();
		while(lis.hasNext()){
		System.out.println("supplement is :"+lis.next());
		
	}
		System.out.println("==================");
	}
	
	
	
	
		
	
}
