package org.hazi.ClassesDemo.challenge;

public class MyBankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private long phonenumber;
	public MyBankAccount(){
		System.out.println("the default constructor is being called");
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;

	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	} 
	

	double initialBalance = 0;
	
	public double deposit(int accountNumber, double balance) {
		
		initialBalance = balance + initialBalance;
		System.out.println("the totoal balance in account# " +accountNumber + " is "+initialBalance);
		return initialBalance;
	}
	
	
	public void withdraw(int accountNumber, double amount){
		if (initialBalance > 100){
			initialBalance = initialBalance - amount;
			System.out.println("please collect "+amount + " and your balance is "+initialBalance);
		}else {
			System.out.println("Please maintain sufficient balance in "+ accountNumber);
		}
	}

}
