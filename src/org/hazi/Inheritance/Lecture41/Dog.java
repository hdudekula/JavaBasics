package org.hazi.Inheritance.Lecture41;

public class Dog extends Animal{
	private int tail;
	private int teeth;
	public Dog(String name, int legs, int body, int eyes, int tail, int teeth) {
		super("pandu", 1, body, eyes);
		this.tail = tail;
		this.teeth = teeth;
		
	}
	public int getTail() {
		return tail;
	}
	public int getTeeth() {
		return teeth;
	}

	
	private void chew(){
		System.out.println("dog.chew() is called");
		super.eat();
	}
	
	@Override
	public void eat(){
		System.out.println("dog.eat() is called");
		
		
	}
	
	public void run(){
		System.out.println("dog.run() called");
		super.move(3);
		
	}

	public void walk(){
		System.out.println("dog.walk() called");
		move(10);
	}
	
	private void direction(String side){
		System.out.println("dog.direction() called");
		
	}
	@Override
	public void move(int speed){
		System.out.println("dog.move() is called ");
		direction("left");
		super.move(20);
	}

}
