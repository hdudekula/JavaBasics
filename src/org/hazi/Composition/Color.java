package org.hazi.Composition;

public class Color {
	private String roomColor;
	private String outsideColor;
	public Color(String roomColor, String outsideColor) {
		this.roomColor = roomColor;
		this.outsideColor = outsideColor;
	}
	public String getRoomColor() {
		return roomColor;
	}
	public String getOutsideColor() {
		return outsideColor;
	}

}
