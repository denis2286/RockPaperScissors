/**
 * 
 */
package org.bennettweb.rps.game;

import org.bennettweb.rps.hand.Hand;
import org.bennettweb.rps.hand.Hand.HandCompareResult;

/**
 * A default implementation of an engine
 * 
 * @author Steve
 */
public class DefaultEngine implements Engine {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.bennettweb.rps.game.Engine#determineWinner(org.bennettweb.rps.hand
	 * .Hand, org.bennettweb.rps.hand.Hand)
	 */
	public Result determineWinner(Hand player1Hand, Hand player2Hand) {
		if (player1Hand == null || player2Hand == null) {
			throw new IllegalArgumentException("Hands both have to be non-null");
		}
		HandCompareResult result = player1Hand.beats(player2Hand);
		switch (result) {
		case Win:
			return Result.PlayerOne;
		case Lose:
			return Result.PlayerTwo;
		default:
			return Result.Draw;
		}
	}

}
