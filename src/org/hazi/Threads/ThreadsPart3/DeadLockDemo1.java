package org.hazi.Threads.ThreadsPart3;

public class DeadLockDemo1 {

	public static void main(String[] args) {
		final PolitePerson jane = new PolitePerson("Jane");
		final PolitePerson john = new PolitePerson("John");

		new Thread(new Runnable() {
			@Override
			public void run() {
				jane.sayHello(john);
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				john.sayHello(jane);
			}
		}).start();
		// jane.sayHello(john);
		// john.sayHello(jane);

	}

	static class PolitePerson {
		private final String name;

		public PolitePerson(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public synchronized void sayHello(PolitePerson person) {
			System.out.format("%s: %S" + " has said hello to me!%n", this.name, person.getName());
			person.sayHelloBack(this);
		}

		public synchronized void sayHelloBack(PolitePerson person) {
			System.out.format("%s: %s" + " has said hello to me back!%n", this.name, person.getName());
		}

	}

}
