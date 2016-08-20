package com.daugherty.bootcamp;

import java.security.SecureRandom;
import java.util.Random;

public class Game {
	public static final int DOLLAR_COST_PER_TOSS = -1;
	public static final int WINNINGS_ON_MATCH = 100;
	private Random filpGenerator;
	
	/**
	 * Declaring the default constructor and setting SecureRandom
	 */
	public Game() {
		filpGenerator = new SecureRandom();
	}
	
	/**
	 * Adding a second constructor that allows injection of
	 * the Random Dependency.
	 */
	
	public Game(Random randomProvider) {
		this.filpGenerator = randomProvider;
	}
	
	/**
	 * Run a specific Betting scenario
	 * @param prediction
	 * @param runs
	 * @return
	 */

	public Bet resolve(String prediction, int runs) {

		for (int i = 0; i < runs; i++) {
			String result = generateRun();
			if (PredicitonMatcher.matches(result, prediction)) {
				return new Bet(winnings(i), Bet.WIN);
			}
		}
		return new Bet(losses(runs), Bet.LOSS);

	}

	private int winnings(int runs) {
		return 100 + losses(runs);
	}

	private int losses(int runs) {
		return (DOLLAR_COST_PER_TOSS * runs);
	}

	private String generateRun() {
		String result = "";
		int flip = filpGenerator.nextInt(2);
		for (int i = 0; i < 5; i++) {
			result += (flip == 0) ? "H" : "T";
		}
		return result;
	}

}
