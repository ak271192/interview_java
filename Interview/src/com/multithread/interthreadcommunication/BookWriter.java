package com.multithread.interthreadcommunication;

public class BookWriter implements Runnable {

	Book book;

	public BookWriter(Book book) {
		super();
		this.book = book;
	}

	public void run() {
		synchronized (book) {
			System.out.println("Author is starting the book" + book.getTitle());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			book.setCompleted(true);
			System.out.println("Book has been completed now");
//			book.notify();
			book.notifyAll();
			System.out.println("notify one reader");
		}
	}

}
