package com.daugherty.bootcamp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import PredictionMatcher.PredicitonMatcher;

/**
 * This is a Junit Test Case. You can run the checks with either the IDE or
 * Maven
 * 
 * To Run with IDE simply right-click this class and choose Run As > Junit Test.
 * Results are available in the Junit Tab
 * 
 * To Run with Maven right-click the project and choose Run As > Maven Test You
 * can view the XML results simply by double clicking them
 * 
 * @author lkm0106
 *
 */
public class PredictionMatcherTest {

	private String winningRoll = "HHHTT";
	private String losingRoll = "THHHT";
	private String prediction = "HHHTT";

	@Test
	public void testSuccessfulMatch() {
		assertTrue(PredicitonMatcher.matches(prediction, winningRoll));
	}

	@Test
	public void testNoMatch() {
		assertFalse(PredicitonMatcher.matches(prediction, losingRoll));
	}

}
