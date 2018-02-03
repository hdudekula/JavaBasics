package org.hazi.Composition;

public class ChallengeFurniture {
	private int doors;
	private int windows;
	private int chairs;
	private int lights;
	public ChallengeFurniture(int doors, int windows, int chairs, int lights) {
		this.doors = doors;
		this.windows = windows;
		this.chairs = chairs;
		this.lights = lights;
	}
	public int getDoors() {
		return doors;
	}
	public int getWindows() {
		return windows;
	}
	public int getChairs() {
		return chairs;
	}
	public int getLights() {
		return lights;
	}
	

}
