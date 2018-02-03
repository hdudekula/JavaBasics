package org.hazi.SwitchDemo;

public class SwitchDemo {

	public static void main(String[] args) {
		char alphabets = 'D';
		
		switch(alphabets){
		
		case 'A' : 
			System.out.println("it was A");
			break;
		case 'B' :
			System.out.println("it was B");
			break;
		case 'C' : case 'D' : case 'E' :
			System.out.println("it was "+alphabets);
			break;
		default : 
			System.out.println("nothing was found");
			break;
		}

	}

}
