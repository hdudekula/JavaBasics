package org.hazi.Composition;

public class ChallengeMain {

	public static void main(String[] args) {
		ChallengeRooms theRooms = new ChallengeRooms(4, new Color("yellow", "blue"), 8, "double-cot");
		ChallengeFurniture theFurniture = new ChallengeFurniture(4, 5, 7, 8);
		ChallengeFacilities theFacilities = new ChallengeFacilities(15, 10, 5, true);
		ChallengeHouse theHouse = new ChallengeHouse(theRooms, theFurniture, theFacilities);
		theHouse.roomColor();
		System.out.println(theHouse.getFurniture().getWindows());

	}

}
