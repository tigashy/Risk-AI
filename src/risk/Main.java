/**
 * 
 */
package risk;

import org.apache.log4j.Logger;

import risk.game.Engine;

public class Main {

	private static final Logger logger = Logger.getLogger(Main.class);
	public static Engine gameEngine;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int playerCount = 5;
		if (args.length == 1) {
			playerCount = Integer.parseInt(args[0]);
		} 
		gameEngine = new Engine(playerCount);
		gameEngine.run();
	}

}
