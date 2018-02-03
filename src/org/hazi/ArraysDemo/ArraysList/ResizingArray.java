package org.hazi.ArraysDemo.ArraysList;

import java.util.Scanner;

public class ResizingArray {
	private static Scanner s = new Scanner(System.in);
	private static int[] baseData = new int[10];

	public static void main(String[] args) {
		System.out.println("please Enter the values : ");
		getInput();
		printArray(baseData);
		resizeArray();
		System.out.println("please enter values for resize method");
		getInput();
		printArray(baseData);

	}
	
	public static void getInput(){
		for(int i=0; i<baseData.length; i++){
			baseData[i] = s.nextInt();
		}
	}
	
	public static void printArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]+ " ");
		}
	}
	
	public static void resizeArray(){
		int[] original = baseData;
		
		baseData = new int[12];
		for(int i=0; i<original.length; i++){
			baseData[i] = original[i];
		}
	}

}
