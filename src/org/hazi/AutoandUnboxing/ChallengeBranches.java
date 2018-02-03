package org.hazi.AutoandUnboxing;

import java.util.ArrayList;

public class ChallengeBranches {
	
	private String branchName;
	private ArrayList<ChallengeCustomers> customers;
	public ChallengeBranches(String branchName) {
		super();
		this.branchName = branchName;
		this.customers = new ArrayList<ChallengeCustomers>();
		
	}
	public String getBranchName() {
		return branchName;
	}
	
	public  boolean addCustomers(ChallengeCustomers newCustomer){
		if(findCustomer(newCustomer.getName()) >= 0){
			System.out.println("Customer is already exists");
			return false;
		}
			customers.add(newCustomer);
		
		return true;
	}
	
	public boolean addTransactions(ChallengeCustomers transaction, String customerName){
		if(queryCustomer(customerName) != null){
			customers.add(transaction);
			return true;
		}
		
		return false;
	}
	
	public int findCustomer(String customerName){
		for(int i=0; i<customers.size(); i++){
			ChallengeCustomers cust = this.customers.get(i);
			if(cust.equals(customerName)){
			return 1;
		}
		}
		return -1;
	}
	
	public int findCustomer(ChallengeCustomers customer1){
		return this.customers.indexOf(customer1);
		
	}
	
	public String queryCustomer(ChallengeCustomers customer){
		if(findCustomer(customer)>=0){
			return customer.getName();
		}
		return null;
	}
	
	public ChallengeCustomers queryCustomer(String name){
		
			int position = findCustomer(name);
			if(position >= 0){
				return this.customers.get(position);
			}
			return null;
		
	}
	

	

	
	



}
