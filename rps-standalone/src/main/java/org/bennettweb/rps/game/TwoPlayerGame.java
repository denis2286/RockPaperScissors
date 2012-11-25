/**
 * 
 */
package org.bennettweb.rps.game;

import java.util.ArrayList;
import java.util.List;

import org.bennettweb.rps.player.Player;

/**
 * A simple two player implementation of the game.
 * 
 * @author Steve
 */
public class TwoPlayerGame implements Game {
	
	protected List<Player> players;
	
	protected int numberOfRounds;
	
	/**
	 * Constructor. Creates the game.
	 */
	public TwoPlayerGame() {
		players = new ArrayList<Player>();
	}

	/* (non-Javadoc)
	 * @see org.bennettweb.rps.game.Game#addPlayer(org.bennettweb.rps.player.Player)
	 */
	public void addPlayer(Player player) throws GameException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.bennettweb.rps.game.Game#setNumberOfRound(int)
	 */
	public void setNumberOfRound(int numberOfRounds) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.bennettweb.rps.game.Game#play()
	 */
	public void play() {
		// TODO Auto-generated method stub

	}

}
