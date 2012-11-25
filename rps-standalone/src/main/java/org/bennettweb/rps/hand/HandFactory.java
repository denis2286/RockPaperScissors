/**
 * 
 */
package org.bennettweb.rps.hand;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Steve
 *
 */
public class HandFactory {
	
	private List<Hand> possibleHands;
	
	public HandFactory() {
		possibleHands = new ArrayList<Hand>();
		possibleHands.add(new RockHand());
		possibleHands.add(new ScissorsHand());
		possibleHands.add(new PaperHand());
	}

	public Hand createHand(String choice) throws HandChoiceException {
		if (choice == null) {
			throw new HandChoiceException("Choice was null");
		} 
		
		Hand chosen = null;
		for (Hand h : possibleHands) {
			if (choice.compareToIgnoreCase(h.getName()) == 0) {
				chosen = h;
			}
		}
		
		if (chosen == null) {
			throw new HandChoiceException("No choice found for " + choice);
		}
		
		return chosen;
	}
	
	public List<Hand> choices() {
		return possibleHands;
	}
}
 