package org.hazi.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class ChallengePlayer implements ChallengeISavable{
	private String name;
	private int hitpoints;
	private int strength;
	private String weapon;
	public ChallengePlayer(String name, int hitpoints, int strength) {
		super();
		this.name = name;
		this.hitpoints = hitpoints;
		this.strength = strength;
		this.weapon = "sword";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHitpoints() {
		return hitpoints;
	}
	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	@Override
	public String toString() {
		return "ChallengePlayer [name=" + name + ", hitpoints=" + hitpoints + ", strength=" + strength + ", weapon="
				+ weapon + "]";
	}
	@Override
	public List<String> write() {
		List<String> values = new ArrayList<>();
		values.add(0, this.name);
		values.add(1, "" +this.hitpoints);
		values.add(2, "" +this.strength);
		values.add(3, "" +this.weapon);
		return values;
	}
	@Override
	public void read(List<String> savedValues) {
		if(savedValues != null && savedValues.size() > 0){
			this.name = savedValues.get(0);
			this.hitpoints = Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
			this.weapon = savedValues.get(3);
		}
		
	}
	
	
	
	

}
