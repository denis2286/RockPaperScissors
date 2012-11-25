/**
 * 
 */
package org.bennettweb.rps.hand;

/**
 * An implementation of the Scissors Hand.
 * 
 * @author Steve
 */
public class ScissorsHand extends AbstractHand {

	public ScissorsHand() {
		this.addToBeatableHands(PaperHand.class);
	}
}
