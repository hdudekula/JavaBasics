package org.hazi.Generics.Challenge;

import java.util.ArrayList;

public class League<L> {
	String name;
	int won = 0;
	int lost = 0;
	
	ArrayList<L> members = new ArrayList<>();

	public League(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public boolean addPlayer(L player){
		if(members.contains(player)){
			System.out.println(player +" is already exist in the team");
			return false;
		}else {
			members.add(player);
			System.out.println(this.getName() + " added to team" +this.name);
			return true;
		}
	}

}
