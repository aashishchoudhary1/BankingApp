package com.app.dto;

public class Customer {
	
	public Customer(){
	System.out.println("inside default constructor");	
	}
	
	public Customer(String custname,String custemail,String accountdetails,double balance,int age){
		this.accountno = accountdetails;
		this.amountbalance = balance;
		this.email = custemail;
		this.name = custname;
		this.age = age;
	}
	private int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	private String name;
	public String getName() {
		return name;
	}
	
	public double getAmountbalance() {
		return amountbalance;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAccountno() {
		return accountno;
	}
	
	private double amountbalance;
	private String email;
    private String accountno;
    
    public void setAmount(double amount) {
    	this.amountbalance = amount;
    }

    @Override
    public int hashCode() {
    return this.age;	
    }
    
    
    @Override
    public boolean equals(Object o) {
    Customer c = (Customer)o;
    
         if(this.age == c.getAge()&& this.name.equalsIgnoreCase(c.getName())&& this.accountno.equals(c.getAccountno())) {
        	 return true;
         }
    return false;
    }
	/*
	 * @Override public int compareTo(Object o) {
	 * 
	 * Customer c = (Customer)o; if(this.amountbalance<c.amountbalance) { return 1;
	 * }else if (this.amountbalance>c.amountbalance) { return -1; } return 0; }
	 */    
}
