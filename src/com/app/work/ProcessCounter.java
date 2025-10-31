package com.app.work;

import java.util.concurrent.atomic.AtomicInteger;

public class ProcessCounter {
	
	private volatile int counter;
	
	private AtomicInteger counter1 = new AtomicInteger();
	
	 synchronized  void increment() throws InterruptedException{
		 counter1.getAndIncrement();
		counter++;
		wait(20);
		notify();
	}

	
	 synchronized void decrement() throws InterruptedException{
		 counter1.getAndDecrement();
		counter--;
		wait(20);
		notify();
	}

	public synchronized int getValue() {
		return counter;
	}
	
	public synchronized int getatomiccounterValue() {
		return counter1.get();
	}
}