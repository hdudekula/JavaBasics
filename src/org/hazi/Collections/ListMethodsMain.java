package org.hazi.Collections;

import java.util.*;

public class ListMethodsMain {

	public static void main(String[] args) {
		ListMethods listMethod = new ListMethods("Srinivasa", 10, 8);
		List<ListMethods.Seat> seatCopy = new ArrayList<>(listMethod.seats);
		printList(seatCopy);
		seatCopy.get(1).reserve();
		if(listMethod.reservedSeat("A02")){
			System.out.println("Please pay for A02");
		} else {
			System.out.println("seat is already booked");
		}
		Collections.reverse(seatCopy);
		//Collections.shuffle(seatCopy);
		System.out.println("print seatCopy");
		printList(seatCopy);
		System.out.println("printing theatre seats");
		printList(listMethod.seats);
		
		ListMethods.Seat minSeat = Collections.min(seatCopy);
		ListMethods.Seat maxSeat = Collections.max(seatCopy);
		System.out.println("the minimum seat is "+minSeat.getSeatNumber());
		System.out.println("the maximum seat is "+maxSeat.getSeatNumber());
		
		sortList(seatCopy);
		System.out.println("Printing sorted seatcopy");
		printList(seatCopy);
		

	}
	
	public static void printList(List<ListMethods.Seat> list){
		for(ListMethods.Seat seat : list){
			System.out.print(" "+ seat.getSeatNumber());
		}
		System.out.println();
		System.out.println("========================================================");
	}
	
	public static void sortList(List<? extends ListMethods.Seat> list){
		for(int i=0; i<list.size()-1; i++){
			for(int j=i+1; j<list.size(); j++){
				if(list.get(i).compareTo(list.get(j)) > 0){
					Collections.swap(list, i, j);
				}
				
			}
		}
	}

}
