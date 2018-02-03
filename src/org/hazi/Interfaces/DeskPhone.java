package org.hazi.Interfaces;

public class DeskPhone implements ITelephone{
	private int myNumber;
	private boolean isRinging;
	public DeskPhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}
	@Override
	public void poweOn() {
		System.out.println("It's a deskphone, does not have power button");
		
	}
	@Override
	public void dianIn(int phoneNumber) {
		System.out.println("you have called to "+phoneNumber);
		
	}
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void answer() {
		if(isRinging){
			System.out.println("you have answered the call");
			isRinging = false;
		}
		
	}
	
	

}
