package org.hazi.JavaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Challenge {

	public static void main(String[] args) throws IOException {

		try (FileWriter fileWriter = new FileWriter(
				"D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi//JavaIO/Challenge.txt")) {
			for (int i = 0; i < 5; i++) {
				fileWriter.write("writing to challenge text on line number " + i + "\n");
			}
		}

	}

	static {
		try (Scanner scanner = new Scanner(new BufferedReader(
				new FileReader("D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi//JavaIO/Challenge.txt")))) {
			scanner.useDelimiter(" ");
			while (scanner.hasNextLine()) {
				String nestedDescription = scanner.nextLine();
				String[] data = nestedDescription.split(" ");
				// int number = Integer.parseInt(data[2]);
				System.out.println("the bufferedReader is " + data.length);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
