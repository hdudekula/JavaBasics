package org.hazi.JavaIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SerializationDemoMain implements Map<Integer, SerializableLocation> {
	private static Map<Integer, SerializableLocation> locations = new LinkedHashMap<Integer, SerializableLocation>();

	public static void main(String[] args) throws IOException {
		try (ObjectOutputStream dataFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(
				"D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi/JavaIO/Serialization.dat")))) {
			for (SerializableLocation location1 : locations.values()) {
				dataFile.writeObject(location1);
			}

		}
	}

	static {
		try (ObjectInputStream dataFile = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream("D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi/JavaIO/Serialization.dat")))) {
			boolean eof = false;
			while (!eof) {
				try {
					SerializableLocation location = (SerializableLocation) dataFile.readObject();
					System.out.println("Read Location " + location.getDescription() + " : " + location.getLocationID());
				} catch (EOFException e) {
					eof = true;
				}
			}
		} catch (IOException io) {
			System.out.println("IOException " + io.getMessage());

		} catch (ClassNotFoundException e) {
			System.out.println("Class " + e.getMessage());
		}
	}

	static {
		Map<String, Integer> temp = new LinkedHashMap<String, Integer>();
		locations.put(0, new SerializableLocation(0, "You are sitting idle", null));

		temp = new HashMap<String, Integer>();

		temp.put("W", 2);
		temp.put("S", 3);
		temp.put("N", 4);
		temp.put("E", 5);

		locations.put(1, new SerializableLocation(1,
				"You are standing at the end of a road before a small brick building", temp));

		temp = new HashMap<String, Integer>();

		temp.put("N", 5);

		locations.put(2, new SerializableLocation(2, "You are at the top of a hill", temp));

		temp = new HashMap<String, Integer>();

		temp.put("W", 1);

		locations.put(3,
				new SerializableLocation(3, "You are inside a building, a well house for a small spring", temp));

		temp = new HashMap<String, Integer>();
		temp.put("N", 1);
		temp.put("W", 2);
		locations.put(4, new SerializableLocation(4, "You are in a valley beside a stream", temp));

		temp = new HashMap<String, Integer>();
		temp.put("S", 1);
		temp.put("W", 2);
		locations.put(5, new SerializableLocation(5, "You are in the forest", temp));

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<java.util.Map.Entry<Integer, SerializableLocation>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SerializableLocation get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Integer> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SerializableLocation put(Integer key, SerializableLocation value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends SerializableLocation> m) {
		// TODO Auto-generated method stub

	}

	@Override
	public SerializableLocation remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<SerializableLocation> values() {
		// TODO Auto-generated method stub
		return null;
	}

}
