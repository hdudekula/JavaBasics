package org.hazi.JavaIO;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MultiCatchException {

	public static void main(String[] args) {
		try{
		int result = divide();
		System.out.println(result);
		/*This will check for either Arithmetic OR NoSuchElementExcetpion. And it added in java 7 */
		}catch(ArithmeticException | NoSuchElementException e){
			System.out.println(e.toString());
			System.out.println("unable to perform the operation");
		}

	}
	
	/*YOu can remove comments in order to test multi catch blocks.  */
	private static int divide(){
		int x,y;
//		try{
			x = getInt();
			y = getInt();
			System.out.println("value of x "+x +" and " +" y "+y);
			return x/y;
//		}catch(NoSuchElementException e){
//			throw new NoSuchElementException("no valid input");
//		}catch(ArithmeticException e){
//			throw new ArithmeticException("divide by 0 is not valid");
//		}
	}
	
	private static int getInt(){
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a valid digit");
		while(true){
			try{
				return s.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Please enter a valid digit numeric number only");
				s.nextLine();
				
			}
		}
		
	}

}
