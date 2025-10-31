package com.app.work;

public class CountingIncrementor extends Thread {

    ProcessCounter obj;
	
CountingIncrementor(ProcessCounter obj){
		this.obj = obj;
	}

	public void run() {
		for(int i =0;i<200;i++)
		{
		try {
			obj.increment();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("counter value after increment -"+obj.getValue());
		}
	}

}
