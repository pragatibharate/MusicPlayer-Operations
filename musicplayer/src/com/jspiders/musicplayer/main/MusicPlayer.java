package com.jspiders.musicplayer.main;

import java.util.Scanner;

import com.jspiders.musicplayer.operation.SongOperation;

public class MusicPlayer {
	static boolean loop = true;
	static SongOperation songOperation = new SongOperation();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		while (loop) {
			musicPlayer();
		}
	}
		
	public static void musicPlayer() {
		System.out.println("Select option: \n" + "1.Add/Remove song \n" + "2.Play song \n" + "3.Edit song \n" + "4.Exit");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			
			System.out.println("Select option: \n" + "1.Add a song \n" + "2.Remove a song \n" + "3.Back \n");
			int choice1= scanner.nextInt();
			switch (choice1) {
			case 1:
				System.out.println("how many song you want be added: ");
				songOperation.addSong();
				break;
				
			case 2:
				songOperation.removeSong();
				break;
				
			case 3:
				return;
			}
			
			break;
			
		case 2:
			
			System.out.println("select option: \n" + "1.Play all song \n" + "2.Play random song \n" + "3.Select song to play \n" + "Back" );
			int choice2= scanner.nextInt();
			switch (choice2) {
			case 1:
				songOperation.playAllSong();
				break;
				
			case 2:
				songOperation.playRandomSong();
				break;
				
			case 3:
				songOperation.playSpeificSong();
				break;
				
			case 4:
				return;
				
			}
			break;
			
		case 3:
			System.out.println("Edit song ");
			int choice3= scanner.nextInt();
			System.out.println();
			switch (choice3) {
			case 1:
				songOperation.editPlaylist();
				break;

			case 2:
				return;
			}
			break;
			
		case 4:
	       System.out.println("Thank you");
	       loop=false;
			break;

		default:
			System.out.println("Invalid choice");
			loop= false;
			break;
		}
	}
	
}
