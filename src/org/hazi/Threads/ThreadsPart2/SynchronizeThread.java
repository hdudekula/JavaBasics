package org.hazi.Threads.ThreadsPart2;

/*Synchronization allows the program to run sequentially. If one thread is executing, another thread has to
 * suspend till the previous thread releases its lock */
public class SynchronizeThread {

	public static void main(String[] args) {

		CountDown1 countdown = new CountDown1();

		CountDownThread1 t3 = new CountDownThread1(countdown);
		t3.setName("Thread 1");
		CountDownThread1 t4 = new CountDownThread1(countdown);
		t4.setName("Thread 2");

		t3.start();
		t4.start();

	}
}

class CountDown1 {
	/*
	 * if we define the variable then memroy will be shared across the threads.
	 * Try to commenting below variable and define it in for loop, you see the
	 * diff!
	 */
	private int i;

	/*
	 * We can use synchronized keyword at method level to make whole method as
	 * synchronous
	 */
	// public synchronized void doCountDown() {
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

		/*
		 * instead of using synchronized at method level, we can even define at
		 * block level whereever is required
		 */
		synchronized (this) {
			for (i = 10; i > 0; i--) {
				System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
			}
		}
	}
}

class CountDownThread1 extends Thread {
	private CountDown1 threadCountDown;

	public CountDownThread1(CountDown1 countDown) {
		threadCountDown = countDown;
	}

	public void run() {
		threadCountDown.doCountDown();
	}

}
