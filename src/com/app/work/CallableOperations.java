package com.app.work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableOperations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CallableCounter callobj = new CallableCounter();
		ExecutorService exc = Executors.newFixedThreadPool(10);
		                    
	//	exc.execute(null);
		Future<String> ftobj = exc.submit(callobj);
		
		System.out.println(ftobj.isDone());
		
		       System.out.println(callobj.call());

		       System.out.println(ftobj.isDone());
		exc.shutdown();

	}

}
