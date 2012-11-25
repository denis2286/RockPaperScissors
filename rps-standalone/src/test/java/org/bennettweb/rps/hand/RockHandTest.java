package org.bennettweb.rps.hand;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class RockHandTest {
	
	private RockHand classUnderTest;
	
	@Before
	public void setup() {
		classUnderTest = new RockHand();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testBeatsNull() {
		classUnderTest.beats(null);
	}

	@Test
	public void testBeatsRock() {
		RockHand rock = new RockHand();
		Assert.assertFalse(classUnderTest.beats(rock));
	}
	
	@Test
	public void testBeatsPaper() {
		PaperHand paper = new PaperHand();
		Assert.assertFalse(classUnderTest.beats(paper));
	}
	
	@Test
	public void testBeatsScissors() {
		ScissorsHand scissors = new ScissorsHand();
		Assert.assertTrue(classUnderTest.beats(scissors));
	}
}
