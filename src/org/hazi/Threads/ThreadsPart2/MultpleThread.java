package org.hazi.Threads.ThreadsPart2;

public class MultpleThread {

	public static void main(String[] args) {

		/*
		 * uncomment the commented blocks if you want demo of shared memory
		 * among diff threads
		 */
		// CountDown countdown = new CountDown();
		CountDown countdown1 = new CountDown();
		CountDown countdown2 = new CountDown();
		// CountDownThread t1 = new CountDownThread(countdown);
		CountDownThread t1 = new CountDownThread(countdown1);
		t1.setName("Thread 1");
		// CountDownThread t2 = new CountDownThread(countdown);
		CountDownThread t2 = new CountDownThread(countdown2);
		t2.setName("Thread 2");

		t1.start();
		t2.start();

	}

}

class CountDown {
	/*
	 * if we define the variable then memroy will be shared across the threads.
	 * Try to commenting below variable and define it in for loop, you see the
	 * diff!
	 */
	private int i;

	public void doCountDown() {

		String color;

		switch (Thread.currentThread().getName()) {
		case "Thread 1":
			color = ThreadColor.ANSI_BLUE;
			break;

		case "Thread 2":
			color = ThreadColor.ANSI_GREEN;
			break;

		default:
			color = ThreadColor.ANSI_BLACK;
			break;
		}

		for (i = 10; i > 0; i--) {
			System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
		}
	}
}

class CountDownThread extends Thread {
	private CountDown threadCountDown;

	public CountDownThread(CountDown countDown) {
		threadCountDown = countDown;
	}

	public void run() {
		threadCountDown.doCountDown();
	}

}
