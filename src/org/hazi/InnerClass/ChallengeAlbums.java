package org.hazi.InnerClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ChallengeAlbums {
	private String name;
	private String artist;
	private SongList song;
	public ChallengeAlbums(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.song = new SongList();
	}
	

	
	public boolean addSong(String title, double duration){
		return this.song.add(new ChallengeSong(title, duration));
		
	}
	

	
	public boolean addToPlaylist(int trackNumber, LinkedList<ChallengeSong> playList){
		ChallengeSong checkedSong = this.song.findSong(trackNumber);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		
		System.out.println("trackNumber does not exist "+trackNumber );
		return false;
	}
	
	public boolean addToPlaylist(String title, LinkedList<ChallengeSong> playList){
		ChallengeSong checkedSong = song.findSong(title);
		if(checkedSong != null){
			playList.add(checkedSong);
			return true;
		}
		System.out.println("the song "+title + " does not exist in the album");
		return false;
	}
	
	private class SongList{
		ArrayList<ChallengeSong> songs;

		public SongList() {
			super();
			this.songs = new ArrayList<ChallengeSong>();
		}
		
		public boolean add(ChallengeSong song){
			if(songs.contains(song)){
				return false;
			}
			this.songs.add(song);
				return true;
			
		}
		
		private ChallengeSong findSong(String title){
			for(ChallengeSong checkedSong: this.songs){
				if(checkedSong.getTitle().equals(title)){
					return checkedSong;
				}
			}
			return null;
		}
		
		private ChallengeSong findSong(int trackNumber){
			int index = trackNumber -1;
			if((index > 0) && (index<songs.size())) {
				return songs.get(index);
			}
			return null;
		}
		
		
	}
	
	
	
	
	

}
