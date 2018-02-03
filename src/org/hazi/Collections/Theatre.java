package org.hazi.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class Theatre {
	private  final String theatreName;
	private List<Seat> seats = new ArrayList<>();
	
	public Theatre(String theatreName, int numRows, int seatsPerRow) {
		super();
		this.theatreName = theatreName;
		
		int lastRow = 'A' + (numRows -1);
		for(char row = 'A'; row<= lastRow; row++){
			for(int seatNum = 1; seatNum <=  seatsPerRow; seatNum++){
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			}
			
		}
	}

	public String getTheatreName() {
		return theatreName;
	}
	
	public boolean reservedSeat(String seatNumber){
		//Seat requestSeat = null;
		Seat requestSeat = new Seat(seatNumber);
		int foundSeat = Collections.binarySearch(seats, requestSeat, null);
		if(foundSeat >= 0){
			return seats.get(foundSeat).reserve();
		}else {
			System.out.println("no seats found  "+ seatNumber);
			return false;
		}
		/*for(Seat seat : seats){
			if(seat.getSeatNumber().equals(seatNumber)){
				requestSeat = seat;
				break;
			}
		}
		if(requestSeat == null){
			System.out.println("There is no seat "+seatNumber);
			return false;
		}
		return requestSeat.reserve();
	*/}
	
	//for testing
	
	public void getSeats(){
		for(Seat seat : seats){
			System.out.println(seat.getSeatNumber());
		}
	}
	
	
	private class Seat implements Comparable<Seat >{
		private final String seatNumber;
		private boolean reserved = false;
		public Seat(String seatNumber) {
			super();
			this.seatNumber = seatNumber;
		}
		
		
		
		@Override
		public int compareTo(Seat seat) {
			
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}



		public boolean reserve(){
			if(!this.reserved){
				this.reserved = true;
				System.out.println("Seat " + seatNumber +" reserved");
				return true;
			}else {
				return false;
			}
		}
		
		public boolean cancelReserve(){
			if(this.reserved){
				this.reserved = false;
				System.out.println("reservation of seat "+ seatNumber +" cancelled");
				return true;
			}else {
				return false;
			}
		}

		public String getSeatNumber() {
			return seatNumber;
		}
		
		
		
	}
	
	
	
	
	

}
