package org.hazi.Generics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
	private String name;
	int played=0;
	int won=0;
	int lost=0;
	int tied=0;
	
	private ArrayList<T> members = new ArrayList<>();

	public Team(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public boolean addPlayer(T player){
		if(members.contains(player)){
			System.out.println(player.getName() + " is already exists in team");
			return false;
		}else {
			members.add(player);
			System.out.println(player.getName() + " is added to team "+this.name);
			return true;
		}
	}
	
	public int numPlayers(){
		return this.members.size();
	}
	
	public void matchResult(Team<T> opponent, int ourscore, int theirscore){
		String message;
		if(ourscore > theirscore){
			message = " beat ";
			won++;
		}else if(ourscore == theirscore){
			message = " drew with ";
			tied++;
		}else{
			message = " lost to ";
			lost++;
		}
		played++;
		if(opponent != null){
			opponent.matchResult(null, ourscore, theirscore);
			System.out.println(this.getName() + message + opponent.getName());
		}
	}
	
	public int ranking(){
		return (won*2) + tied;
	}

	@Override
	public int compareTo(Team<T> team) {
		if(this.ranking() > team.ranking()){
			return -1;
		}else if(this.ranking() < team.ranking()){
			return 1;
		}else
			return 0;
		
	}


	
	

}
