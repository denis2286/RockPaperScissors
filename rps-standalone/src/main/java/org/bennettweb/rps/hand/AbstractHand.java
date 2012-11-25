/**
 * 
 */
package org.bennettweb.rps.hand;

import java.util.ArrayList;
import java.util.List;

/**
 * A base implementation of a hand.
 * 
 * @author Steve
 */
abstract class AbstractHand implements Hand {
	
	private List<Class<? extends Hand>> beatableHands;
	
	public AbstractHand() {
		beatableHands = new ArrayList<Class<? extends Hand>>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bennettweb.rps.hand.Hand#beats(org.bennettweb.rps.hand.Hand)
	 */
	public boolean beats(Hand otherHand) {
		if (otherHand == null) {
			throw new IllegalArgumentException("Can't do compare. OtherHand was null");
		}
		return beatableHands.contains(otherHand.getClass());
	}

	protected void addToBeatableHands(Class<? extends Hand> hand) {
		beatableHands.add(hand);
	}
}
