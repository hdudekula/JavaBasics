package org.hazi.Inheritance.Lecture41;

public class ChallengeDodge extends ChallengeCar {
	private String color;
	private String model;
	public ChallengeDodge(String engineType, String tyresCompany, String color, String model) {
		super(4, 1, "dodge", engineType, tyresCompany);
		this.color = color;
		this.model = model;
		
	}
	public String getColor() {
		return color;
	}
	public String getModel() {
		return model;
	}
	
	public void highSpeed(){
		//System.out.println("the high speed of dodge class is ");
		super.speed(2000);
		
	}
	
	@Override
	public void comfort(){
		System.out.println("the comfort of Dodge class is called");
		super.comfort();
	}
	

	
	

}
