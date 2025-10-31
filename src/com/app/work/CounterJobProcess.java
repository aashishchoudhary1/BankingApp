package com.app.work;

public class CounterJobProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessCounter countobj = new ProcessCounter();
		CountingIncrementor inobj = new  CountingIncrementor(countobj);
		
		CountingWorker dobj = new CountingWorker(countobj);
		
		inobj.start();
		dobj.start();
		
		System.out.println("value of counter - "+countobj.getValue());
		
		System.out.println("value of counter atomic  - "+countobj.getatomiccounterValue());
	}

}
