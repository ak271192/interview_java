package com.multithreadinf;

public class ThreadExampleMain {

	public static void main(String[] args) {
		
		FirstThread ft = new FirstThread();
		Thread t = new Thread(ft);
		t.start();

	}

}
