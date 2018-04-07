package org.hazi.JUnitTesting;

public class BankAccount {
	private String firstName;
	private String lastName;
	private double balance;

	public static final int CHECKING = 1;
	public static final int SAVING = 2;

	private int accountType;

	public BankAccount(String firstName, String lastName, double balance, int typeofAccount) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.accountType = typeofAccount;
	}

	/*
	 * branch value is true only if the transaction is happening at branch. and
	 * false, if it is ATM
	 */
	public double deposit(double amount, boolean branch) {
		balance += amount;
		return balance;
	}

	/*
	 * branch value is true only if the transaction is happening at branch. and
	 * false, if it is ATM
	 */
	public double withdraw(double amount, boolean branch) {
		if ((amount > 500.00) && !branch) {
			throw new IllegalArgumentException();
		}
		balance -= amount;
		return balance;
	}

	public double getBalance() {
		return balance;
	}

	public boolean isChecking() {
		return accountType == CHECKING;
	}

}
