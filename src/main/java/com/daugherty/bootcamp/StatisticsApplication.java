/**
 * 
 */
package com.daugherty.bootcamp;

/**
 * Java Main Class for launching the Feed Statistics Application
 *
 */
public class StatisticsApplication {

	private static final int DEFAULT_FLIPS = 1;

	/**
	 * If you've done any java, you will recognize the main method. This is the
	 * method the JVM will latch onto for entry into your application
	 * 
	 * @param args:
	 *            String value application arguments
	 */
	public static void main(String[] args) {
		int flips = DEFAULT_FLIPS;
		System.out.println("Running StatisticsApplication");
		if (args.length == 0) {
			System.out.println("Defaulting to 1 flip");
		} else {
			flips = Integer.parseInt(args[0]);
		}
		CoinFlipCounter.run(flips);

	}
	/**
	 * Why I built it this way: Single Responsibility limiting my Application to
	 * one concern, processing arguments and triggering CoinFlipLogic.
	 */
}
