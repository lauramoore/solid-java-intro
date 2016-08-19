/**
 * 
 */
package com.daugherty.bootcamp;

import java.util.Scanner;

/**
 * Java Main Class for launching the Feed Statistics Application
 *
 */
public class StatisticsApplication {

	/**
	 * This time we've added the ability to type input while our program runs
	 * using a Scanner and System.in
	 * 
	 * @param args:
	 *            String value application arguments
	 */
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to CoinTossGambler!");
		boolean running = true;

		while (running) {
			System.out.println("What's your prediction?");
			String prediction = scanner.next();

			System.out.println("How many rounds?");
			int runs = scanner.nextInt();

			System.out.println("You ..."); // determine win or loss and report
											// back

			System.out.println("Play Again Y/N?");
			String again = scanner.next();
			if ("N".equalsIgnoreCase(again)) {
				running = false;
			}
		}

	}

}
