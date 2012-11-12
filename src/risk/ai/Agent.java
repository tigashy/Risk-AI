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

	private void buildPathsForAllCountries() {
		currentPaths.clear();
		for (Country c : this.controledCountries) {
			// only build trees for countries with at least 2 armies in it and a
			// neighbor country controled by the enemy
			if (c.hasEnemyNeighbor() && c.getNumberOfArmies() > 1) {
				Path p = new Path(c);

			}
		}
	}

	@Override
	public void newArmies() {
		buildPathsForAllCountries();

	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub

	}

	@Override
	public void repositionArmies() {
		// TODO Auto-generated method stub

	}

}
