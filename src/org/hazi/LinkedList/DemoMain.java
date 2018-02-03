package org.hazi.LinkedList;

import java.util.ArrayList;

public class DemoMain {

	public static void main(String[] args) {
		DemoCustomer customer = new DemoCustomer("hazi", 100.25);
		DemoCustomer customerNew = customer;
		customerNew.setBalance(12.56);
		
		System.out.println("customer is "+customer.getName() + " and balance "+customer.getBalance());
		
		 ArrayList<Integer> intList = new ArrayList<Integer>();
		 
		 intList.add(1);
		 intList.add(3);
		 intList.add(4);
		 
		 for(int i=0; i<intList.size(); i++){
		 System.out.println(i + " : "+intList.get(i));
		 }
		 
		 intList.add(1, 2);
		 
		 for(int i=0; i<intList.size(); i++){
			 System.out.println(i+ " :"+intList.get(i));
		 }

	}

}
