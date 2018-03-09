package org.hazi.Threads.ThreadsPart2;

import java.util.Random;

public class Messages {

	public static void main(String[] args) {
		Message message = new Message();
		(new Thread(new Writer(message))).start();
		(new Thread(new Reader(message))).start();

	}

}

class Message {
	private String message;
	private boolean empty = true;

	public synchronized String read() {
		while (empty) {
			try {
				/*
				 * lock can be released when the notifyAll() or notify() method
				 * executed
				 */
				wait();
			} catch (InterruptedException e) {

			}

		}
		empty = true;
		/*
		 * It calls all the waiting threads to release the lock for other
		 * waiting threads
		 */
		notifyAll();
		return message;
	}

	public synchronized void write(String message) {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {

			}

		}
		empty = false;
		this.message = message;
		notifyAll();
	}
}

class Writer implements Runnable {
	private Message message;

	public Writer(Message message) {
		this.message = message;
	}

	public void run() {
		String[] messages = { "Humpty Dumpty sit on a wall", "humpty dumpty had a great fall",
				"all king's horses and all king's man", "couldn't put humpty together again" };

		Random random = new Random();

		for (int i = 0; i < messages.length; i++) {
			message.write(messages[i]);
			try {
				Thread.sleep(random.nextInt(2000));
			} catch (InterruptedException e) {

			}

		}
		message.write("finished");
	}

}

class Reader implements Runnable {
	private Message message;

	public Reader(Message message) {
		this.message = message;
	}

	public void run() {
		Random random = new Random();
		for (String latestMessage = message.read(); !latestMessage.equals("finished"); latestMessage = message.read()) {
			System.out.println(latestMessage);
			try {
				Thread.sleep(random.nextInt(2000));
			} catch (InterruptedException e) {

			}
		}
	}
}