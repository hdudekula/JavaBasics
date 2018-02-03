package org.hazi.OOPSChallenge;

public class BillsBurgers {

	public static void main(String[] args) {
		//Additions adds = new Additions(1, 1);
		Hamburger hamburger = new Hamburger("bread", "meat", 100, new Additions(1,1));
		Tacoburger tacoburger = new Tacoburger("bread", "meat", 70, new Additions(0,0));
		Canyonburger canyon = new Canyonburger("bread", "meat", 50, new Additions(1,1));
		HealthyBurger healthy = new HealthyBurger("bread", "meat", 450, new Additions(1,1));
		DeluxeBurger deluxe = new DeluxeBurger("bread", "meat", 500, new Additions(1,1));
		
		
		System.out.println("the chosen burger was "+hamburger.getContent() + " and it costs Rs."+hamburger.getPrice()
							+ " the spices added are, cooldrinks "+hamburger.getAdditions().getCoolDrinks() + " and spice "+hamburger.getAdditions().getSpice() 
							+ " and additionals costs "+hamburger.getAdditions().getPrice() + "\n" + "total amount to be paid is Rs." + (hamburger.getPrice()+hamburger.getAdditions().getPrice()));
		
		System.out.println("the Tacoburger cost was "+tacoburger.getPrice() + " and it contains: "+ tacoburger.getContent() +
							" and it's flavour is "+tacoburger.getSpecialflavour() + " additionals are, spices "+tacoburger.getAdditions().getSpice()
							+ " and cooldrinks are "+tacoburger.getAdditions().getCoolDrinks() + "\n" + "total amount to be paid is Rs." + (tacoburger.getPrice()+tacoburger.getAdditions().getPrice()));
		
		System.out.println("the canyonBurger cost was "+canyon.getPrice() + " and it contains: "+ canyon.getContent() +
				" and it's flavour is "+canyon.getSpecialFlavour() + " additionals are, spices "+canyon.getAdditions().getSpice()
				+ " and cooldrinks are "+canyon.getAdditions().getCoolDrinks() + "\n" + "total amount to be paid is Rs." + (canyon.getPrice()+canyon.getAdditions().getPrice()));
		
		System.out.println("the healthy burger cost was " +healthy.getPrice() + " and it contains "+healthy.getContent() +
				" of type "+healthy.getType() + " additions cost was "+healthy.getAdditions().getPrice() + " and grand total to be"
						+ "paid is Rs."+(healthy.getPrice()+healthy.getAdditions().getPrice()));
		
		System.out.println("the deluxe burger cost was "+deluxe.getPrice() + " and it contains "+deluxe.getContent() +
				" of type "+deluxe.getType() + " total amount to be paid is Rs. " +deluxe.getPrice());
	}

}
