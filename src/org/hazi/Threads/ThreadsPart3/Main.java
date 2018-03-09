package org.hazi.Threads.ThreadsPart3;

import static org.hazi.Threads.ThreadsPart3.Main.EOF;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*We need to include the synchronized() to avoid the Thread Interference. without Synchronization, program will
 * throw IndexOutofBoundsException as while Producer is trying to write, at the same time, Consumer class will
 * try to remove from buffer */
public class Main {
	public static String EOF = "EOF";

	public static void main(String[] args) {
		List<String> buffer = new ArrayList<String>();
		MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_BLUE);
		MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_GREEN);
		MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN);

		new Thread(producer).start();
		new Thread(consumer1).start();
		new Thread(consumer2).start();

	}

}

class MyProducer implements Runnable {
	private List<String> buffer;
	private String color;

	public MyProducer(List<String> buffer, String color) {
		this.buffer = buffer;
		this.color = color;
	}

	public void run() {
		Random random = new Random();
		String[] nums = { "1", "2", "3", "4", "5" };

		for (String num : nums) {
			try {
				System.out.println(color + "Adding .... " + num);
				synchronized (buffer) {
					buffer.add(num);
				}
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				System.out.println("Thread was interrupted");
			}
		}
		System.out.println(color + "Adding EOF and exiting");
		synchronized (buffer) {
			buffer.add("EOF");
		}
	}

}

class MyConsumer implements Runnable {
	private List<String> buffer;
	private String color;

	public MyConsumer(List<String> buffer, String color) {
		this.buffer = buffer;
		this.color = color;
	}

	public void run() {

		while (true) {
			synchronized (buffer) {
				if (buffer.isEmpty()) {
					continue;
				}
				if (buffer.get(0).equals(EOF)) {
					System.out.println(color + "exiting");
					break;
				} else {
					System.out.println(color + "Removed " + buffer.remove(0));
				}
			}
		}
	}

}
