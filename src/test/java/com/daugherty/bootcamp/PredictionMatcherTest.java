package com.daugherty.bootcamp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import PredictionMatcher.PredicitonMatcher;

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
