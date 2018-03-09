package org.hazi.Threads;

import static org.hazi.Threads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(ANSI_RED + "Hello from MyRunnable class");

	}

}
