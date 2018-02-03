package org.hazi.Polymorphism;

class Car {
	private boolean engine = true;
	private int cylinders;
	private int tyres = 4;
	private String carName;
	public Car(int cylinders, String carName) {
		this.cylinders = cylinders;
		this.carName = carName;
	
		}
	
	
	public int getCylinders() {
		return cylinders;
	}


	public String getCarName() {
		return carName;
	}


	public String startCar(){
		return "the default car has been started";
		
	}
	public String accelerate(){
		return "the accelerate of default car has been called";
	}
	
	public String carBreak(){
		return "the breaks for default car has been applied";
	}
}

class Benz extends Car {

	public Benz() {
		super(4, "Benz");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startCar() {
		// TODO Auto-generated method stub
		return "the Benz car has been started";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Benz is getting accelerated at speed of 100 kmph";
	}

	@Override
	public String carBreak() {
		// TODO Auto-generated method stub
		return "Benz car has been applied break";
	}
	
	
}

class Audi extends Car {

	public Audi() {
		super(3, "Audi");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startCar() {
		// TODO Auto-generated method stub
		return "the Audi car has been started";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Audi car is going at speed of 200kmph";
	}

	@Override
	public String carBreak() {
		// TODO Auto-generated method stub
		return "Audi has been applied breaks";
	}
	
	
	
}

class Dodge extends Car {

	public Dodge() {
		super(7, "dodge");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startCar() {
		// TODO Auto-generated method stub
		return "The dodge has been started";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Dodge is going at speed of 500kmph";
	}

	@Override
	public String carBreak() {
		// TODO Auto-generated method stub
		return "Dodge has been applied breaks";
	}
	
	
	
}
public class Challenge {

	public static void main(String[] args) {
			Car car = new Car(1, "santro");
			System.out.println(car.getCarName() + " has cylinders "+car.getCylinders());
			System.out.println(car.accelerate());
			System.out.println(car.carBreak());
			System.out.println(car.startCar());
			Benz benz = new Benz();
			System.out.println(benz.getCarName() + " has cylinders "+benz.getCylinders());
			System.out.println(benz.accelerate());
			System.out.println(benz.carBreak());
			System.out.println(benz.startCar());
			Audi audi = new Audi();
			System.out.println(audi.getCarName() + " has cylinders "+audi.getCylinders());
			System.out.println(audi.accelerate());
			System.out.println(audi.carBreak());
			System.out.println(audi.startCar());
			Dodge dodge = new Dodge();
			System.out.println(dodge.getCarName() + " has cylinders "+dodge.getCylinders());
			System.out.println(dodge.accelerate());
			System.out.println(dodge.carBreak());
			System.out.println(dodge.startCar());
			
		}

	}
	
	


