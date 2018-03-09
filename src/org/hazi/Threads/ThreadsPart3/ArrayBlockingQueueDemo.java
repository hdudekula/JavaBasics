package org.hazi.Threads.ThreadsPart3;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ArrayBlockingQueueDemo {
	public static final String EOF = "EOF";

	public static void main(String[] args) {
		ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);

		ExecutorService executorService = Executors.newFixedThreadPool(5);

		ArrayProducer aproducer = new ArrayProducer(buffer, ThreadColor.ANSI_BLUE);
		ArrayMyConsumer aconsumer1 = new ArrayMyConsumer(buffer, ThreadColor.ANSI_BLACK);
		ArrayMyConsumer aconsumer2 = new ArrayMyConsumer(buffer, ThreadColor.ANSI_GREEN);

		executorService.execute(aproducer);
		executorService.execute(aconsumer1);
		executorService.execute(aconsumer2);

		/*
		 * The Callable interface is similar to Runnable, in that both are
		 * designed for classes whose instances are potentially executed by
		 * another thread. A Runnable, however, does not return a result and
		 * cannot throw a checked exception.
		 */
		Future<String> future = executorService.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println(ThreadColor.ANSI_GREEN + "I'm being printed for the Callable class");
				return "This is the callable result";
			}

		});

		try {
			System.out.println(future.get());
		} catch (ExecutionException e) {
			System.out.println("Something went wrong");
		} catch (InterruptedException e) {
			System.out.println("Thread was interrupted");
		}

		executorService.shutdown();

	}

}

class ArrayProducer implements Runnable {
	private ArrayBlockingQueue<String> buffer;
	private String color;

	public ArrayProducer(ArrayBlockingQueue<String> buffer, String color) {
		this.buffer = buffer;
		this.color = color;
	}

	public void run() {
		Random random = new Random();
		String[] nums = { "1", "2", "3", "4", "5" };

		for (String num : nums) {
			try {
				System.out.println(color + " Adding ... " + num);
				buffer.put(num);

				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				System.out.println("Thread was interrupted");
			}
		}

		System.out.println("adding EOF and Exiting....");
		try {
			buffer.put("EOF");
		} catch (InterruptedException e) {

		}
	}

}

class ArrayMyConsumer implements Runnable {
	private ArrayBlockingQueue<String> buffer;
	private String color;

	public ArrayMyConsumer(ArrayBlockingQueue<String> buffer, String color) {
		this.buffer = buffer;
		this.color = color;
	}

	public void run() {
		while (true) {
			synchronized (buffer) {
				try {
					if (buffer.isEmpty()) {
						continue;
					}
					if (buffer.peek().equals("EOF")) {
						System.out.println("Exiting .... ");
						break;
					} else {
						System.out.println("Removed " + buffer.take());
					}
				} catch (InterruptedException e) {

				}
			}
		}
	}

}
