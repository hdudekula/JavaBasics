package org.hazi.LambdaExpressions;

public class LambadasDemo {

	public static void main(String[] args) {

		/*
		 * This is one way of starting the thread. if we see there is lot of
		 * code written to just executed the sysout. It can avoided by using
		 * lambadas
		 */
		new Thread(new CodeRun()).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("printing inside runnable - main");
			}
		}).start();

		/*
		 * Below code is the example of LAMBDA and to print same line with less
		 * code
		 */

		new Thread(() -> System.out.println("printing inside the lambada")).start();

	}

}

class CodeRun implements Runnable {
	@Override
	public void run() {
		System.out.println("Printing inside Runnable");
	}
}
