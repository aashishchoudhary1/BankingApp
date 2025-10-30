package com.app.dto;

import com.app.process.ProcessPayment;
import com.app.process.SMSProcessing;

public  class NEFTProcessFund extends ProcessPayment implements SMSProcessing {

	public static  void processFund(Customer intiator,Customer bene,double amount) throws AccountBalaneException {
		// TODO Auto-generated method stub

		 System.out.println("Hi this is first program in NEFTProcessFund");
		 
		 if(intiator!=null && bene!=null)
		 {
			if(intiator.getAmountbalance()>amount && amount>2000000)
			{
				double balanceamount = intiator.getAmountbalance() - amount;
				intiator.setAmount(balanceamount);
				bene.setAmount(bene.getAmountbalance()+amount);
				System.out.println("process fund imediately");
			}
			else {
				throw new AccountBalaneException("not having sufficient balance or not a NEFT payment");
				
			}
		 }
	}

	public  boolean validateCustomer(Customer c1) {
		
		if(c1.getName()!=null && !c1.getName().equals("Bin Laden")) 
		{
			return true;
		}
		
		
		return false;
	}

	@Override
	public boolean validateEmail() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sendSMS(Customer c1) {
		// TODO Auto-generated method stub
		
		System.out.println("sent sms to customer "+c1.getName());
		return true;
	}
	
}
