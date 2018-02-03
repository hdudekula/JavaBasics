package org.hazi.InnerClass;

import java.util.ArrayList;

public class Gearbox {
	private ArrayList<Gear> gears;
	private int maxGears;
	private int currentGear = 0;
	private boolean isClutchIn;
	public Gearbox(int maxGears) {
		super();
		this.maxGears = maxGears;
		this.gears = new ArrayList<Gear>();
	}
	
	public void operateClutch(boolean in){
		this.isClutchIn = in;
		
	}
	
	
	public void addGears(int number, double ratio){
		if((number > 0) && (number <= maxGears)){
			this.gears.add(new Gear(4, 2.5));
		}
	}
	
	public void changeGear(int newGear){
		if((newGear >=0) && newGear < this.gears.size() && this.isClutchIn){
			this.currentGear = newGear;
			System.out.println("Gear "+ newGear + " is selected");
		}
		else {
			System.out.println("grind");
			this.currentGear = 0;
		}
	}
	private class Gear {
		private int gearNumber;
		private double ratio;
		public Gear(int gearNumber, double ratio) {
			super();
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}
		
		public double driveSpeed(int revs){
			return revs * (this.ratio);
		}
	}
	
	

}
