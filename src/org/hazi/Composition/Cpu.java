package org.hazi.Composition;

public class Cpu {
	private MotherBoard motherBoard;
	private int coolingFans;
	private String manufacturer;
	private int powerCables;
	public Cpu(MotherBoard motherBoard, int coolingFans, String manufacturer, int powerCables) {
		this.motherBoard = motherBoard;
		this.coolingFans = coolingFans;
		this.manufacturer = manufacturer;
		this.powerCables = powerCables;
		
	}
	
	public void powerButton(){
		System.out.println("please press and hold power button to ON the system");
		
	}
	public MotherBoard getMotherBoard() {
		return motherBoard;
	}
	public int getCoolingFans() {
		return coolingFans;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getPowerCables() {
		return powerCables;
	}
	
	

}
