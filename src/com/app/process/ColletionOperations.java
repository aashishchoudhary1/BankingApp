package com.app.process;

import com.app.dto.Customer;

import java.util.*;

public class ColletionOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColletionOperations obj = new ColletionOperations();
		// obj.processList();
		// obj.processSet();
		// obj.processSetforCustomObjects();
		// obj.sortedSetProcess();
		// obj.sortedSetProcessNum();
		// obj.processMap();
		
		//obj.processSortedMap();
		//obj.processSortedList();
		obj.addCustomers();
	}

	
	public void addCustomers() {
		List<Customer> custList = new ArrayList<Customer>();
		
		 for(int i=0;;i++) {
			   Customer c6 = new Customer("Trump", "Trump@gmail.com", "43432432446", 30000,i+10);
			   custList.add(c6);
			   try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	}
	public void processSortedList() {
		Customer custObj = null;
		
		CustomerAgeComparator comp = new CustomerAgeComparator();
		List<Customer> custList = new ArrayList<Customer>();
		Customer c1 = new Customer("James", "james@gmail.com", "43432432442", 4343,65);

		Customer c2 = new Customer("Robin", "robin@gmail.com", "43432432441", 50000,23);
		
		Customer c3 = new Customer("Joy", "joy@gmail.com", "43432432446", 40000,45);
		
		Customer c4 = new Customer("Trump", "Trump@gmail.com", "43432432446", 30000,22);

		custList.add(c2);
		custList.add(c1);
		custList.add(c3);
		custList.add(c4);
		
		Collections.sort(custList, comp);
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

	public void processList() {
		String name = "";
		ArrayList<String> names = new ArrayList<String>();
		names.add("James"); // 0
		names.add("Rohan"); // 1
		names.add("Roy"); // 1
		names.add("Ajay");
		names.add("Camlin");
		names.remove(0);
		names.add("Rohit");
		
		 Collections.sort(names);
		boolean isnamethere = names.contains("Rohit111");
		int index = names.indexOf("Rohit111");
		System.out.println(" isnamethere " + isnamethere + " index " + index);
		Iterator<String> itr = names.iterator();

		while (itr.hasNext()) {
			name = itr.next();
			System.out.println(name);
		}

		names.forEach(namea -> System.out.println(namea));
		names.forEach(System.out::println);

	}

	public void processQueue() {
		String name = "";
		Queue<String> names = new PriorityQueue<String>();
		names.add("James"); // 0
		names.add("Rohan"); // 1
		names.add("Roy"); // 1

		names.remove(0);
		names.add("Rohit");
		boolean isnamethere = names.contains("Rohit111");
		System.out.println(" isnamethere " + isnamethere);
		Iterator<String> itr = names.iterator();

		while (itr.hasNext()) {
			name = itr.next();
			System.out.println(name);
		}

		names.forEach(namea -> System.out.println(namea));
		names.forEach(System.out::println);

	}

	public void processSet() {
		String name = "";
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		names.add("James"); // 0
		names.add("Rohan"); // 1
		names.add("Roy"); // 1

		names.remove(0);
		names.add("Rohit");
		boolean isnamethere = names.contains("Rohit111");

		System.out.println(" isnamethere " + isnamethere);
		Iterator<String> itr = names.iterator();

		while (itr.hasNext()) {
			name = itr.next();
			System.out.println(name);
		}

		names.forEach(namea -> System.out.println(namea));
		names.forEach(System.out::println);

	}

	public void processSetforCustomObjects() {
		Customer custObj = null;
		
		CustomerAgeComparator comp = new CustomerAgeComparator();
		TreeSet<Customer> custList = new TreeSet<Customer>(comp);
		Customer c1 = new Customer("James", "james@gmail.com", "43432432442", 4343,65);

		Customer c2 = new Customer("Robin", "robin@gmail.com", "43432432441", 50000,23);
		
		Customer c3 = new Customer("Joy", "joy@gmail.com", "43432432446", 40000,45);
		
		Customer c4 = new Customer("Trump", "Trump@gmail.com", "43432432446", 30000,22);

		custList.add(c2);
		custList.add(c1);
		custList.add(c3);
		custList.add(c4);
		
		  
		
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

	public void sortedSetProcess() {
		String name = "";
		TreeSet<String> names = new TreeSet<String>();
		names.add("Anish");
		names.add("rohan");
		names.add("yatin");
		names.add("james");

		Iterator<String> itr = names.iterator();

		while (itr.hasNext()) {
			name = itr.next();
			System.out.println(name);
		}

		names.forEach(namea -> System.out.println(namea));
		names.forEach(System.out::println);
	}

	public void sortedSetProcessNum() {

		// Integer intobj = new Integer(1);
		// intobj.intValue()
		int num = 0;
		TreeSet<Integer> names = new TreeSet<Integer>();
		names.add(10);
		names.add(30);
		names.add(5);
		names.add(20);

		Iterator<Integer> itr = names.iterator();

		while (itr.hasNext()) {
			num = itr.next();
			System.out.println(num);
		}

		names.forEach(namea -> System.out.println(namea));
		names.forEach(System.out::println);
	}

	public void processSortedMap() {

		String key = "";
		String value = "";
		CustomerAgeComparator comp = new CustomerAgeComparator();
		
		TreeMap<Customer, String> custommap = new TreeMap<Customer, String>(comp);

		TreeMap<String, String> studentmap = new TreeMap<String, String>();

		studentmap.put("James", "IT");
		studentmap.put("ROY", "CS");
		studentmap.put("Anish", "AI");
		studentmap.put("Yatin", "DEVOPS");

		System.out.println(studentmap.get("Rohit"));
		Set<String> keyset = studentmap.keySet();

		Iterator<String> itr = keyset.iterator();

		while (itr.hasNext()) {
			key = itr.next();
			value = studentmap.get(key);
			System.out.println(key);
		}

	}
	
	public void processMap() {

		String key = "";
		String value = "";
		HashMap<String, String> studentmap = new HashMap<String, String>();

		studentmap.put("James", "IT");
		studentmap.put("ROY", "CS");
		studentmap.put("Anish", "AI");
		studentmap.put("Yatin", "DEVOPS");

		System.out.println(studentmap.get("Rohit"));
		Set<String> keyset = studentmap.keySet();

		Iterator<String> itr = keyset.iterator();

		while (itr.hasNext()) {
			key = itr.next();
			value = studentmap.get(key);
			System.out.println(key);
		}

	}
}
