package org.hazi.Threads;

import static org.hazi.Threads.ThreadColor.ANSI_BLUE;
import static org.hazi.Threads.ThreadColor.ANSI_CYAN;

public class FirstDemo {

	public static void main(String[] args) {
		System.out.println(ANSI_BLUE + "Hello from main thread");

		final Thread anotherThread = new AnotherFirstDemo();
		anotherThread.setName("===Another Thread===");
		anotherThread.start();

		new Thread() {
			public void run() {
				System.out.println(ANSI_CYAN + "hello from ananymous class thread");
			}
		}.start();

		Thread myRunnableThread = new Thread(new MyRunnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello from ananymous myrunnableThread");

				try {
					// anotherThread.join();
					/*
					 * Below join method allows to define the timeout while
					 * waiting for another thread
					 */
					anotherThread.join(2000);
					System.out.println("Another thread got completed or timedout, so i am running");
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}

		});
		myRunnableThread.start();

		/* Use below line to interrupt the sleeping thread */
		// anotherThread.interrupt();
		System.out.println("hello again from main");

	}

}
