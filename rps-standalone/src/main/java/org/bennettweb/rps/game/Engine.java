/**
 * 
 */
package org.bennettweb.rps.game;

import org.bennettweb.rps.hand.Hand;

/**
 * the mechanics of the game.
 * 
 * @author Steve
 */
public interface Engine {

	enum Result {
		PlayerOne, PlayerTwo, Draw;
	}

	/**
	 * @param player1Hand
	 *            The hand played by player1
	 * @param player2Hand
	 *            The hand played by player2
	 * @return the result of this hand
	 */
	Result determineWinner(Hand player1Hand, Hand player2Hand);
}
