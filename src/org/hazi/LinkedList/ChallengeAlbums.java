package org.hazi.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ChallengeAlbums {
	private String name;
	private String artist;
	private ArrayList<ChallengeSong> song;
	public ChallengeAlbums(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.song = new ArrayList<ChallengeSong>();
	}
	
	public boolean addSong(String title, double duration){
		if(findSong(title)==null){
			this.song.add(new ChallengeSong(title, duration));
			return true;
		}
		return false;
	}
	
	private ChallengeSong findSong(String title){
		for(ChallengeSong checkedSong: this.song){
			if(checkedSong.getTitle().equals(title)){
				return checkedSong;
			}
		}
		return null;
	}
	
	public boolean addToPlaylist(int trackNumber, LinkedList<ChallengeSong> playList){
		int index = trackNumber -1;
		if((index > 0) && (index <= this.song.size())){
			playList.add(this.song.get(index));
			return true;
			
		}
		
		System.out.println("trackNumber does not exist "+trackNumber );
		return false;
	}
	
	public boolean addToPlaylist(String title, LinkedList<ChallengeSong> playList){
		ChallengeSong checkedSong = findSong(title);
		if(checkedSong != null){
			playList.add(checkedSong);
			return true;
		}
		System.out.println("the song "+title + " does not exist in the album");
		return false;
	}
	
	
	
	
	
	

}
