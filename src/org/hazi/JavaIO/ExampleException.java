package org.hazi.JavaIO;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExampleException {

	public static void main(String[] args) {
		int result = divide();
		System.out.println(result);

	}
	
	private static int divide(){
		int x,y;
		try{
		x = getInt();
		y = getInt();
		}catch(NoSuchElementException e){
			throw new ArithmeticException("input value is invalid");
		}
		System.out.println("value of x "+x +" and y is "+y);
		try{
			return x/y;
		}catch(ArithmeticException e){
			throw new ArithmeticException("divide by zero is not allowed");
		}
	}
	
	private static int getInt(){
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter digit ");
		while(true){
			try{
				return s.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Please enter the valid numeric value");
				s.nextLine();
			}
		}
		
	}

}
