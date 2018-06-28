package org.hazi.Threads;

public class ThreadDemo1 extends Thread{
	public void run() {
		for(int i=0; i<=5; i++) {
		try {
			sleep(5);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo1 t2 = new ThreadDemo1();
		t1.start();
		t2.start();
		

	}

}
