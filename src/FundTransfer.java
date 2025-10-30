
import java.util.*;

import com.app.dto.AccountBalaneException;
import com.app.dto.Customer;
import com.app.dto.NEFTProcessFund;
import com.app.process.ProcessPayment;
import java.io.*;
public class FundTransfer {

	public int count;//heap
	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
      System.out.println("This is test");
      
     
      
     // ProcessPayment obj = new ProcessPayment();
     // ProcessPayment obj1 = new ProcessPayment();
      
    //  try {
        //   int i = 5/0;
     //      int arr[]= {};
        //   System.out.println(arr[2]);
	/*
	 * File f = new File(""); FileInputStream ftr = new FileInputStream(f);
	 * ftr.read(); FileReader fr = new FileReader(f); fr.close();
	 */
     // }catch(ArithmeticException ex){
    	  System.out.println("Inside a catch");
    //  }catch(Exception ex) {
    	  
    //	  System.out.println("IO exception" +ex.getMessage());
    	//  ex.printStackTrace();
    //  }
     
      FundTransfer fdobj = new FundTransfer();
     
      Customer c1 = new Customer("James","james@gmail.com","43432432442",4343,32);
      
      Customer c2 = new Customer("Robin","robin@gmail.com","43432432441",50000,67);
      
   //   obj.processFund(c1,c2,4000); 
      
      NEFTProcessFund neftobj = new NEFTProcessFund();
      
      
      System.out.println("customer balance intiator" + c1.getAmountbalance());
      System.out.println("customer balance bene" + c2.getAmountbalance());
      boolean isValidCustomer = neftobj.validateCustomer(c2);
      if(isValidCustomer) {
     try {
		neftobj.processFund(c1, c2, 30000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      }else {
    	  System.out.println("is not valid customer");
      }
      
      	
	}


}