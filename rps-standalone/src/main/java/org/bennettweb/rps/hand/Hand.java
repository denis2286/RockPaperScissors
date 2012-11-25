package org.bennettweb.rps.hand;

/**
 * The hand that a player can play in the game.
 * 
 * @author Steve
 */
public interface Hand {
	
	enum HandCompareResult {
		Win,
		Lose,
		Draw;
	}

	/**
	 * @param otherHand
	 * @return The result of comparing the two hands
	 */
	HandCompareResult beats(Hand otherHand);
	
	/**
	 * @return This hands name.
	 */
	String getName();
}
