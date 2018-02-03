package org.hazi.Generics;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList item = new ArrayList();
		item.add(1);
		item.add(2);
		item.add(3);
		item.add(4);
		
		printDouble(item);

	}
	
	private static void printDouble(ArrayList n){
		for(Object i : n){
			System.out.println((Integer) i*2);
		}
	}

}
