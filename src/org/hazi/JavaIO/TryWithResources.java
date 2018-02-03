package org.hazi.JavaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) throws IOException {

		try (FileWriter resources = new FileWriter(
				"D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi/JavaIO/TryResources.txt");
				FileWriter resources1 = new FileWriter(
						"D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi//JavaIO/anotherTryResources.txt")) {
			for (int i = 0; i < 5; i++) {
				resources.write("Writing " + i + " line to TryResources text file" + "\n");
				for (int j = 0; j < 4; j++) {
					resources1.write("Writing to " + j + " nested text file " + "\n");
				}
			}
		}

	}

	static {
		Scanner scanner = null;
		try {
			scanner = new Scanner(
					new FileReader("D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi//JavaIO/TryResources.txt"));
			scanner.useDelimiter(" ");
			while (scanner.hasNextLine()) {
				String description = scanner.nextLine();
				System.out.println("imported " + description);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}

		try {
			scanner = new Scanner(new BufferedReader(new FileReader(
					"D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi//JavaIO/anotherTryResources.txt")));
			scanner.useDelimiter(" ");
			while (scanner.hasNextLine()) {
				String nestedDescription = scanner.nextLine();
				// String newLine = nestedDescription.concat("hazi");
				String[] data = nestedDescription.split(" ");
				int number = Integer.parseInt(data[2]);
				System.out.println("the bufferedReader is " + data.length + " and, second value of array is " + data[1]
						+ " and number is " + number);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
