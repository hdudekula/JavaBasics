package org.hazi.ArraysDemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myArray = getArrayIntegers(5);
		for(int i=0; i<myArray.length; i++){
			System.out.println("the typed value of "+i +" was "+myArray[i]);
			
		}
		sortArrayList(myArray);

	}
	
	public static int[] getArrayIntegers(int numbers){
		System.out.println("Please Enter "+numbers + " numbers");
		int[] myValues = new int[numbers];
		
		for(int i=0; i<myValues.length; i++){
			myValues[i] = scanner.nextInt();
		}
		return myValues;
	}
	
	public static void printArray(int[] myArray){
		for(int i=0; i<myArray.length; i++){
			System.out.println("the sorted values are "+i +" was "+myArray[i]);
		}
	}
	
	public static int[] sortArrayList(int[] myArray){
		/*int[] temp = new int[sortedValues.length];*/
		int temp; 
		int[] sorted = Arrays.copyOf(myArray, myArray.length);
		for(int i=0; i<sorted.length; i++){
		System.out.println("the values copied for sortedValues " +i +" was " +sorted[i]);
		}
		boolean flag = true;
		while(flag){
			
		flag = false;
		for(int i=0; i<sorted.length-1; i++){
			
				if(sorted[i] < sorted[i+1]){
					temp = sorted[i+1];
					sorted[i+1] = sorted[i];
					sorted[i] = temp;
					flag = true;
			}
		}
		}
		
		for(int i=0; i<sorted.length;i++){
			System.out.println("the sorted values are "+sorted[i] );
		}
		return sorted;
	}
}


