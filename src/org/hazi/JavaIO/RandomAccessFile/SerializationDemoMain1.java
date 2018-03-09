package org.hazi.JavaIO.RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SerializationDemoMain1 implements Map<Integer, SerializableLocation1> {
	private static Map<Integer, SerializableLocation1> locations = new LinkedHashMap<Integer, SerializableLocation1>();
	private static Map<Integer, IndexRecord> index = new LinkedHashMap<Integer, IndexRecord>();
	private static RandomAccessFile ra;

	public static void main(String[] args) throws IOException {
		try (RandomAccessFile rao = new RandomAccessFile(
				"D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi/JavaIO/RandomAccessFile/location_rand.dat",
				"rwd")) {
			rao.writeInt(locations.size());
			int indexSize = locations.size() * 3 * Integer.BYTES;
			int locationStart = (int) (indexSize + rao.getFilePointer() + Integer.BYTES);
			rao.writeInt(locationStart);

			long indexStart = rao.getFilePointer();
			int startPointer = locationStart;
			rao.seek(startPointer);

			for (SerializableLocation1 location : locations.values()) {
				rao.writeInt(location.getLocationID());
				rao.writeUTF(location.getDescription());

				StringBuilder builder = new StringBuilder();
				for (String direction : location.getExits().keySet()) {
					if (!direction.equalsIgnoreCase("Q")) {
						builder.append(direction);
						builder.append(",");
						builder.append(location.getExits().get(direction));
						builder.append(",");
					}
				}
				rao.writeUTF(builder.toString());

				IndexRecord record = new IndexRecord(startPointer, (int) (rao.getFilePointer() - startPointer));
				index.put(location.getLocationID(), record);

				startPointer = (int) rao.getFilePointer();

			}
			rao.seek(indexStart);
			for (Integer locationID : index.keySet()) {
				rao.writeInt(locationID);
				rao.writeInt(index.get(locationID).getStartByte());
				rao.writeInt(index.get(locationID).getLength());
			}

		}
	}

	static {

		try {
			ra = new RandomAccessFile(
					"D:/hazi_5307/workspace/AAAA/JAVABasics/src/org/hazi/JavaIO/RandomAccessFile/location_rand.dat",
					"rwd");
			int numLocations = ra.readInt();
			long locationStartPoint = ra.readInt();

			while (ra.getFilePointer() < locationStartPoint) {
				int locationId = ra.readInt();
				int locationStart = ra.readInt();
				int locationLength = ra.readInt();

				IndexRecord record = new IndexRecord(locationStart, locationLength);
				index.put(locationId, record);
			}
		} catch (IOException e) {
			System.out.println("IOEXception in static block " + e.getMessage());
		}

	}

	public SerializableLocation1 getLocation(int locationId) throws IOException {
		IndexRecord record = index.get(locationId);
		ra.seek(record.getStartByte());
		int id = ra.readInt();
		String description = ra.readUTF();
		String exits = ra.readUTF();
		String[] exitPart = new String(exits).split(",");

		SerializableLocation1 location = new SerializableLocation1(locationId, description, null);

		if (locationId != 0) {
			for (int i = 0; i < exitPart.length; i++) {
				System.out.println("exitPart =" + exitPart[i]);
				System.out.println("exitPart[+1 =" + exitPart[i + 1]);
				String direction = exitPart[i];
				int destination = Integer.parseInt(exitPart[++i]);

			}
		}
		return location;
	}

	static {
		Map<String, Integer> temp = new LinkedHashMap<String, Integer>();
		locations.put(0, new SerializableLocation1(0, "You are sitting idle", null));

		temp = new HashMap<String, Integer>();

		temp.put("W", 2);
		temp.put("S", 3);
		temp.put("N", 4);
		temp.put("E", 5);

		locations.put(1, new SerializableLocation1(1,
				"You are standing at the end of a road before a small brick building", temp));

		temp = new HashMap<String, Integer>();

		temp.put("N", 5);

		locations.put(2, new SerializableLocation1(2, "You are at the top of a hill", temp));

		temp = new HashMap<String, Integer>();

		temp.put("W", 1);

		locations.put(3,
				new SerializableLocation1(3, "You are inside a building, a well house for a small spring", temp));

		temp = new HashMap<String, Integer>();
		temp.put("N", 1);
		temp.put("W", 2);
		locations.put(4, new SerializableLocation1(4, "You are in a valley beside a stream", temp));

		temp = new HashMap<String, Integer>();
		temp.put("S", 1);
		temp.put("W", 2);
		locations.put(5, new SerializableLocation1(5, "You are in the forest", temp));

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
	public Set<java.util.Map.Entry<Integer, SerializableLocation1>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SerializableLocation1 get(Object key) {
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
	public SerializableLocation1 put(Integer key, SerializableLocation1 value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends SerializableLocation1> m) {
		// TODO Auto-generated method stub

	}

	@Override
	public SerializableLocation1 remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<SerializableLocation1> values() {
		// TODO Auto-generated method stub
		return null;
	}

	public void close() throws IOException {
		ra.close();
	}

}
