package org.hazi.AutoandUnboxing;

import java.util.ArrayList;

public class TBranch {
	private String name;
	private ArrayList<TCustomer> customers;
	public TBranch(String name) {
		
		this.name = name;
		this.customers = new ArrayList<TCustomer>();
	}
	public String getName() {
		return name;
	}
	
	
	public ArrayList<TCustomer> getCustomers() {
		return customers;
	}
	public boolean newCustomer(String name, double initialAmount){
		if(findCustomer(name) == null){
			customers.add(new TCustomer(name, initialAmount));
			System.out.println("Customer has been added");
			return true;
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String customerName, double amount){
		TCustomer existingCustomer = findCustomer(customerName);
		if(existingCustomer != null){
			existingCustomer.addTransaction(amount);
			return true;
		}
		return false;
		
	}
	
	private TCustomer findCustomer(String name){
		for(int i=0; i<this.customers.size(); i++){
			TCustomer checkedCustomer = this.customers.get(i);
			if(checkedCustomer.getName().equals(checkedCustomer)){
				return checkedCustomer;
			}
			
		}
		return null;
	}
	
	
	
	
	

}
