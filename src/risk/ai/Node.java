package risk.ai;

import risk.game.Country;

public class Node {

	private Country country;
	private int neighborIndex;
	
	public Node (Country country) {
		this.country = country;
		this.neighborIndex = 0;
	}
	
	public Country returnNextNeighbor() {
		if (neighborIndex >= this.country.getNeighbors().length) {
			return null;
		}
		while (neighborIndex < this.country.getNeighbors().length) {
			if (this.country.getPlayer() != this.country.getNeighbors()[neighborIndex].getPlayer()) {
				return this.country.getNeighbors()[neighborIndex++];
			} else {
				neighborIndex++;
			}
		}
		return null;
	}
	
	public Country getCountry() {
		return this.country;
	}
	
}
