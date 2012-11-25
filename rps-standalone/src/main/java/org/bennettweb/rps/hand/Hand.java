package org.bennettweb.rps.hand;

/**
 * The hand that a player can play in the game.
 * 
 * @author Steve
 */
public interface Hand {

	/**
	 * @param otherHand
	 * @return True if this hand beats the other hand.
	 */
	boolean beats(Hand otherHand);
}
