package org.hazi.InnerClass;

public class ChallengeSong {
	private String title;
	private double duration;
	public ChallengeSong(String title, double duration) {
		super();
		this.title = title;
		this.duration = duration;
	}
	public String getTitle() {
		return title;
	}
	@Override
	public String toString() {
		return "title "+this.title + ":"+this.duration;
	}
	
	

	
	

}
