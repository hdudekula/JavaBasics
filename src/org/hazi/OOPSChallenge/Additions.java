package org.hazi.OOPSChallenge;

public class Additions {
	private int spice;
	private int coolDrinks;
	private int price;
	public Additions(int spice, int coolDrinks) {
		super();
		this.spice = spice;
		this.coolDrinks = coolDrinks;
		
	}
	public int getSpice() {
		return spice;
	}
	public int getCoolDrinks() {
		
		return coolDrinks;
	}
	public int getPrice() {
		 if(getCoolDrinks() ==1 && getSpice()==1){
			this.price = 200;
		}else {
			this.price = 0;
		}
		
		return price;
	}
	


}
