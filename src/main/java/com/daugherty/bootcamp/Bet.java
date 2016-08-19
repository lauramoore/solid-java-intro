package com.daugherty.bootcamp;

public class Bet {
	public static final int WIN = 1;
	public static final int LOSS = 0;
	private int status;
	private double winnings;

	public Bet(int winnings, int status) {
		this.status = status;
		this.winnings = winnings;
	}

	public int getStatus() {
		return status;
	}

	public double getWinnings() {
		return winnings;
	}

}
