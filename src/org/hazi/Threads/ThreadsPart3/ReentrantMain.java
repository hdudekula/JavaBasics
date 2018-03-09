package org.hazi.Threads.ThreadsPart3;

import static org.hazi.Threads.ThreadsPart3.ReentrantMain.EOF;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantMain {
	public static String EOF = "EOF";

	public static void main(String[] args) {
		List<String> buffer = new ArrayList<String>();
		ReentrantLock bufferLock = new ReentrantLock();
		MyProducer1 producer = new MyProducer1(buffer, ThreadColor.ANSI_BLUE, bufferLock);
		MyConsumer1 consumer1 = new MyConsumer1(buffer, ThreadColor.ANSI_GREEN, bufferLock);
		MyConsumer1 consumer2 = new MyConsumer1(buffer, ThreadColor.ANSI_CYAN, bufferLock);

		new Thread(producer).start();
		new Thread(consumer1).start();
		new Thread(consumer2).start();

	}

}

class MyProducer1 implements Runnable {
	private List<String> buffer;
	private String color;
	private ReentrantLock bufferLock;

	public MyProducer1(List<String> buffer, String color, ReentrantLock bufferLock) {
		this.buffer = buffer;
		this.color = color;
		this.bufferLock = bufferLock;
	}

	public void run() {
		Random random = new Random();
		String[] nums = { "1", "2", "3", "4", "5" };

		for (String num : nums) {
			try {
				System.out.println(color + "Adding .... " + num);
				bufferLock.lock();
				buffer.add(num);
				bufferLock.unlock();

				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				System.out.println("Thread was interrupted");
			}
		}
		System.out.println(color + "Adding EOF and exiting");
		/*
		 * Commenting below block of code to give demo on ReentrantLock with try
		 * finally block
		 */
		// bufferLock.lock();
		// buffer.add("EOF");
		// bufferLock.unlock();
		/*
		 * It is always preferred to place the ReentrantLock inside try finally
		 * block. Finally block ensures to unlock no matter why the condition
		 * failed.
		 */

		bufferLock.lock();
		try {
			buffer.add("EOF");
		} finally {
			bufferLock.unlock();
		}

	}

}

class MyConsumer1 implements Runnable {
	private List<String> buffer;
	private String color;
	private ReentrantLock bufferLock;

	public MyConsumer1(List<String> buffer, String color, ReentrantLock bufferLock) {
		this.buffer = buffer;
		this.color = color;
		this.bufferLock = bufferLock;
	}

	public void run() {

		while (true) {
			// bufferLock.lock();
			bufferLock.lock();
			try {
				if (buffer.isEmpty()) {
					continue;
				}
				if (buffer.get(0).equals(EOF)) {
					System.out.println(color + "exiting");
					break;
				} else {
					System.out.println(color + "Removed " + buffer.remove(0));
				}

			} finally {
				bufferLock.unlock();

			}
			/*
			 * if (buffer.isEmpty()) { bufferLock.unlock(); continue; } if
			 * (buffer.get(0).equals(EOF)) { System.out.println(color +
			 * "exiting"); bufferLock.unlock(); break; } else {
			 * System.out.println(color + "Removed " + buffer.remove(0)); }
			 */
			// bufferLock.unlock();

		}
	}

}
