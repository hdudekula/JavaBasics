package org.hazi.ArraysDemo;

import java.util.Scanner;

public class SampleProgram {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] sampleArray = new int[5];
		
		System.out.println("Please enter the values :");
		for(int i=0; i<sampleArray.length; i++){
			sampleArray[i] = s.nextInt();
		}
		for(int i=sampleArray.length-1; i>=0; i--){
			System.out.println("the values are "+ sampleArray[i]);
		}
		

	}

}
