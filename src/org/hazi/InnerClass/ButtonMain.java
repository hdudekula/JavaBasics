package org.hazi.InnerClass;

import java.util.Scanner;

public class ButtonMain {
	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("print");

	public static void main(String[] args) {
		
		/**declaration of a local class **/ 
		/** remove block level comment for below local class if you need demo of local class**/
	/*	class ClickListener implements Button.OnClickListener {
			public ClickListener(){
				System.out.println("I've been attached");
			}

			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked");
				
			}
		
		}
		btnPrint.setOnClickListener(new ClickListener());
		
		
		
*/		

		/**declaration of anonymous class**/
		
		btnPrint.setOnClickListener(new Button.OnClickListener() {
			
			
			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked");
				
			}
		});
listen();

	}
	
	private static void listen() {
		boolean quit = false;
		while(!quit){
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice){
			case 0 :
				quit = true;
				break;
				
			case 1 :
				btnPrint.onClick();
				break;
			}
		}
	}

}
