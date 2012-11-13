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
		this.currentPaths = new ArrayList<Path>(1);
	}

	private void buildPathsForAllCountries() {
		currentPaths.clear();
		for (Country c : this.controledCountries) {
			if (c == null) {
				continue;
			}
			// only build trees for countries with at least 2 armies in it and a
			// neighbor country controled by the enemy
			if (c.hasEnemyNeighbor() && c.getNumberOfArmies() > 1) {
				Path p = new Path(c);
				Country t = p.getCurrentNode().returnNextNeighbor();
				while (p.getCurrentPosition() != 0 && t != null) {
					while (t != null) {
						if (p.armiesLeft()) {
							p.addNode(new Node(t));
							t = p.getCurrentNode().returnNextNeighbor();							
						} else {
							t = null;
						}
					}
					currentPaths.add(p.clone());
					while (t == null) {
						p.deleteNode();
						t = p.getCurrentNode().returnNextNeighbor();
					}
				}
			}
		}
		for (Path p:currentPaths) {
			System.out.print("New path: ");
			for (Node n:p.getNodes()) {
				System.out.print(n.getCountry().getName() + " -> ");
			}
			System.out.println();
		}
	}

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
