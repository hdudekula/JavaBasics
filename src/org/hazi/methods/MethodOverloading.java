package org.hazi.methods;

public class MethodOverloading {

	public static void main(String[] args) {
		//int inch;
		//double feet;
		//double centimeter;
		calcFeetandInchToCentimeter(4, 5);
		calcFeetandInchToCentimeter(50);
	}
	public static double calcFeetandInchToCentimeter(int inch, double feet){
		if (inch >= 0 && feet <= 12){
			double centimeter;
			centimeter = 2.54 * (12 * feet);
			centimeter += 2.54 * inch;
			System.out.println("calculated centimeters for " + feet +" feet " +inch + " inches  are :"+centimeter);
			return centimeter;
		}else {
			return -1;
		}
		
	}
	
	public static double calcFeetandInchToCentimeter(int inch){
		if (inch >= 0){
			double feet = inch / 12;
			int feetRemaining = inch % 12; 
			System.out.println("calcFeetandInchToCentimeter with one parameter is : "+feet);
			return calcFeetandInchToCentimeter(feetRemaining, feet);
		}else  {
			return -1;
		}
	}

}
