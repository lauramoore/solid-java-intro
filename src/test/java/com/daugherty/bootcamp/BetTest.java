package com.daugherty.bootcamp;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Once we added a way to inject Random into the Game we can use Mockito
 * to Mock Random api and have deterministic scenarios for testing.
 * @author lauramoore
 *
 */

public class BetTest {

	int runs = 5;
	

    Random mockRandom;
	
	Game game;
	
	@Before
	public void setup() {
		mockRandom = Mockito.mock(Random.class);
		game = new Game(mockRandom);
	}

	@Test
	public void testLosingGame() {
		String prediction = "H";
		Bet end = game.resolve(prediction, runs);
		assertEquals(Bet.LOSS, end.getStatus());
		assertEquals(-5, end.getWinnings(), 0);

	}

	@Test
	public void testWinningFirstToss() {
		/* This uses the Mockito fluent api to 
		 * 1) identify an expected method call
		 * 2) tell the mock what to return when called
		 */
		when(mockRandom.nextInt(2)).thenReturn(0);
		
		String prediction = "HHHHH";
		Bet end = game.resolve(prediction, runs);
		assertEquals("Should have won", Bet.WIN, end.getStatus());
		assertEquals("Should have cost $1", 99, end.getWinnings(), 0);

	}

	/**
	 * An extreme example showing that you can manage
	 * sequential calls to the stub and deterministically
	 * set a whole scenario
	 */
	@Test
	public void testWinningLastToss() {
		/**
		 * Doing 5 whole runs is probably overkill, but brings home the point
		 * that you can script a long running scenario if you do need to.
		 * 
		 * In this case we actually did uncover a pretty serious bug too!
		 */
		when(mockRandom.nextInt(2)).
		 thenReturn(0,1,1,1,1,0,0,1,1,1,0,0,0,1,1,0,0,0,0,1,0,0,0,0,0);

		String prediction = "HHHHH";
		Bet end = game.resolve(prediction, runs);
		
		assertEquals("Should have won", Bet.WIN, end.getStatus());
		assertEquals("Should have cost $5", 95, end.getWinnings(), 0);

	}

}
