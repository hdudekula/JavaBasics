package org.hazi.JavaIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {

	/*
	 * ByteStreams are used to read/write the binary data. It could be any data
	 * type, like Int, double, float and byte and even it allowed to read string
	 * even though string is a wrapper class.
	 */

	public static void main(String[] args) throws IOException {

		try (DataOutputStream byteFile = new DataOutputStream(new BufferedOutputStream(
				new FileOutputStream("D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi/JavaIO/ByteFile.dat")))) {

			for (int i = 0; i < 10; i++) {
				byteFile.writeInt(i);
				byteFile.writeUTF("Thanks for writing me");
				System.out.println("The byte file written with " + i + " data");

			}

		}

	}

	static {

		try (DataInputStream inputFile = new DataInputStream(new BufferedInputStream(
				new FileInputStream("D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi/JavaIO/ByteFile.dat")))) {
			boolean eof = false;
			while (!eof) {
				try {

					int number = inputFile.readInt();
					String description = inputFile.readUTF();
					System.out.println("the integer value is " + number + " and " + description);
				} catch (EOFException eo) {
					eof = true;
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
