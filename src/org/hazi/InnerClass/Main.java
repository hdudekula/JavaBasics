package org.hazi.InnerClass;

public class Main {

	public static void main(String[] args) {
		Gearbox dodge = new Gearbox(6);
		/*Gearbox.Gear first = dodge.new Gear(3, 2.5);
		
		System.out.println(first.driveSpeed(1000));*/
		
		dodge.addGears(1, 2.3);
		dodge.addGears(2, 4.5);
		dodge.operateClutch(true);
		dodge.changeGear(1);

	}

}
