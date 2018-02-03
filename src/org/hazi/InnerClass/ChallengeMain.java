package org.hazi.InnerClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ChallengeMain {
	
	private static ArrayList<ChallengeAlbums>	albums = new ArrayList<ChallengeAlbums>();

	public static void main(String[] args) {
		
		
		ChallengeAlbums album = new ChallengeAlbums("JaiHo", "Rahman");
		album.addSong("galgal", 15.60);
		album.addSong("cheliya", 21.50);
		album.addSong("Hello ramante", 5.60);
		album.addSong("golmal", 6.20);
		albums.add(album);
		
		album = new ChallengeAlbums("dinchuk", "DSP");
		album.addSong("Ninnukori", 4.60);
		album.addSong("padamani", 3.24);
		album.addSong("nenu nuvantoo", 6.47);
		albums.add(album);
		
		LinkedList<ChallengeSong> playList = new LinkedList<ChallengeSong>();
		albums.get(0).addToPlaylist("galgal", playList);
		albums.get(1).addToPlaylist("Ninnukori", playList);
		albums.get(0).addToPlaylist(2, playList);
		albums.get(1).addToPlaylist(2, playList);
		
		play(playList);
		
		

	}
	
	private static void play(LinkedList<ChallengeSong> playList){
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<ChallengeSong> listIterator = playList.listIterator();
		if(playList.size() == 0){
			System.out.println("no songs been added to playlist");
		}else {
			System.out.println("now playing, "+listIterator.next().toString());
			printMenu();
		}
		
		while(!quit){
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action){
			case 0 :
				System.out.println("now completed");
				quit = true;
				break;
				
			case 1 :
				if(!forward){
					if(listIterator.hasNext()){
						listIterator.next();
					}
					forward = true;
				}
				if(listIterator.hasNext()){
					System.out.println("now playing, "+listIterator.next().toString());
				}else {
					System.out.println("We have reached the end of the playlist");
				}
				break;
				
			case 2 :
				if(forward){
					if(listIterator.hasPrevious()){
						listIterator.previous();
					}
					forward = false;
				}
				if(listIterator.hasPrevious()){
					System.out.println("now playing, "+listIterator.previous().toString());
				}else {
					System.out.println("we have reached the start of the playlist");
				}
				break;
				
			case 3 :
				if(forward){
					if(listIterator.hasPrevious()){
					System.out.println("now replaying "+listIterator.previous().toString());
					forward = false;
					}else {
						System.out.println("we have reached starting of the lsit");
					}
					
				}else {
					if(listIterator.hasNext()){
						System.out.println("now replaying "+listIterator.next().toString());
						forward = true;
					}else {
						System.out.println("we have reached the end of the list");
					}
				}
				break;
				
			case 4 :
				printList(playList);
				break;
				
			case 5 :
				printMenu();
				break;
				
			case 6 :
				listIterator.remove();
				if(listIterator.hasNext()){
					System.out.println("now playing "+listIterator.next());
				}else if(listIterator.hasPrevious()){
					System.out.println("now playing " + listIterator.previous());
				}
				break;
			}
		}
	}
	
	private static void printMenu(){
		System.out.println("choose your option : press \n"+
							" 0 - to quit \n"+
							" 1 - to go forward \n"+
							" 2 - to go backward \n"+
							" 3 - to replay the current song \n"+
							" 4 - to printlist \n"+
							" 5 - to print menu \n" +
							" 6 - to remove song from the list");
	}
	
	private static void printList(LinkedList<ChallengeSong> playList){
		
		Iterator<ChallengeSong> iterator = playList.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}

}
