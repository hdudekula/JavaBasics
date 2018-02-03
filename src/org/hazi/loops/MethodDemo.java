package org.hazi.loops;

public class MethodDemo {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 10000;
		int levelCompleted = 8;
		int bonus =200;
		int player = 1;
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus, player);
		System.out.println("the final score of " +player + " player was "+highScore);
		player++;
		calculateScore(true, 2000, 3, 100, player);

	}
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus, int player){
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			return finalScore;
			
		}
		return -1;
		
	}
	

}
