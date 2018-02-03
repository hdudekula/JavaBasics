package org.hazi.Composition;

public class MotherBoard {
	private int ramSlots;
	private int romSlots;
	private String manufacturer;
	
	public MotherBoard(int ramSlots, int romSlots, String manufacturer){
		this.ramSlots = ramSlots;
		this.romSlots = romSlots;
		this.manufacturer = manufacturer;
	}
	
	public int getRamSlots(){
		return ramSlots;
	}
	
	public int getRomSlots(){
		return romSlots;
	}
	
	public String getManufacturer(){
		return manufacturer;
	}

}
