package org.hazi.Composition;

public class ChallengeFacilities {
	private int parkingSize;
	private int waterTaps;
	private int invertors;
	private boolean security;
	public ChallengeFacilities(int parkingSize, int waterTaps, int invertors, boolean security) {
		super();
		this.parkingSize = parkingSize;
		this.waterTaps = waterTaps;
		this.invertors = invertors;
		this.security = security;
	}
	public int getParkingSize() {
		return parkingSize;
	}
	public int getWaterTaps() {
		return waterTaps;
	}
	public int getInvertors() {
		
		return invertors;
	}
	public boolean isSecurity() {
		return security;
	}

}
