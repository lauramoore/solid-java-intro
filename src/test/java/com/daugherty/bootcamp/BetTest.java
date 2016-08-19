package com.daugherty.bootcamp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BetTest {

	int runs = 5;
	Game game = new Game();

	@Test
	public void testLosingGame() {
		String prediction = "H";
		Bet end = game.resolve(prediction, runs);
		assertEquals(Bet.LOSS, end.getStatus());
		assertEquals(-5, end.getWinnings(), 0);

	}

	@Test
	public void testWinningFirstToss() {
		String prediction = "HHHHH";
		Bet end = game.resolve(prediction, runs);
		assertEquals(Bet.WIN, end.getStatus());
		assertEquals(99, end.getWinnings(), 0);

	}

	@Test
	public void testWinningLastToss() {
		String prediction = "HHHHH";
		Bet end = game.resolve(prediction, runs);
		assertEquals(Bet.WIN, end.getStatus());
		assertEquals(95, end.getWinnings(), 0);

	}

}
