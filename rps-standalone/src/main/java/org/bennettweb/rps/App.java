package org.bennettweb.rps;

import org.bennettweb.rps.game.GameException;
import org.bennettweb.rps.game.ResultReporter;
import org.bennettweb.rps.game.SysoutResultReporter;
import org.bennettweb.rps.game.TwoPlayerGame;
import org.bennettweb.rps.player.ComputerPlayer;
import org.bennettweb.rps.player.HumanPlayer;

/**
 * The main application class to run.
 */
public class App {
	
	/**
	 * Main entry.
	 * @param args
	 */
	public static void main(String[] args) throws GameException {

		TwoPlayerGame twoPlayerGame = new TwoPlayerGame();
		ResultReporter reporter = new SysoutResultReporter();
		twoPlayerGame.addPlayer(new HumanPlayer());
		twoPlayerGame.addPlayer(new ComputerPlayer("Comp1"));
		twoPlayerGame.setNumberOfRound(3);
		twoPlayerGame.setResultReporter(reporter);
		twoPlayerGame.play();
	}
}
