package org.hazi.OOPSChallenge;

class Canyonburger extends Hamburger {
	private String specialFlavour;
	
	public Canyonburger(String type, String content, int price, Additions additions) {
		super(type, content, price, additions);
		this.specialFlavour = "venila";
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "bread with tufted";
	}
	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return "meat + cheese + cabbage";
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 250;
	}
	@Override
	public Additions getAdditions() {
		// TODO Auto-generated method stub
		return super.getAdditions();
	}
	public String getSpecialFlavour() {
		return specialFlavour;
	}
	


}
