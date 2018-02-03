package org.hazi.AutoandUnboxing;

public class TMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TBank bank = new TBank("MyOwn Bank");
		bank.addBranches("bapatla");
			
		
		
		bank.addCustomer("bapatla", "hazi", 500.0);
		bank.addCustomer("bapatla", "gouse", 200.0);
		
		bank.addBranches("IOB Bank");
		bank.addCustomer("IOB Bank", "Mastanbee", 500.0);
		bank.addCustomer("IOB Bank", "nalini", 500.0);
		
		bank.addCustomerTransaction("bapatla", "hazi", 220.0);
		bank.addCustomerTransaction("bapatla", "hazi", 520.0);
		
		bank.addCustomerTransaction("IOB Bank", "Mastanbee", 120.0);
		
		bank.listCustomers("bapatla", true);
		
		System.out.println("Please work");

	}

}
