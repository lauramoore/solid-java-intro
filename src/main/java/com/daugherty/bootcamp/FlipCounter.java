package com.daugherty.bootcamp;

/**
 * A Stateful object that aggregates coin flip totals and provides for
 * displaying the results
 * 
 * @author lkm0106
 *
 */
public class FlipCounter {
	// Constants defined to improve readability
	private static final int HEADS = 0;
	private static final int TAILS = 1;

	// Encapsulated state, not accessible to any other class
	private int totHeads = 0;
	private int totTails = 1;

	/**
	 * track a result from a flip.
	 * 
	 * @param result
	 */
	public void count(int result) {
		if (result == HEADS)
			totHeads++;
		if (result == TAILS)
			totTails++;
	}

	/**
	 * Formatting results into a String All java classes inherit from
	 * java.lang.Object which defines the toString method.
	 */
	@Override
	public String toString() {
		return String.format("H: %d T: %d", totHeads, totTails);
	}

}
