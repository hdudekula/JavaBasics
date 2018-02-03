package org.hazi.JavaIO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsMain {

	public static void main(String[] args) {
//		int x = 20;
//		int y = 0;
//		System.out.println(divideLBYL(x,y));
//		System.out.println(divideEAFP(x,y));
		
	//	int x = getInt();
	//	int x = getIntLBYL();
		int x = getIntEAFP();
		System.out.println("The value of x "+x);

	}
	
	private static int getInt(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	private static int getIntLBYL(){
		System.out.println("Please enter x value ");
		boolean isValid = true;
		Scanner s = new Scanner(System.in);
		String input = s.next();
		for(int i=0; i<input.length(); i++){
			if(!Character.isDigit(input.charAt(i))){
				isValid = false;
				break;
			}
		}
		if(isValid){
			return Integer.parseInt(input);
		}
		return 0;
		
	}
	
	private static int getIntEAFP(){
		System.out.println("Please enter x value ");
		Scanner s = new Scanner(System.in);
		try{
		return s.nextInt();
		}catch(InputMismatchException e){
			return 0;
		}
	}
	
	/*LBYL means look before you leave*/
	private static int divideLBYL(int x, int y){
		if(y != 0){
			return x/y;
		}
		return 0;
	}
	
	/*EAFP means Easy to ask for forgiveness than permission*/
	private static int divideEAFP(int x, int y){
		try{
			return x/y;
		}catch(ArithmeticException e){
			return 0;
		}
	}

}
