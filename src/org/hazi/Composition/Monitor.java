package org.hazi.Composition;

public class Monitor {
	private int height;
	private int width;
	private Resolution screenResolution;
	private String manufacturer;
	public Monitor(int height, int width, Resolution screenResolution, String manufacturer) {
		this.height = height;
		this.width = width;
		this.screenResolution = screenResolution;
		this.manufacturer = manufacturer;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public Resolution getScreenResolution() {
		return screenResolution;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	

}
