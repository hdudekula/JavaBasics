package org.hazi.Collections.MapsDemo.Adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdventureMain {
	private static Map<Integer, Location>  locations = new HashMap<Integer, Location>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		locations.put(0, new Location(0, "You are sitting in the centre of the road"));
		locations.put(1, new Location(1, "You are going towards the volcano"));
		locations.put(2, new Location(2, "You are in the centre of the forest"));
		locations.put(3, new Location(3, "you are at the end of the road"));
		locations.put(4, new Location(4, "You are going to jump off the hill"));
		locations.put(5, new Location(5, "You are swimming"));
		
		
		locations.get(1).addExits("W", 2);
		locations.get(1).addExits("E", 3);
		locations.get(1).addExits("S", 4);
		locations.get(1).addExits("N", 5);
		
		
		locations.get(2).addExits("N", 5);
		
		
		locations.get(3).addExits("W", 2);
		locations.get(3).addExits("Q", 0);
		
		locations.get(4).addExits("N", 5);
		locations.get(4).addExits("W", 2);
		
		
		locations.get(5).addExits("S", 4);
		locations.get(5).addExits("W", 2);
		
		Map<String, String> vocabulary = new HashMap<String, String>();
		vocabulary.put("QUIT", "Q");
		vocabulary.put("EAST", "E");
		vocabulary.put("WEST", "W");
		vocabulary.put("SOUTH", "S");
		vocabulary.put("NORTH", "N");
		
		int loc= 1;
		while(true){
			System.out.println(locations.get(loc).getDescription());
			if(loc == 0){
				break;
			}
			
			Map<String, Integer> exits = locations.get(loc).getExits();
			System.out.print("Available exits are ");
			for(String exit : exits.keySet()){
				System.out.print(exit + " , ");
			}
			System.out.println();
			
			String direction = scanner.nextLine().toUpperCase();
			if(direction.length() > 1){
				String[] words = direction.split(" ");
				for(String word : words){
					if(vocabulary.containsKey(word)){
						direction = vocabulary.get(word);
						break;
					}
				}
			}
			if(exits.containsKey(direction)){
				loc = exits.get(direction);
			}else {
				System.out.println("You cannot go in that direction");
			}
			
			
		}
		
		/*uncomment below block level comment if you want demo on how split works*/
	/*	String[] road = "Hello this line is going to be split into each word".split(" ");
		for(String i: road){
			System.out.println(i);
		}
		
		String[] building = "Hello building you are going to split, after the comma delimiter".split(",");
		for(String i: building){
			System.out.println(i);
		}*/

	}

}
