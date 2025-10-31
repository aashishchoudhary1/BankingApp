package com.app.work;

import com.app.process.FileReadOperations;

public class WorkerThread implements Runnable{

	FileReadOperations obj ;
	
	
	
	WorkerThread(FileReadOperations obj1 ){
		
		this.obj = obj;
	}
	
	@Override
	public void run() {
		
		for(int i= 0;i<50;i++)
		{
		obj.writeFilewithAppend("C:/trainingdocs/NewTraining/userdettails.txt");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		// TODO Auto-generated method stub
		System.out.println("Hi this inside a run");
	}

}
