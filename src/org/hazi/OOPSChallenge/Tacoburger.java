package org.hazi.OOPSChallenge;

class Tacoburger extends Hamburger{
	
	private String specialflavour;
	public Tacoburger(String type, String content, int price, Additions additions) {
		super(type, content, price, additions);
		this.specialflavour = "Orange";

	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "bread";
	}
	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return "meat with cheese";
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 200;
	}
	@Override
	public Additions getAdditions() {
		// TODO Auto-generated method stub
		return super.getAdditions();
	}
	public String getSpecialflavour() {
		return specialflavour;
	}
	

}
