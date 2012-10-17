/**
 * 
 */
package risk;

import org.apache.log4j.Logger;

import risk.game.Engine;

/**
 * @author bene
 * 
 */
public class Main {

	private static final Logger logger = Logger.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Engine gameEngine = new Engine();
		gameEngine.run();
	}

}
