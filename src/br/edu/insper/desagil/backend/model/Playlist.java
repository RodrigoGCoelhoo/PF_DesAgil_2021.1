package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	
	private int id;
	private List <Track> tracks;
	private Map<String, Integer> ratings;
	
	public Playlist(int id) {
		super();
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}

	public int getId() {
		return this.id;
	}

	public List<Track> getTracks() {
		return this.tracks;
	}

	public Map<String, Integer> getRatings() {
		return this.ratings;
	}
	

	public void addTrack(Track track) {
		this.tracks.add(track);
	}
	
	public void putRating(String nomeUsuario, int nota) {
		this.ratings.put(nomeUsuario, nota);
	}
	
	public double averageRatings() {
		
		double soma = 0;
		double quantidade = this.ratings.values().size();
		
		for (int nota: this.ratings.values()) {
			soma += nota;
		}
		
		double media = soma / quantidade;
		
		int inteiro = (int) media;
		double decimal = media - inteiro;
		
		if (decimal < 0.26) {
			return media - decimal;
		}
		
		else if (decimal >= 0.74 ) {
			return media - decimal + 1.0;
		}
		
		else {
			return media - decimal + 0.5;
		}
		
	}
	
}
