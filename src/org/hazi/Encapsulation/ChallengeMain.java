package org.hazi.Encapsulation;

public class ChallengeMain {

	public static void main(String[] args) {
		ChallengePrinter printer = new ChallengePrinter("Sony", 100, 0, false);
		printer.isDuplex();
		printer.count(2);
		printer.count(4);
		printer.count(15);
		printer.count(2);
		System.out.println(printer.getCompany());
		System.out.println(printer.getPageCount());
		System.out.println("the current tonervalue is " +printer.getTonerValue());
		printer.remainingToner();

	}

}
