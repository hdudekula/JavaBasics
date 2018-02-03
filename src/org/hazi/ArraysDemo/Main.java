package org.hazi.ArraysDemo;

public class Main {
	
	
	
	public static void main(String[] args) {
		//int[] myVar = {2,3,4,5,6,7};
		//myVar[5] = 50;
		int[] myVar = new int[12];
		//for(int i=0; i<10; i++)
		for(int i=0; i<myVar.length; i++){
			myVar[i] = i*10;
		}
		printArray(myVar);
		//for(int i=0; i<10; i++)
		/*for(int i=0; i<myVar.length; i++){
		System.out.println("the value of "+i +" is," +myVar[i]);
		}*/
	}
	public static void printArray(int[] myArray){
		for(int i=0; i<myArray.length; i++){
			System.out.println("the value of "+i +" is, "+myArray[i]);
		}
	}

}
