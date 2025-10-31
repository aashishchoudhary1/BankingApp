package com.app.work;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.app.process.FileReadOperations;

public class JobThread extends Thread {
	
	FileReadOperations obj ;
	
	JobThread(FileReadOperations obj1){
	this.obj = 	obj1;
	}
	
	public JobThread(String name) {
		super(name);
	}
	public void run() {
		
	//	write all logic here which task need to be done
		System.out.print("Inside run");
		try {
			for(int i=0;i<50;i++)
			{
			obj.readFile("C:/trainingdocs/NewTraining/userdettails.txt");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(isAlive());
		
	}

}
