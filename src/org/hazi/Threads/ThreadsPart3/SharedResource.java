package org.hazi.Threads.ThreadsPart3;

public class SharedResource {
	private LiveLockWorker owner;

	public SharedResource(LiveLockWorker owner) {
		super();
		this.owner = owner;
	}

	public LiveLockWorker getOwner() {
		return owner;
	}

	public synchronized void setOwner(LiveLockWorker owner) {
		this.owner = owner;
	}

}
