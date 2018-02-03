package org.hazi.Abstraction;

public abstract class Dog extends Animal{
	private String name;

	public Dog(String name) {
		super();
		this.name = name;
	}
	

	public String getName() {
		return name;
	}


	@Override
	public void eat() {
		System.out.println(getName() +" is eating");
		
	}

	@Override
	public void breathe() {
		System.out.println("breathe in, breathe out");
		
	}
	
	public  abstract void legs();
	
	

}
