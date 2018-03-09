package org.hazi.Threads.ThreadsPart3;

public class LiveLockMain {

	public static void main(String[] args) {
		final LiveLockWorker worker1 = new LiveLockWorker("Worker 1", true);
		final LiveLockWorker worker2 = new LiveLockWorker("Worker 2", true);

		final SharedResource sharedResource = new SharedResource(worker1);

		new Thread(new Runnable() {
			@Override
			public void run() {
				worker1.work(sharedResource, worker2);
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				worker2.work(sharedResource, worker1);
			}
		}).start();

	}

}
