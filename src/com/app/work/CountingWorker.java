package com.app.work;

public class CountingWorker  extends Thread{
	
	ProcessCounter obj;
	
	CountingWorker(ProcessCounter obj){
		this.obj = obj;
	}

	public void run() {
		for(int i =0;i<200;i++)
		{
		try {
			obj.decrement();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("counter value after decrement - "+obj.getValue());
		}
	}

}
