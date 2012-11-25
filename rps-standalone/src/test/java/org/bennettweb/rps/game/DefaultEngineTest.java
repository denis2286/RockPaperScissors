package org.bennettweb.rps.game;

import junit.framework.Assert;

import org.bennettweb.rps.game.Engine.Result;
import org.bennettweb.rps.hand.Hand;
import org.bennettweb.rps.hand.Hand.HandCompareResult;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class DefaultEngineTest {
	
	private DefaultEngine classUnderTest;
	
	@Before
	public void setup() {
		classUnderTest = new DefaultEngine();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDetermineWinnerNullNull() {
		classUnderTest.determineWinner(null, null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDetermineWinnerNullPlayer1() {
		Hand hand = Mockito.mock(Hand.class);
		classUnderTest.determineWinner(null, hand);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDetermineWinnerNullPlayer2() {
		Hand hand = Mockito.mock(Hand.class);
		classUnderTest.determineWinner(hand, null);
	}
	
	@Test
	public void testDetermineWinnerPlayer1Wins() {
		Hand p1Hand = Mockito.mock(Hand.class);
		Hand p2Hand = Mockito.mock(Hand.class);
		Mockito.when(p1Hand.beats(p2Hand)).thenReturn(HandCompareResult.Win);
		Result result = classUnderTest.determineWinner(p1Hand, p2Hand);
		Assert.assertEquals(Result.PlayerOne, result);
	}
	
	@Test
	public void testDetermineWinnerPlayer2Wins() {
		Hand p1Hand = Mockito.mock(Hand.class);
		Hand p2Hand = Mockito.mock(Hand.class);
		Mockito.when(p1Hand.beats(p2Hand)).thenReturn(HandCompareResult.Lose);
		Result result = classUnderTest.determineWinner(p1Hand, p2Hand);
		Assert.assertEquals(Result.PlayerTwo, result);
	}
	
	@Test
	public void testDetermineWinnerDraw() {
		Hand p1Hand = Mockito.mock(Hand.class);
		Hand p2Hand = Mockito.mock(Hand.class);
		Mockito.when(p1Hand.beats(p2Hand)).thenReturn(HandCompareResult.Draw);
		Result result = classUnderTest.determineWinner(p1Hand, p2Hand);
		Assert.assertEquals(Result.Draw, result);
	}

}
