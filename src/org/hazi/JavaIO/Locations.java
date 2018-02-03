package org.hazi.JavaIO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Locations implements Map<Integer, Location> {

	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

	/*usage of throws IOException next to main
	 * is to demonstrate how the checked exceptions can be thrown 
	 * and we can remove catch block */
	public static void main(String[] args) throws IOException{
		
		/*below is one more way to handle exception with
		 * try with resources. It is included in Java 7 onwards */
		
		try(FileWriter locFile = new FileWriter("D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi//JavaIO/JavaIOlocation.txt")){
			for(Location location : locations.values()){
				locFile.write(location.getLocationID() + ", " + location.getDescription() + " \n");
			}
		}
//		FileWriter locFile = null;
//		try {
//			locFile = new FileWriter("D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi//JavaIO/JavaIOlocation.txt");
//			for (Location location : locations.values()) {
//				locFile.write(location.getLocationID() + " , " + location.getDescription() + "\n");
//			}
//
//		} finally {
//			System.out.println("We are in finally block");
//			try {
//				if (locFile != null) {
//					System.out.println("Attempting to close the locfile");
//					locFile.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}

	static {

		Map<String, Integer> tempExit = new HashMap<String, Integer>();

		locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", null));

		tempExit = new HashMap<String, Integer>();

		tempExit.put("W", 2);

		tempExit.put("E", 3);

		tempExit.put("S", 4);

		tempExit.put("N", 5);

		locations.put(1,
				new Location(1, "You are standing at the end of a road before a small brick building", tempExit));

		tempExit = new HashMap<String, Integer>();

		tempExit.put("N", 5);

		locations.put(2, new Location(2, "You are at the top of a hill", tempExit));

		tempExit = new HashMap<String, Integer>();

		tempExit.put("W", 1);

		locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExit));

		tempExit = new HashMap<String, Integer>();
		tempExit.put("N", 1);
		tempExit.put("W", 2);
		locations.put(4, new Location(4, "You are in a valley beside a stream", tempExit));

		tempExit = new HashMap<String, Integer>();
		tempExit.put("S", 1);
		tempExit.put("W", 2);
		locations.put(5, new Location(5, "You are in the forest", tempExit));

	}

	@Override
	public void clear() {
		locations.clear();

	}

	@Override
	public boolean containsKey(Object key) {

		return locations.containsKey(key);
	}

	@Override
	public boolean containsValue(Object key) {

		return locations.containsKey(key);
	}

	@Override
	public Set<java.util.Map.Entry<Integer, Location>> entrySet() {

		return locations.entrySet();
	}

	@Override
	public Location get(Object arg0) {

		return locations.get(arg0);
	}

	@Override
	public boolean isEmpty() {

		return locations.isEmpty();
	}

	@Override
	public Set<Integer> keySet() {

		return locations.keySet();
	}

	@Override
	public Location put(Integer arg0, Location arg1) {

		return locations.put(arg0, arg1);
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends Location> arg0) {

	}

	@Override
	public Location remove(Object arg0) {

		return locations.remove(arg0);
	}

	@Override
	public int size() {

		return locations.size();
	}

	@Override
	public Collection<Location> values() {
		// TODO Auto-generated method stub
		return locations.values();
	}

}
