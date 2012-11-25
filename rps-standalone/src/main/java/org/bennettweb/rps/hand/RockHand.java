/**
 * 
 */
package org.bennettweb.rps.hand;

/**
 * An implementation of the Rock Hand.
 * 
 * @author Steve
 */
public class RockHand extends AbstractHand {

	public RockHand() {
		this.addToBeatableHands(ScissorsHand.class);
	}
}
