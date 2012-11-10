package risk.ai;

import java.util.ArrayList;

import risk.game.Country;
import risk.game.Player;
import risk.game.PlayerColor;

public class Agent extends Player {
	
	private ArrayList<Path> currentPaths;

	public Agent(PlayerColor c) {
		super(c);
		this.currentPaths = new ArrayList<Path>();
	}
	
	public void buildAllPaths() {
		currentPaths.clear();
		for (Country c:this.controledCountries) {
			if (c.hasEnemyNeighbor()) {
				
			}
		}
	}

}
