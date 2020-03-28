package com.multithreadinf;

public class MyRunnableJoin implements Runnable {

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+ "Start");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+ "End");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
