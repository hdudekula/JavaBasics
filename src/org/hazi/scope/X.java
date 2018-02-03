package org.hazi.scope;

public class X {
	private int x;
	

	public X() {
		super();
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void x(){
		for(int x=0; x<=12; x++){
			System.out.println(this.x + " times "+x +" : is " +x*this.x);
		}
	}

}
