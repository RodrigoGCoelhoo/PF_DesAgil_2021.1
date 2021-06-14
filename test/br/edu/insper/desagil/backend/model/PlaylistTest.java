package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;
	
	private Playlist playlist;

	@BeforeEach
	void setUp() {
		playlist = new Playlist (0);
	}

	@Test
	void testRoundDownToZero() {
		playlist.putRating("Hashi", 1);
		playlist.putRating("Hage", 2);
		playlist.putRating("Pelicano", 3);
		playlist.putRating("Corsi", 3);
		
		assertEquals(2.0, playlist.averageRatings());
	}

	@Test
	void testRoundUpToHalf() {
		playlist.putRating("Hashi", 1);
		playlist.putRating("Hage", 2);
		playlist.putRating("Pelicano", 1);
		
		assertEquals(1.5, playlist.averageRatings());
	}

	@Test
	void testRoundDownToHalf() {
		playlist.putRating("Hashi", 1);
		playlist.putRating("Hage", 2);
		playlist.putRating("Pelicano", 2);
		
		assertEquals(1.5, playlist.averageRatings());
	}

	@Test
	void testRoundUpToOne() {
		playlist.putRating("Hashi", 1);
		playlist.putRating("Hage", 1);
		playlist.putRating("Pelicano", 2);
		playlist.putRating("Corsi", 3);
		
		assertEquals(2.0, playlist.averageRatings());
	}
}
