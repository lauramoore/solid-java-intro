package com.daugherty.bootcamp;

import java.security.SecureRandom;

public class Game {
	public static final int DOLLAR_COST_PER_TOSS = -1;
	public static final int WINNINGS_ON_MATCH = 100;
	private SecureRandom random = new SecureRandom();

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
		int flip = random.nextInt(2);
		for (int i = 0; i < 5; i++) {
			result += (flip == 0) ? "H" : "T";
		}
		return result;
	}

}
