package org.hazi.JavaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) {

		try (BufferedWriter bfile = new BufferedWriter(
				new FileWriter("D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi//JavaIO/BufferedWriter.txt"))) {
			for (int i = 0; i < 5; i++) {
				bfile.write("Writing to line number " + i + "\n");
			}
			System.out.println("writing completed");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static {
		try (BufferedReader rfile = new BufferedReader(
				new FileReader("D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi//JavaIO/BufferedWriter.txt"))) {

			String line = rfile.readLine();
			String[] lineArray = line.split(" ");
			int length = lineArray.length;

			for (int j = 0; j < length; j++) {
				System.out.println(line);
				System.out.println("Array words are " + lineArray[j]);
			}
			System.out.println("the length is " + length);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
