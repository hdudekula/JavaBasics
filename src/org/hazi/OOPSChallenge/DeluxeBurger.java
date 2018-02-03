package org.hazi.OOPSChallenge;

public class DeluxeBurger extends Hamburger {
	private String addition1;
	private String addition2;
	public DeluxeBurger(String type, String content, int price, Additions additions) {
		super(type, content, price, additions);
		this.addition1 = "chips";
		this.addition2 = "Sprite";
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Deluxe burger is being ordered along with "+this.addition1 + " and "+this.addition2;
	}
	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return "deluxe burger with cheese and two additions";
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 500;
	}
	
	

}
