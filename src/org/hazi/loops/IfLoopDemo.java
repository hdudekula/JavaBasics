package org.hazi.loops;

public class IfLoopDemo {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 5000;
		int level = 5;
		int bonus =100;
	
		if(gameOver){
			int finalScore = score + (level * bonus);
			System.out.println("the finalscore was " +finalScore);
		
		}
		score = 10000;
		level = 8;
		bonus = 200;
		if (gameOver){
			int finalScore = score + (level * bonus);
			System.out.println("the finalscore was " +finalScore);
		}

	}

}
