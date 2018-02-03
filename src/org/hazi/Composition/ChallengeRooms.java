package org.hazi.Composition;

public class ChallengeRooms {
	private int rooms;
	private Color color;
	private int cupBoards;
	private String bedType;
	public ChallengeRooms(int rooms, Color color, int cupBoards, String bedType) {
		this.rooms = rooms;
		this.color = color;
		this.cupBoards = cupBoards;
		this.bedType = bedType;
	}
	public int getRooms() {
		return rooms;
	}
	public Color getColor() {
		return color;
	}
	public int getCupBoards() {
		return cupBoards;
	}
	public String getBedType() {
		
		return bedType;
	}

}
