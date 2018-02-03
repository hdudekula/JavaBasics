package org.hazi.Encapsulation;

public class ChallengePrinter {
	private String companyName;
	private int tonerValue = 100;
	private int pageCount = 0;
	private boolean duplex;
	public ChallengePrinter(String company, int tonerValue, int pageCount, boolean duplex) {
		this.companyName = company;
		if(tonerValue>0 && tonerValue <= 100){
		this.tonerValue = tonerValue;
		}else {
			System.out.println("please fill in the catride");
		}
		this.pageCount = pageCount;
		this.duplex = duplex;
	}
	public String getCompany() {
		return companyName;
	}
	public int getTonerValue() {
		return tonerValue;
	}
	public int getPageCount() {
		if(pageCount>5 && pageCount<7){
			this.tonerValue = 70;
			
		}else if(pageCount>7 && pageCount<15){
				this.tonerValue = 30;
			} else if(pageCount>15){
				this.tonerValue = 0;
			}
		return pageCount;
	}
	public boolean isDuplex() {
		if(!duplex){
		System.out.println("the printer is not compatible for two side");
		}
		else{
			System.out.println("the printer is compatible for two side");
		}
		
		return duplex;
	}
	
	public int count(int pages){
		if(this.tonerValue > 0){
			pageCount = pageCount + pages;
			System.out.println("the total number of pages the printer has printed are "+pageCount);
		} else {
			System.out.println("please fill the catridge to print");
		}
		
		return pageCount;
	}
	
	public void remainingToner(){
		this.tonerValue = 100 - tonerValue;
		System.out.println("the remaining amount of toner requried is "+this.tonerValue);
	}

}
