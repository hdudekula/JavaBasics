package org.hazi.AutoandUnboxing;

import java.util.ArrayList;

public class Customers {
	private String name;
	private ArrayList<Double> transactions;
	public Customers(String name, double initialAmount) {
		super();
		this.name = name;
		this.transactions = new ArrayList<Double>();
		addTransactions(initialAmount);
	}
	public void addTransactions(double amount){
		this.transactions.add(amount);
	}
	public String getName() {
		return name;
	}
	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	

	
	

}
