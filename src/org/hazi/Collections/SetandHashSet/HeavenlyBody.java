package org.hazi.Collections.SetandHashSet;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
	private final String name;
	private final double orbital;
	private final Set<HeavenlyBody> satellites;
	
	public HeavenlyBody(String name, double orbital) {
		super();
		this.name = name;
		this.orbital = orbital;
		this.satellites = new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public double getOrbital() {
		return orbital;
	}
	
	public boolean addMoon(HeavenlyBody moon){
		return this.satellites.add(moon);
	}

	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeavenlyBody other = (HeavenlyBody) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	
	
	
	
	
	
	

}
