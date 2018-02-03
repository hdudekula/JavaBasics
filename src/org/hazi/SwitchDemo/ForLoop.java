package org.hazi.SwitchDemo;

public class ForLoop {

	public static void main(String[] args) {
		for (double interest = 8; interest>=2; interest--){
			double returnInterest =  calculateInterest(10000, interest);
			System.out.println("the " +interest + " % interest for 10000 is "+ String.format("%.2f", returnInterest));
		}

	}
	public static double calculateInterest(double amount, double interest){
		return(amount * (interest/100));
	}

}
