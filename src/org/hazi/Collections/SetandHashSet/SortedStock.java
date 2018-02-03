package org.hazi.Collections.SetandHashSet;

public class SortedStock implements Comparable<SortedStock> {
	private final String name;
	private double price;
	private int quantity = 0;
	public SortedStock(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = 0;
	}
	
	
	public SortedStock(String name, double price, int quantity) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setPrice(double price) {
		if(price > 0.0)
		this.price = price;
	}
	
	public void adjustStock(int quantityStock){
		int newQuantity = this.quantity + quantityStock;
		if(newQuantity >= 0){
			this.quantity = quantityStock;
		}
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Entering equals method");
		if(obj == this){
			return true;
		}
		if(obj == null || obj.getClass()!= this.getClass()){
			return false;
		}
		String objName = ((SortedStock) obj).getName();
		return this.name.equals(objName);
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + 37;
	}
	
	@Override
	public int compareTo(SortedStock o) {
		System.out.println("Entering SortedStock.compareTo");
		if(this == o){
		return 0;
		}
		if(o != null){
			return this.name.compareTo(o.getName());
		}
		throw new NullPointerException();
	}
	@Override
	public String toString() {
		return this.name + " price : "+this.price;
	}
	
	
		
		
	
	
	
	
	
	
	
	

}
