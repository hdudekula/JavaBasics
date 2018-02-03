package org.hazi.Constructor.Lecture40;

public class ChallengeVipCustomer {
	private String name;
	private double creditLimit;
	private String Email;
	
	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return Email;
	}

	public ChallengeVipCustomer(){
		this("defaultName", 9999, "defaultEmail");
		System.out.println("its a no parameter constructor");
		
	}
	
	public ChallengeVipCustomer(String name, double creditLimit){
		this(name, creditLimit, "defaultEmail");
		System.out.println("its a 2 parameter constructor");
		//this(String name, double creditLimit, String Email);
	}
	public ChallengeVipCustomer(String name, double creditLimit, String Email){
		System.out.println("its a 3 value parameter constructor");
		this.name = name;
		this.creditLimit = creditLimit;
		this.Email = Email;
		
	}

}
