package com.jspiders.musicplayer.operation;

public class Song {
	int id;
	String name;
	String movieAlbum;
	double length;
	String singer;
	String composer;
	String lyricist;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMovieAlbum() {
		return movieAlbum;
	}

	public void setMovieAlbum(String movieAlbum) {
		this.movieAlbum = movieAlbum;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getLyricist() {
		return lyricist;
	}

	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}

	@Override
	public String toString() {
		return "Song: id=" + id + ", name=" + name + ", movieAlbum=" + movieAlbum + ", length=" + length + ", singer="
				+ singer + ", composer=" + composer + ", lyricist=" + lyricist + "]";
	}

	
}
