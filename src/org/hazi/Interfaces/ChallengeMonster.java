package org.hazi.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class ChallengeMonster implements ChallengeISavable {
	private String name;
	private int strength;
	private int points;
	public ChallengeMonster(String name, int strength, int points) {
		super();
		this.name = name;
		this.strength = strength;
		this.points = points;
	}
	@Override
	public String toString() {
		return "ChallengeMonster [name=" + name + ", strength=" + strength + ", points=" + points + "]";
	}
	public String getName() {
		return name;
	}
	public int getStrength() {
		return strength;
	}
	public int getPoints() {
		return points;
	}
	@Override
	public List<String> write() {
		ArrayList<String> values = new ArrayList<String>();
		values.add(0, this.name);
		values.add(1, "" + this.points);
		values.add(2, "" + this.strength);
		return values;
	}
	@Override
	public void read(List<String> savedValues) {
		if(savedValues != null && savedValues.size() > 0){
			this.name = savedValues.get(0);
			this.points = Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
		}
		
	}
	
	

}
