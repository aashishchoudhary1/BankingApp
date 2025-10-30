package com.app.process;
import com.app.dto.Customer;

public abstract class ProcessPayment implements EmailProcessing  {

	public int processcount;
	public static  void processFund(Customer intiator,Customer bene,double amount) throws Exception {
		// TODO Auto-generated method stub

		 System.out.println("Hi this is first program");
		 
		 if(intiator!=null && bene!=null)
		 {
			if(intiator.getAmountbalance()>amount)
			{
				double balanceamount = intiator.getAmountbalance() - amount;
				intiator.setAmount(balanceamount);
				bene.setAmount(bene.getAmountbalance()+amount);
			}
			else {
				System.out.println("not having sufficient balance");
			}
		 }
	}

	public abstract boolean validateCustomer(Customer c1);
	
	public boolean validateEmail(Customer c1) {
		
		if(c1.getEmail()!=null && c1.getEmail().contains("@")) {
			
			return true;
		}
		
		return false;
		
	}

	public  void intializeEmailServer() {
			System.out.println("intialize server with azure email service");
		}
}
