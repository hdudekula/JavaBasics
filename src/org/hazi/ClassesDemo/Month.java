package org.hazi.ClassesDemo;

import java.util.Scanner;

public class Month {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int value = scanner.nextInt();
		// int defaultV = 31;
		if (value > 31) {
			System.out.println("Invalid input");
		} else if (value < 31) {
			if (value == 1 || value == 21 || value == 31) {
				System.out.println(value + "st of Feb month");
			} else if (value == 2 || value == 22) {
				System.out.println(value + "nd of Feb month");
			} else if (value == 3 || value == 23) {
				System.out.println(value + "rd of Feb month");
			} else {
				System.out.println(value + "th of Feb Month");
			}
		}

	}

}
