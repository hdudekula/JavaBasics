package org.hazi.Constructor.Lecture40;

public class ChallengeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChallengeVipCustomer vipCustomer = new ChallengeVipCustomer("dudekula", 200);
		System.out.println(vipCustomer.getCreditLimit());
		System.out.println(vipCustomer.getEmail());
		System.out.println(vipCustomer.getName());
		ChallengeVipCustomer vipCustomer1 = new ChallengeVipCustomer();
		System.out.println(vipCustomer1.getCreditLimit());
		System.out.println(vipCustomer1.getEmail());
		System.out.println(vipCustomer1.getName());
		ChallengeVipCustomer vipCustomer2 = new ChallengeVipCustomer("hazi", 2000, "hazi@hazi.com");
		System.out.println(vipCustomer2.getCreditLimit());
		System.out.println(vipCustomer2.getName());
		System.out.println(vipCustomer2.getEmail());
		
	}

}
