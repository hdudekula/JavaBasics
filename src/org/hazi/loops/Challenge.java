package org.hazi.loops;

public class Challenge {

	public static void main(String[] args) {
		String playerName;
		int score;
		int positionValue = calculateHighScorePosition(1500);
		displayHighScorePosition("hazi", positionValue);
		 positionValue = calculateHighScorePosition(400);
		displayHighScorePosition("hazi", positionValue);
		 positionValue = calculateHighScorePosition(900);
		displayHighScorePosition("hazi", positionValue);
		 positionValue = calculateHighScorePosition(50);
		displayHighScorePosition("hazi", positionValue);

	}

	public static void displayHighScorePosition(String playerName, int positionValue) {

		System.out.println(playerName + " managed to get into position " + positionValue + " on high score table");
	}

	public static int calculateHighScorePosition(int score) {
		
		if (score > 1000) {
			return 1;
		} else if (score > 500 && score < 1000) {
			return 2;
		} else if (score > 100 && score < 500) {
			return 3;
		} else {
			return 4;
		}
		

	}

}
