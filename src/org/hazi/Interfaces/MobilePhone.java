package org.hazi.Interfaces;

public class MobilePhone implements ITelephone{
	
	private int myNumber;
	private boolean isRinging;
	private boolean isOn;
	public MobilePhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}
	@Override
	public void poweOn() {
		isOn = true;
		System.out.println("mobile phone is ON");
		
	}
	@Override
	public void dianIn(int phoneNumber) {
		if(isOn){
			System.out.println("calling...."+phoneNumber);
		}else {
			System.out.println("mobile phone is off");
		}
		
	}
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void answer() {
		isRinging =true;
		if(isRinging){
			System.out.println("melody song");
		}
		isRinging =false;
		
	}
	
	

}
