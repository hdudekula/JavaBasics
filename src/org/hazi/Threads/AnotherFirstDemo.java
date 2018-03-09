package org.hazi.Threads;

import static org.hazi.Threads.ThreadColor.ANSI_RED;

public class AnotherFirstDemo extends Thread {

	@Override
	public void run() {
		System.out.println(ANSI_RED + "Hello from " + currentThread().getName());

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("5 sec done and I got up");
	}

}
