package org.hazi.JavaIO;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SerializableLocation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int locationID;
	private final String description;
	private final Map<String, Integer> exits;

	public SerializableLocation(int locationID, String description, Map<String, Integer> exits) {
		super();
		this.locationID = locationID;
		this.description = description;
		if (exits != null) {
			this.exits = new HashMap<String, Integer>(exits);
		} else {
			this.exits = new HashMap<String, Integer>();
		}
		this.exits.put("Q", 0);

	}

	public int getLocationID() {
		return locationID;
	}

	public String getDescription() {
		return description;
	}

	public Map<String, Integer> getExits() {
		return new HashMap<String, Integer>(exits);
	}

}
