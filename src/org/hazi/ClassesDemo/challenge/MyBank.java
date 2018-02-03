package org.hazi.ClassesDemo.challenge;

public class MyBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBankAccount account = new MyBankAccount();
		//account.newAccount(account.getAccountNumber(), "Hazi", 973, "hazi.dudekula@gmail.com");
		account.setBalance(100);
		account.setCustomerName("Hazi");
		account.setEmail("hazi.dudekula@gmail.com");
		account.setPhonenumber(973);
		account.deposit(account.getAccountNumber(), account.getBalance());
		account.deposit(50, 100);
		account.withdraw(50, 100);
		
		
		

	}

}
