package risk.ai;

import java.util.ArrayList;

import risk.game.Country;
import risk.game.Player;

public class PathTree {

	private PathTree predecessor;
	private ArrayList<PathTree> successors;
	private boolean isRoot;
	private boolean visited;
	private Country country;

	private PathTree(PathTree predecessor, Country country) {
		this.predecessor = predecessor;
		this.isRoot = false;
		this.visited = false;
		this.successors = new ArrayList<PathTree>();
		this.country = country;
	}

	/**
	 * 
	 * @param country The root country from which the attack should be made
	 */
	public PathTree(Country country) {
		this.predecessor = null;
		this.isRoot = true;
		this.visited = true;
		this.successors = new ArrayList<PathTree>();
		this.country = country;
		//TODO check which countries need to be added an avoid loops
		for (Country c : this.country.getNeighbors()) {
			if (c.isInTree() || c.getPlayer() == this.country.getPlayer()) {
				continue; //skip countries that are already in the tree or belong to the player himself
			}
			this.successors.add(new PathTree(this, c));
		}
	}

	public PathTree up() {
		return this.predecessor;
	}

	public boolean isRoot() {
		return this.isRoot;
	}

	/**
	 * 
	 * @return The next unvisited successor of this PathTree or null if this
	 *         PathTree does not have successors or all of them have been
	 *         visited.
	 */
	public PathTree getNextUnvisitedSuccessor() {
		if (this.successors.isEmpty()) {
			return null;
		}
		PathTree tmp = null;
		for (int i = 0; i < this.successors.size(); i++) {
			tmp = this.successors.get(i);
			if (!tmp.visited) {
				tmp.visited = true;
				return tmp;
			}
		}
		return null;
	}
	
	public Country getCountry() {
		return this.country;
	}

}
