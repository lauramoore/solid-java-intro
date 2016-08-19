package com.daugherty.bootcamp;

import java.security.SecureRandom;

/**
 * The Engine that generates a series of coin flips.
 * 
 * @author lkm0106
 *
 */
public class CoinFlipCounter {
	/**
	 * don't ever use java.math.Random when you need real randomness (Security
	 * seeds e.g.) it's easily predicted. Here we use SecureRandom as a better
	 * generator.
	 */
	private static SecureRandom generator = new SecureRandom();

	private CoinFlipCounter() {
		// singletons should not expose a public constructor.
	}

	public static void run(int flips) {
		FlipCounter counter = new FlipCounter();
		for (int i = 0; i < flips; i++) {
			int result = generator.nextInt(2);
			counter.count(result);
		}
		System.out.println(counter.toString());

	}

	/**
	 * At this time, this CoinFlipCounter is an example of an application
	 * Singleton. Singletons are popular as they simplify access and use of
	 * objects that can fully control all their dependencies and state.
	 * 
	 * But Singletons are the enemy of Object Oriented code. All they
	 * essentially do is fragment otherwise procedural code. They are not Open,
	 * and neither is code that depends on Singletons.
	 * 
	 * Given that all methods must be tied to objects, Static Singletons are
	 * appropriate to utility method constructs. See java.util.Math
	 * org.apache.StringUtils for examples.
	 */
}
