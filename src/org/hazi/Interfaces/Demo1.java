package org.hazi.Interfaces;

public class Demo1 {

	public static void main(String[] args) {
		ITelephone telephone;
		telephone = new DeskPhone(12334);
		telephone.dianIn(123454);
		telephone.answer();
		telephone.poweOn();
		
		telephone = new MobilePhone(12345);
		telephone.dianIn(12345);

	}

}
