package org.bennettweb.rps.hand;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link PaperHand}
 * 
 * @author Steve
 */
public class PaperHandTest {
	
	private PaperHand classUnderTest;
	
	@Before
	public void setup() {
		classUnderTest = new PaperHand();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testBeatsNull() {
		classUnderTest.beats(null);
	}

	@Test
	public void testBeatsRock() {
		RockHand rock = new RockHand();
		Assert.assertTrue(classUnderTest.beats(rock));
	}
	
	@Test
	public void testBeatsPaper() {
		PaperHand paper = new PaperHand();
		Assert.assertFalse(classUnderTest.beats(paper));
	}
	
	@Test
	public void testBeatsScissors() {
		ScissorsHand scissors = new ScissorsHand();
		Assert.assertFalse(classUnderTest.beats(scissors));
	}

}
