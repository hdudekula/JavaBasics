package org.hazi.Inheritance.Lecture41;

public class ChallengeCar extends ChallengeVehicle{
	private String name;
	private String engineType;
	private String tyresCompany;
	public ChallengeCar(int tyres, int body, String name, String engineType, String tyresCompany) {
		super(1, 2, tyres, body);
		this.name = name;
		this.engineType = engineType;
		this.tyresCompany = tyresCompany;
		
	}
	public String getName() {
		return name;
	}
	public String getEngineType() {
		return engineType;
	}
	public String getTyresCompany() {
		return tyresCompany;
	}
	
	public void comfort(){
		System.out.println("the comfort of Car class is called");
	}
	
	public void seatStyle(){
		System.out.println("the seatStyle is called inside Car");
	}
	
	

}