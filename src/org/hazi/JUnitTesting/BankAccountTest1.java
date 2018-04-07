package org.hazi.JUnitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccountTest1 {
	private BankAccount account;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("It is executed before any test cases");
	}

	/*
	 * Annotation @Before will let the program be executed before any other
	 * methods.
	 */
	@Before
	public void setup() {
		account = new BankAccount("Hazi", "Dudekula", 1000, BankAccount.CHECKING);
		System.out.println("Running.....");
	}

	@Test
	public void testDeposit() {

		double balance = account.deposit(200.00, true);
		/*
		 * Here the 3rd parameter 0 will be delta. Which will be used for double
		 * and float to avoid floating digits. It works like (expected - actual)
		 * <= delta
		 */
		assertEquals(1200.00, balance, 0);
	}

	@Test
	public void testWithdraw_branch() {
		double balance = account.withdraw(600.00, true);
		assertEquals(400.00, balance, 0);
	}

	/*
	 * below test case will fail if we dont use expected as this method is
	 * expected to throw exception and it is valid.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testWithdraw_Notbranch() {
		double balance = account.withdraw(600.00, false);
		assertEquals(400.00, balance, 0);
	}

	@Test
	public void testGetBalance_deposit() {

		account.deposit(200.00, true);
		assertEquals(1200.00, account.getBalance(), 0);
	}

	@Test
	public void testGetBalance_withdraw() {

		account.withdraw(200.00, true);
		assertEquals(800.00, account.getBalance(), 0);
	}

	@Test
	public void isChecking_true() {

		assertTrue(account.isChecking());
	}

	@org.junit.AfterClass
	public static void afterClass() {
		System.out.println("This test runs after execution of all test cases");
	}

}
