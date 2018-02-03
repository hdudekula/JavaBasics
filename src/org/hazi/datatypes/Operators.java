package org.hazi.datatypes;

public class Operators {

	public static void main(String[] args) {
		double firstValue = 20;
		double secondValue = 80;
		double thirdValue = (firstValue + secondValue) * 25;
		double remainderValue = thirdValue % 40;
		System.out.println("the remainderValue is "+remainderValue);
		if (remainderValue <= 20)
			System.out.println("total value is over the limit");

	}

}
