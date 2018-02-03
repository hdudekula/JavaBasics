package org.hazi.OOPSChallenge;

public class HealthyBurger extends Hamburger {
	private String addition1;
	private String addition2;
	public HealthyBurger(String type, String content, int price, Additions additions) {
		super(type, content, price, additions);
		this.addition1 = "lemon";
		this.addition2 = "butter";
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "brown rye bread roll";
	}
	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return "meat with cheese and extra spicy along with " +this.addition1 + " and "+this.addition2;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 400;
	}
	@Override
	public Additions getAdditions() {
		// TODO Auto-generated method stub
		return super.getAdditions();
	}
	

}