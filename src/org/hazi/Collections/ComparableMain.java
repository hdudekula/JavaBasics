package org.hazi.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {
		ComparableDemo comparableDemo = new ComparableDemo("srinivas", 10, 5);
		
		if(comparableDemo.reservedSeat("A02")){
			System.out.println("Please pay for A02");
		} else {
			System.out.println("seat is already booked");
		}
		
		if(comparableDemo.reservedSeat("B02")){
			System.out.println("Please pay for B02");
		} else {
			System.out.println("seat is already booked");
		}
		
		List<ComparableDemo.Seat> reverseSeat = new ArrayList<>(comparableDemo.getSeats());
		Collections.reverse(reverseSeat);
		printList(reverseSeat);
		
		List<ComparableDemo.Seat> priceSeats = new ArrayList<>(comparableDemo.getSeats());
		priceSeats.add(comparableDemo.new Seat("B00", 13.00));
		priceSeats.add(comparableDemo.new Seat("A00", 13.00));
		Collections.sort(priceSeats, comparableDemo.PRICE_ORDER);
		printList(priceSeats);
		
		
		
	}
	
	public static void printList(List<ComparableDemo.Seat> list){
		for(ComparableDemo.Seat seat : list){
			System.out.print(" "+ seat.getSeatNumber() + seat.getPrice());
		}
		System.out.println();
		System.out.println("========================================================");
	}

}
