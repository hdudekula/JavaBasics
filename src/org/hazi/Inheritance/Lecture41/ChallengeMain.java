package org.hazi.Inheritance.Lecture41;

public class ChallengeMain {

	public static void main(String[] args) {
		ChallengeVehicle vehicle = new ChallengeVehicle(1,1,1,1);
		ChallengeCar car = new ChallengeCar(4,1, "dodge", "exhaust", "MRF");
		ChallengeDodge dodge = new ChallengeDodge("exhaust", "MRF", "blue", "highend");
		dodge.gearSystem();
		dodge.highSpeed();

	}

}
