package org.hazi.JUnitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testDeposit() {
		BankAccount account = new BankAccount("Hazi", "Dudekula", 1000, BankAccount.CHECKING);
		double balance = account.deposit(200.00, true);
		/*
		 * Here the 3rd parameter 0 will be delta. Which will be used for double
		 * and float to avoid floating digits. It works like (expected - actual)
		 * <= delta
		 */
		assertEquals(1200.00, balance, 0);
	}

	@Test
	public void testWithdraw() {
		/*
		 * It is always good idea to have the assert "fail" for unimplemented
		 * test units. So that, it fails whenever we run the test for
		 * unimplemented methods
		 */
		fail("Not yet implemented");
	}

	@Test
	public void testGetBalance_deposit() {
		BankAccount account = new BankAccount("Hazi", "Dudekula", 1000, BankAccount.CHECKING);
		account.deposit(200.00, true);
		assertEquals(1200.00, account.getBalance(), 0);
	}

	@Test
	public void testGetBalance_withdraw() {
		BankAccount account = new BankAccount("Hazi", "Dudekula", 1000, BankAccount.CHECKING);
		account.withdraw(200.00, true);
		assertEquals(800.00, account.getBalance(), 0);
	}

	@Test
	public void isChecking_true() {
		BankAccount account = new BankAccount("Hazi", "Dudekula", 1000, BankAccount.CHECKING);
		assertTrue(account.isChecking());
	}

}
