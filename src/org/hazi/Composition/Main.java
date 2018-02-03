package org.hazi.Composition;

public class Main {

	public static void main(String[] args) {
		MotherBoard mainBoard = new MotherBoard(4, 2, "Acer");
		Monitor screen = new Monitor(25, 12, new Resolution(19, "32-bit"), "Samsung");
		Cpu heart = new Cpu(mainBoard, 2, "odyssey", 1);
		PC thePC = new PC(mainBoard, screen, heart);
		thePC.getCpu().powerButton();
		System.out.println("the manufacturer of Mother board is " +thePC.getCpu().getMotherBoard().getManufacturer());
		System.out.println("the resolution of monitor is "+thePC.getMonitor().getHeight() +"x"
				+thePC.getMonitor().getWidth()+ " and the screen resolution is "+
				thePC.getMonitor().getScreenResolution().getColorCode());
		System.out.println(thePC.getMotherBoard().getManufacturer());
		System.out.println(screen.getHeight());
		

	}

}
