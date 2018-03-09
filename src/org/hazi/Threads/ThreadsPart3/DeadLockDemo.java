package org.hazi.Threads.ThreadsPart3;

public class DeadLockDemo {
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	public static void main(String[] args) {
		new Thread1().start();
		new Thread2().start();

	}

	private static class Thread1 extends Thread {
		public void run() {
			synchronized (lock1) {
				System.out.println("Thread 1 : has lock1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

				}
				System.out.println("Thred 1 is waiting for lock2");
				synchronized (lock2) {
					System.out.println("Thread 1 has lock on lock1 and lock2");
				}
				System.out.println("Thread1 releases lock2");
			}
			System.out.println("Thread1 release lock1 and exiting");
		}
	}

	private static class Thread2 extends Thread {
		public void run() {
			synchronized (lock2) {
				System.out.println("Thread2 : has lock2");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

				}
				System.out.println("Thread2: is waiting for lock1");
				synchronized (lock1) {
					System.out.println("Thread2: has lock1 and lock2");
				}
				System.out.println("Thread2 releases lock1");
			}
			System.out.println("Thread2 releases lock2 and exiting");
		}
	}

}
