package org.hazi.Inheritance.Lecture41;

public class Animal {
	private String name;
	private int legs;
	private int body;
	private int eyes;
	public Animal(String name, int legs, int body, int eyes){
		this.name = name;
		this.legs = legs;
		this.body = body;
		this.eyes = eyes;
	}
	
	public void move(int speed){
		System.out.println("Animal.move() is called" +speed);
	}
	public void eat(){
		System.out.println("Animal.eat() is called");
	}
	
	public String getName() {
		return name;
	}
	public int getLegs() {
		return legs;
	}
	public int getBody() {
		return body;
	}
	public int getEyes() {
		return eyes;
	}
}
