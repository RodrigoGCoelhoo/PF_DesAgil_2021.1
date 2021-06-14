package br.edu.insper.desagil.backend.model;

import java.util.List;

public class CollaborationTrack extends Track{
	
	private List <Artist> artists;

	public CollaborationTrack(Artist artist, List<Artist> artists, String name, int duration) {
		super(artist, name, duration);
		this.artists = artists;
	}
	
	@Override
	public String getFullArtistName() {
		
		String colab = this.artist.getName() + " (feat. ";
		
		if (this.artists.size() == 1) {
			return colab + this.artists.get(0).getName() + ")";
		}
		
		for (Artist artist: this.artists) {
				
			if (artist == this.artists.get(this.artists.size() - 1)) {

				colab += artist.getName() + ")";
					
			} else if (artist == this.artists.get(0)) {
					
				colab += artist.getName() + ", ";
					
			} 
		}
			
		return colab;
			

	}

}
