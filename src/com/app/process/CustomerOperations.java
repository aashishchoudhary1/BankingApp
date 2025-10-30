package com.app.process;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.app.dto.Customer;

public class CustomerOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerOperations obj = new CustomerOperations();
		obj.processSetforCustomObjects();
	}

	public void processSetforCustomObjects() {
		Customer custObj = null;
		
		HashSet<Customer> custList = new HashSet<Customer>();
		Customer c1 = new Customer("James", "james@gmail.com", "43432432442", 4343,65);

		Customer c5 = new Customer("James", "james@gmail.com", "43432432442", 4343,65);

		Customer c2 = new Customer("james", "robin@gmail.com", "43432432441", 50000,23);
		
		Customer c3 = new Customer("Joy", "joy@gmail.com", "43432432446", 40000,45);
		
		Customer c4 = new Customer("Trump", "Trump@gmail.com", "43432432446", 30000,22);
		
		if(c1.hashCode()!=c5.hashCode()) {
			System.out.println("c1 and c5 are not same");
		}

		custList.add(c2);
		custList.add(c1);
		custList.add(c3);
		custList.add(c4);
		custList.add(c5);
		System.out.println(" size "+custList.size());
		Iterator<Customer> itr = custList.iterator();

		while (itr.hasNext()) {
			custObj = itr.next();
			String name = custObj.getName();
			System.out.println(name);
			System.out.println("customer balance "+custObj.getAmountbalance());
			System.out.println("customer balance "+custObj.getAge());
		}

		custList.forEach(namea -> System.out.println(namea.getName()));
		custList.forEach(System.out::println);

	}
}
