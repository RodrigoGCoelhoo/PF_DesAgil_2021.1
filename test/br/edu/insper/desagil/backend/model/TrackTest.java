package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	
	private Artist hashiCantor = new Artist("Hashimoto");
	private Track track;
	CollaborationTrack colab;
	
	@BeforeEach
	void setUp() {
		
	}

	@Test
	void testZeroSeconds() {
		track = new Track(hashiCantor, "Backend em Java", 0);
		assertEquals("0:00", track.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		track = new Track(hashiCantor, "Backend em Java", 5);
		assertEquals("0:05", track.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		track = new Track(hashiCantor, "Backend em Java", 25);
		assertEquals("0:25", track.getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		track = new Track(hashiCantor, "Backend em Java", 60);
		assertEquals("1:00", track.getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		track = new Track(hashiCantor, "Backend em Java", 65);
		assertEquals("1:05", track.getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		track = new Track(hashiCantor, "Backend em Java", 85);
		assertEquals("1:25", track.getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		track = new Track(hashiCantor, "Backend em Java", 120);
		assertEquals("2:00", track.getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		track = new Track(hashiCantor, "Backend em Java", 125);
		assertEquals("2:05", track.getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		track = new Track(hashiCantor, "Backend em Java", 145);
		assertEquals("2:25", track.getDurationString());
	}

	@Test
	void testOneCollaborator() {
		
		Artist hajeCantor = new Artist("Haje");
		List<Artist> artistas = new ArrayList<>();
		artistas.add(hajeCantor);
		
		colab = new CollaborationTrack(hashiCantor, artistas, "Front em React", 165);
		
		assertEquals("Hashimoto (feat. Haje)", colab.getFullArtistName());
	}

	@Test
	void testTwoCollaborators() {
		Artist hajeCantor = new Artist("Hage");
		Artist pelicanoCantor = new Artist("Pelicano");
		List<Artist> artistas = new ArrayList<>();
		artistas.add(hajeCantor);
		artistas.add(pelicanoCantor);
		
		colab = new CollaborationTrack(hashiCantor, artistas, "Front em HTML puro", 165);
		
		assertEquals("Hashimoto (feat. Hage, Pelicano)", colab.getFullArtistName());
	}
}
