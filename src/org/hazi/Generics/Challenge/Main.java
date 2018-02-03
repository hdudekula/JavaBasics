package org.hazi.Generics.Challenge;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Cricket hazi = new Cricket("hazi");
		Badminton sai = new Badminton("sai");
		
		League<Cricket> vijayawadaRebels = new League<>("Vijayawada Rebels");
		vijayawadaRebels.members.add(hazi);
		
		League<Cricket> SunRisersHyderabad = new League<>("SunRisers Hyderabad");
		
		League<Badminton> Sindhusix = new League<>("Sindhu Six");
		
		League<Badminton> Jwala = new League<>("Jwala");
		
		Jwala.addPlayer(sai);
		
		
		

	}

}
