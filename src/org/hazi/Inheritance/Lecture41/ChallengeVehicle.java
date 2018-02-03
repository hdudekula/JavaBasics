package org.hazi.Inheritance.Lecture41;

public class ChallengeVehicle {
	private int engine;
	private int lights;
	private int tyres;
	private int body;
	public ChallengeVehicle(int engine, int lights, int tyres, int body){
		this.engine = engine;
		this.lights = lights;
		this.tyres = tyres;
		this.body = body;
	}
	public int getEngine() {
		return engine;
	}
	public int getLights() {
		return lights;
	}
	public int getTyres() {
		return tyres;
	}
	public int getBody() {
		return body;
	}
	public void speed(int speed){
		System.out.println("the speed of vehicle is "+speed);
	}
	
	public void gearSystem(){
		System.out.println("the gear  system front and back");
	}
}
