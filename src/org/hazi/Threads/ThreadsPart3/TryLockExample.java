package org.hazi.Threads.ThreadsPart3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample {
	public static String EOF = "EOF";

	public static void main(String[] args) {
		List<String> buffer = new ArrayList<>();
		ReentrantLock bufferLock = new ReentrantLock();
		Producer2 producer = new Producer2(buffer, ThreadColor.ANSI_BLUE, bufferLock);
		Consumer2 consumer1 = new Consumer2(buffer, ThreadColor.ANSI_BLACK, bufferLock);
		Consumer2 consumer3 = new Consumer2(buffer, ThreadColor.ANSI_GREEN, bufferLock);
		Thread t1 = new Thread(producer);
		t1.start();
		new Thread(consumer1).start();
		new Thread(consumer3).start();

	}

}

class Producer2 implements Runnable {
	private List<String> buffer;
	private String color;
	private ReentrantLock bufferLock;

	public Producer2(List<String> buffer, String color, ReentrantLock bufferLock) {
		super();
		this.buffer = buffer;
		this.color = color;
		this.bufferLock = bufferLock;
	}

	public void run() {
		Random random = new Random();
		String[] nums = { "1", "2", "3", "4", "5" };

		for (String num : nums) {
			try {
				System.out.println(color + "Adding..." + num);
				bufferLock.lock();
				try {
					buffer.add(num);
				} finally {
					bufferLock.unlock();
				}

				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				System.out.println("Producer was interrupted");
			}
		}
		System.out.println(color + "Adding EOF and exiting...");
		bufferLock.lock();
		try {
			buffer.add("EOF");
		} finally {
			bufferLock.unlock();
		}
	}

}

class Consumer2 implements Runnable {
	private List<String> buffer;
	private String color;
	private ReentrantLock bufferLock;

	public Consumer2(List<String> buffer, String color, ReentrantLock bufferLock) {
		super();
		this.buffer = buffer;
		this.color = color;
		this.bufferLock = bufferLock;
	}

	public void run() {
		int counter = 0;

		while (true) {

			if (bufferLock.tryLock()) {
				try {
					if (buffer.isEmpty()) {
						continue;
					}
					System.out.println(color + " The Counter =" + counter);
					counter = 0;

					if (buffer.get(0).equals("EOF")) {
						System.out.println(color + "Exiting");
						break;
					} else {
						System.out.println(color + " Removed " + buffer.remove(0));
					}
				} finally {
					bufferLock.unlock();
				}
			} else {
				counter++;
			}

		}
	}
}
