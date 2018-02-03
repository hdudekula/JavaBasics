package org.hazi.Generics;

public class Main {

	public static void main(String[] args) {
		FootballPlayer hazi = new FootballPlayer("hazi");
		SoccerPlayer pavan = new SoccerPlayer("pavan");
		BaseballPlayer sai = new BaseballPlayer("sai");
		
		Team<FootballPlayer> indianLions = new Team<>("Indian Lions");
		indianLions.addPlayer(hazi);
		//indianLions.addPlayer(pavan);
		//indianLions.addPlayer(sai);
		
		System.out.println(indianLions.numPlayers());
		
		Team<SoccerPlayer> soccerPlayer = new Team<>("Soccer Player");
		soccerPlayer.addPlayer(pavan);
		
		System.out.println(soccerPlayer.numPlayers());
		
		Team<BaseballPlayer> baseballPlayer = new Team<>("Baseball Player");
		baseballPlayer.addPlayer(sai);
		
		System.out.println(baseballPlayer.numPlayers());
		
		Team<FootballPlayer> chennai = new Team<>("Chennai Super Kings");
		FootballPlayer dhoni = new FootballPlayer("dhoni");
		chennai.addPlayer(dhoni);
		
		Team<FootballPlayer> hyderabad = new Team<>("Sun Risers Hyderabad");
		
		Team<FootballPlayer> mumbai = new Team<>("Mumbai Indians");
		
		chennai.matchResult(mumbai, 10, 2);
		chennai.matchResult(hyderabad, 2, 50);
		mumbai.matchResult(hyderabad, 20, 100);
		
		System.out.println("Rankings");
		System.out.println("*************************");
		System.out.println(chennai.getName() + "Ranking : " +chennai.ranking());
		System.out.println(mumbai.getName() + " Ranking : "+mumbai.ranking());
		System.out.println(hyderabad.getName() + " Ranking : "+hyderabad.ranking());

	}

}
