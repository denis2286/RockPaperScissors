package org.bennettweb.rps.hand;



/**
 * An implementation of the Paper hand.
 * 
 * @author Steve
 */
public class PaperHand extends AbstractHand {

	public PaperHand() {
		this.addToBeatableHands(RockHand.class);
	}

}
