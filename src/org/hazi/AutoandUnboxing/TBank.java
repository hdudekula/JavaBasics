package org.hazi.AutoandUnboxing;

import java.util.ArrayList;

public class TBank {
	private String name;
	private ArrayList<TBranch> branches;
	public TBank(String name) {
		
		this.name = name;
		this.branches = new ArrayList<TBranch>();
	}
	
	
	
	public String getName() {
		return name;
	}



	public boolean addBranches(String name){
		if(findBranch(name) == null){
			this.branches.add(new TBranch(name));
			return true;
		}
		return false;
	}
	
	public boolean addCustomer(String branchName, String customerName, double initialAmount){
		TBranch branch = findBranch(branchName);
		if(branch != null){
			
			return branch.newCustomer(customerName, initialAmount);
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String branchName, String name, double amount){
		TBranch branch = findBranch(branchName);
		if(branch != null){
			return branch.addCustomerTransaction(name, amount);
		}
		return false;
	}
	
	
	public TBranch findBranch(String name){
		for(int i=0; i<branches.size(); i++){
			TBranch checkedBranch = this.branches.get(i);
			
			if(checkedBranch.getName().equals(checkedBranch)){
				return checkedBranch;
			}
		}
		return null;
	}
	
	public boolean listCustomers(String branchName, boolean showTransactions){
		TBranch branch = findBranch(branchName);
		if(branch != null){
			System.out.println("Customer details for branch "+branch.getName());
			ArrayList<TCustomer> branchCustomers = branch.getCustomers();
			for(int i=0; i<branchCustomers.size(); i++){
				TCustomer branchCustomer = branchCustomers.get(i);
				System.out.println("customer "+branchCustomer.getName());
				if(showTransactions){
					System.out.println("Transactions");
					ArrayList<Double> transactions = branchCustomer.getTransactions();
					for(int j=0; j<transactions.size(); j++){
						System.out.println("[" +(j+1) + "] amount "+transactions.get(j));
					}
				}
			}
			return true;
		}
		return false;
		
	}
	

}
