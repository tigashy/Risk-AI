/**
 * 
 */
package risk;

import org.apache.log4j.Logger;

import risk.game.Engine;
import risk.game.Player;
import risk.game.PlayerColor;
import risk.game.RiskCard;

/**
 * @author bene
 * 
 */
public class Main {

	private static final Logger logger = Logger.getLogger(Main.class);
	public static Engine gameEngine;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int waitingTime = 0;
		if (args.length == 1) {
			waitingTime = Integer.parseInt(args[0]);
		} 
		gameEngine = new Engine(waitingTime);
	}

}
