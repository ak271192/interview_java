package com.multithreadinf;

public class ThreadExampleMainJoin {

	public static void main(String[] args) {
		
		System.out.println("Main Thread Execution Start");
		MyRunnableJoin mr = new MyRunnableJoin();
		
		Thread t1 = new Thread(mr, "Thread 1");
		Thread t2 = new Thread(mr, "Thread 2");
		Thread t3 = new Thread(mr, "Thread 3");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		try {
			t2.join(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
		
		//completing all threads before completing main thread
		try {
			t2.join();
			t3.join();
		}
		catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("Main thread execution ends");
		
		
		
		

	}

}
