/**
 * 
 */
package org.bennettweb.rps.game;

import java.util.ArrayList;
import java.util.List;

import org.bennettweb.rps.player.Player;
import org.bennettweb.rps.player.PlayerException;

/**
 * A simple two player implementation of the game.
 * 
 * @author Steve
 */
public class TwoPlayerGame implements Game {

	private static final int MAX_PLAYERS = 2;

	protected List<Player> players;

	protected int numberOfRounds;
	
	protected TwoPlayerEngine engine;
	
	protected ResultReporter resultReporter;

	/**
	 * Constructor. Creates the game.
	 */
	public TwoPlayerGame() {
		players = new ArrayList<Player>();
		engine = new TwoPlayerEngine();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.bennettweb.rps.game.Game#addPlayer(org.bennettweb.rps.player.Player)
	 */
	public void addPlayer(Player player) throws GameException {
		if (player == null) {
			throw new IllegalArgumentException();
		}
		if (players.size() == MAX_PLAYERS) {
			throw new GameException("Game is full. No new players allowed.");
		}

		if (!players.contains(player)) {
			players.add(player);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bennettweb.rps.game.Game#setNumberOfRound(int)
	 */
	public void setNumberOfRound(int numberOfRounds) {
		if (numberOfRounds < 1) {
			throw new IllegalArgumentException(
					"Number of rounds must be at least 1");
		}
		this.numberOfRounds = numberOfRounds;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bennettweb.rps.game.Game#play()
	 */
	public void play() throws GameException {
		if (players.size() < MAX_PLAYERS) {
			throw new GameException("Not enough players registered to play");
		}
		
		// initialise the players
		for (Player p : players) {
			p.initialise();
		}
		
		for (int i = 1; i <= numberOfRounds; i++) {
			
			for (int j=0, n=players.size(); j<n; j++) {
				try {
					players.get(j).choose();
				} catch (PlayerException e) {
					throw new GameException("Problem occurred running game", e);
				}
			}
			
			resultReporter.reportChoices(players);
			Player winner = engine.determineWinner(players);
			resultReporter.report(i, winner);
		}
		
		resultReporter.summarize();
	}
	
	public void setResultReporter(ResultReporter resultReporter) {
		this.resultReporter = resultReporter;
	}

}
