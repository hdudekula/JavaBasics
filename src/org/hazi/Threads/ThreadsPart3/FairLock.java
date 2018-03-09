package org.hazi.Threads.ThreadsPart3;

import java.util.concurrent.locks.ReentrantLock;

public class FairLock {
	private static ReentrantLock lock = new ReentrantLock();

	public static void main(String[] args) {
		Thread t1 = new Thread(new Worker1(ThreadColor.ANSI_BLACK), "Priority 10");
		Thread t2 = new Thread(new Worker1(ThreadColor.ANSI_BLUE), "Priority 8");
		Thread t3 = new Thread(new Worker1(ThreadColor.ANSI_CYAN), "Priority 6");
		Thread t4 = new Thread(new Worker1(ThreadColor.ANSI_GREEN), "Priority 4");
		Thread t5 = new Thread(new Worker1(ThreadColor.ANSI_PURPLE), "Priority 2");

		t1.setPriority(10);
		t2.setPriority(8);
		t3.setPriority(6);
		t4.setPriority(4);
		t5.setPriority(2);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

	private static class Worker1 implements Runnable {
		private int runCount = 1;
		private String threadColor;

		public Worker1(String threadColor) {

			this.threadColor = threadColor;
		}

		@Override
		public void run() {
			for (int i = 1; i < 100; i++) {
				lock.lock();
				try {
					System.out.format(threadColor + "%s: runCount = %d\n", Thread.currentThread().getName(),
							runCount++);
				} finally {
					lock.unlock();
				}

			}

		}

	}

}
