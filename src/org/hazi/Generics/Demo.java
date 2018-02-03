package org.hazi.Generics;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> item = new ArrayList<Integer>();
		item.add(1);
		item.add(2);
		item.add(3);
		item.add(4);
		
		printDouble(item);

	}
	
	private static void printDouble(ArrayList<Integer> n){
		for(int i : n){
			System.out.println(i*2);
		}
	}

}
