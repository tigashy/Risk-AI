package risk.ai;

import java.util.ArrayList;
import java.util.Collections;

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

	@SuppressWarnings("unchecked")
	@Override
	public void newArmies(int continentArmies) {		
		int receivedArmies = continentArmies + this.getReceivedArmies() + this.getRiskCardBonuesArmies();
		int defenseArmies = receivedArmies / 2 + receivedArmies % 2;
		int attackArmies = receivedArmies / 2;
		Collections.sort(this.controledCountries);
		int i = 0;
		while (defenseArmies > 0) {
			if (i >= this.controledCountries.size()) {
				i = 0;
			}
			Country c = this.controledCountries.get(i++);
			if (c.isContinentBorder()) {
				c.increasseNumberOfArmies(1);
				defenseArmies--;
			}
		}
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
