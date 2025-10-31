package com.app.work;

import com.app.process.FileReadOperations;

public class JobProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReadOperations fobj = new FileReadOperations();
		WorkerThread obj = new WorkerThread(fobj);
		
		Thread t2 = new Thread(obj);
	
		t2.start();
		JobThread t1 = new JobThread(fobj);
		t1.start();
        System.out.println("thread details "+t1.getId());
        System.out.println("thread details "+t1.getName());
        System.out.println("thread details "+t1.getPriority());
        System.out.println("thread details "+t1.getState());
	}

}
