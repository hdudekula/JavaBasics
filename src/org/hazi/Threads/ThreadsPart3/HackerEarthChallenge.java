package org.hazi.Threads.ThreadsPart3;

import java.util.Scanner;

//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class HackerEarthChallenge {
	public static void main(String args[]) throws Exception {

		Scanner scanner = new Scanner(System.in);
		long a = 0;
		long b = 0;
		for (int j = 0; j < 1; j++) {
			a = scanner.nextLong();
		}
		for (int k = 0; k < 1; k++) {
			b = scanner.nextLong();
		}

		long svalue;

		if (a > b) {
			svalue = a - b;
			System.out.println(svalue);
		} else {
			svalue = b - a;
			System.out.println(svalue);
		}

		boolean condition = true;
		int counter = 0;

		while (condition) {
			for (long i = 1; i <= svalue; i++) {
				if (a % i == 0 && b % i == 0) {
					System.out.println("values of i is " + i);
					counter++;
				}
			}
			condition = false;
		}

		System.out.println(counter);

	}
}
