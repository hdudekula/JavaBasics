package org.hazi.Collections;

public class TheatreMain {

	public static void main(String[] args) {
		Theatre theatre = new Theatre("Alankar", 8, 10);
		theatre.getSeats();
		if(theatre.reservedSeat("B03")){
			System.out.println("Please pay");
		}else {
			System.out.println("Seat is not available");
		}
		if(theatre.reservedSeat("B03")){
			System.out.println("Please pay");
		}else {
			System.out.println("Seat is not available");
		}

	}

}
