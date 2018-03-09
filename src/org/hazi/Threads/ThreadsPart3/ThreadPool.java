package org.hazi.Threads.ThreadsPart3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPool {
	public static String EOF = "EOF";

	public static void main(String[] args) {
		List<String> buffer = new ArrayList<>();
		ReentrantLock bufferLock = new ReentrantLock();
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		PoolProducer2 producer = new PoolProducer2(buffer, ThreadColor.ANSI_BLUE, bufferLock);
		PoolConsumer2 consumer1 = new PoolConsumer2(buffer, ThreadColor.ANSI_BLACK, bufferLock);
		PoolConsumer2 consumer3 = new PoolConsumer2(buffer, ThreadColor.ANSI_GREEN, bufferLock);

		executorService.execute(producer);
		executorService.execute(consumer1);
		executorService.execute(consumer3);

		Future<String> future = executorService.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println(ThreadColor.ANSI_RED + " I am  being called in future method of callable");
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

class PoolProducer2 implements Runnable {
	private List<String> buffer;
	private String color;
	private ReentrantLock bufferLock;

	public PoolProducer2(List<String> buffer, String color, ReentrantLock bufferLock) {
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

class PoolConsumer2 implements Runnable {
	private List<String> buffer;
	private String color;
	private ReentrantLock bufferLock;

	public PoolConsumer2(List<String> buffer, String color, ReentrantLock bufferLock) {
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
