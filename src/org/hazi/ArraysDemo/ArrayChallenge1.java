package org.hazi.ArraysDemo;

import java.util.Scanner;

public class ArrayChallenge1 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println("the array length is " + a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "\n");
		}

	}

}
