package com.jspiders.musicplayer.operation;

import java.util.ArrayList;
import java.util.Scanner;

public class SongOperation {

	Song song = new Song();
	Scanner scanner = new Scanner(System.in);
	
	ArrayList<Song>playList = new ArrayList<Song>();
	static int var=0;
	public void addSong() {
		int noOfSong = scanner.nextInt();
		for(int i=0; i<noOfSong ;i++) {
			playList.add(new Song());
			System.out.println("Enter the song id: ");
			int id = scanner.nextInt();
			playList.get(var).setId(id);
			
			System.out.println("Enter the song name: ");
			String sname = scanner.next();
			playList.get(var).setName(sname);
			
			System.out.println("Enter the movie/album of song: ");
			String mname = scanner.next();
			playList.get(var).setMovieAlbum(mname);
			
			System.out.println("Enter the length of song: ");
			double length = scanner.nextDouble();
			playList.get(var).setLength(length);
			
			System.out.println("Enter the singer of the song: ");
			String sName = scanner.next();
			playList.get(var).setSinger(sName);
			
			System.out.println("Enter the composer of song: ");
			String cName = scanner.next();
			playList.get(var).setComposer(cName);
			
			System.out.println("Enter the lyricist od the song: ");
			String lName = scanner.next();
			playList.get(var).setLyricist(lName);
			
			var++;
			System.out.println(playList.size() + " Song added successfully");
			
			
		}
		
	}
	
	public void viewAllSong() {
		if(playList.isEmpty()) {
			System.out.println("There is no song added in the playlist" + "Add songs then you will get songlist.");
			addSong();
		}
		else {
			for(Song song1:playList) {
				System.out.println(song1.getName());
			}
		}
	}
	
	public void removeSong() {
		if (playList.isEmpty()) {
			System.out.println("Add song then remove...");
			addSong();
		}
		System.out.println("Select song to remove.");
		viewAllSong();
		int removeId = scanner.nextInt();
		System.out.println(playList.get(removeId - 1).getName()+" removed Successfully...");
		playList.remove(removeId - 1);
		viewAllSong();
	}
		
	public void playAllSong() {
			if (playList.isEmpty()) {
				System.out.println("Add songs then play..");
				addSong();
			}
			System.out.println("Playing all songs");
			for(Song song : playList) {
				System.out.println(song.getName());
			}
		}
	
	 public void playRandomSong() {
			if(playList.isEmpty()) {
				System.out.println(" first Add songs then play...");
				addSong();
			}
			System.out.println("Playing random songs");
	    	double number = Math.random();
	    	int random = (int) (number * 10) + 1;
	    	if (random>playList.size()) {
				random = 0;
			}
	    	System.out.println("Playing song "+ playList.get(random).getName());
		}
	 
	 public void playSpeificSong() {
			if (playList.isEmpty()) {
				System.out.println("Add songs then play...");
				addSong();
			}
			System.out.println("Select song to play.");
			viewAllSong();
			int play = scanner.nextInt();
			System.out.println("Playing song "+playList.get(play - 1).getName());
	   	}
		
	 public void editPlaylist() {
	    	if (playList.isEmpty()) {
				System.out.println("Add songs then edit the song..");
				addSong();
			}
	    	System.out.println("Select song to edit");
			viewAllSong();
			int edit = scanner.nextInt();
			playList.remove(edit - 1);
//			Song song1 = new Song();
			
			System.out.println("Enter the new Id for song: ");
			song.setId(scanner.nextInt());
			
			System.out.println("Enter the new Name for song: ");
			song.setName(scanner.next());
			
			System.out.println("Enter the new Movie Name for song: ");
			song.setMovieAlbum(scanner.next());
			
			System.out.println("Enter the new Length for song: ");
//			double length = scanner.nextDouble();
			song.setLength(scanner.nextDouble());
			
			System.out.println("Enter the new Composer Name for song: ");
			song.setComposer(scanner.next());
			
			System.out.println("Enter the new Lyrist Name for song: ");
			song.setLyricist(scanner.next());
			
			playList.add(edit - 1,song);
			System.out.println(playList.get(edit - 1).getName()+" song updated details added successfully.");
	   	}
}
