package br.edu.insper.desagil.backend.model;

public class Track {
	
	Artist artist;
	String name;
	int duration;
	
	public Track(Artist artist, String name, int duration) {
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}

	public Artist getArtist() {
		return this.artist;
	}

	public String getName() {
		return this.name;
	}

	public int getDuration() {
		return this.duration;
	}

	public String getDurationString() {
		
		String stringDuration;
		int segundos = this.duration;
		int minutos = 0;
		
		while (segundos >= 60) {
				
			minutos += 1;
			segundos -= 60;
				
		}
		
		if (segundos < 10) {
			
			stringDuration = minutos + ":0" + segundos;
			
		} else {
			
			stringDuration = minutos + ":" + segundos;
			
		}
		
		return stringDuration;
	}
	
	public String getFullArtistName() {
		
		return this.artist.getName();
	}

}
