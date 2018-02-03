package org.hazi.Composition;

public class ChallengeHouse {
	private ChallengeRooms rooms;
	private ChallengeFurniture furniture;
	private ChallengeFacilities facilities;
	public ChallengeHouse(ChallengeRooms rooms, ChallengeFurniture furniture, ChallengeFacilities facilities) {
		super();
		this.rooms = rooms;
		this.furniture = furniture;
		this.facilities = facilities;
	}
	
	public void roomColor(){
		System.out.println(rooms.getBedType());
		System.out.println(facilities.getInvertors());
		System.out.println(rooms.getColor().getOutsideColor());
	}

	public ChallengeFurniture getFurniture() {
		return furniture;
	}


}
