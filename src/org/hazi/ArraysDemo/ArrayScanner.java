package org.hazi.ArraysDemo;

import java.util.Scanner;

public class ArrayScanner {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] myIntegers = getIntegers(5);
		for(int i=0; i<myIntegers.length; i++){
			System.out.println("the entered value of "+i + ", was"+myIntegers[i]);
		}
		System.out.println("the average value is "+getAverage(myIntegers));

	}
	
	public static int[] getIntegers(int numbers){
		System.out.println("Enter the "+numbers +" values \r");
		int[] myValues = new int[numbers];
		
		for(int i=0; i<myValues.length; i++){
			myValues[i] = scanner.nextInt();
		}
		return myValues;
	}
	
	public static double getAverage(int[] array){
		int sum =0;
		for(int i=0; i<array.length; i++){
			sum += array[i];
		}
		return (double) sum / (double) array.length;
	}


}
