package org.hazi.Polymorphism;


class Vehicle{
	private String name;

	public Vehicle(String name) {
		super();
		this.name = name;
	}
	public String color(){
		return "no color for basic model";
	}
	public String getName() {
		return name;
	}
}

class Benz1 extends Vehicle {

	public Benz1() {
		super("benz");
		
	}

	@Override
	public String color() {
		return "blue";
	}
}

class WagonR extends Vehicle {

	public WagonR() {
		super("wagonR");
	}

	@Override
	public String color() {
		return "black";
	}
}

class Audi1 extends Vehicle {

	public Audi1() {
		super("Audi");
		
	}

	@Override
	public String color() {
		return "White";
	}
}

class Santro extends Vehicle {

	public Santro() {
		super("santro");
		// TODO Auto-generated constructor stub
	}
	
}
public class PolymorphismDemo {

	public static void main(String[] args) {
		for(int i = 1; i<6; i++){
			Vehicle vehicle = randomCar();
			System.out.println("the processing value "+i +"\n"
								+ " the Name of the car is "+vehicle.getName() + "\n"
								+ " and it's color is "+vehicle.color());	
		}
		

	}
public static Vehicle randomCar(){
	int randomCar = (int) (Math.random() * 5) + 1;
		System.out.println("the Random value is "+randomCar);
		switch(randomCar){
		case 1 : return new Benz1();
		
		case 2 : return new WagonR();
		
		case 3 : return new Audi1();
		
		case 4 : return new Santro();
		
		}
		
		return null;
	
	}
}

