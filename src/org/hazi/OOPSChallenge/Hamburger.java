package org.hazi.OOPSChallenge;

public class Hamburger {
	private String type;
	private String Content;
	private int price;
	private Additions additions;
	public Hamburger(String type, String content, int price, Additions additions) {
		super();
		this.type = type;
		Content = content;
		this.price = price;
		this.additions = additions;
	}
	public String getType() {
		return type;
	}
	public String getContent() {
		return Content;
	}
	public int getPrice() {
		return price;
	}
	public Additions getAdditions() {
		
		return additions;
	}
	

}
