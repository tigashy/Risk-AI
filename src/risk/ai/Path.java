package risk.ai;

import java.util.ArrayList;

import risk.game.Country;

public class Path {
	private ArrayList<Node> nodes;
	private float probabilityOfSuccess;
	
	public Path(Country root) {
		this.nodes = new ArrayList<Node>();
		this.nodes.add(new Node(root));
		this.probabilityOfSuccess = 0.0f;
	}
	public void addCountry(Node n) {
		this.nodes.add(n);
		this.probabilityOfSuccess += n.getCountry().getNumberOfArmies();
	}
	public ArrayList<Node> getCountries() {
		return this.nodes;
	}
	public float getNumberOfArmies() {
		return this.probabilityOfSuccess;
	}
	public boolean isCountryInPath(Node n) {
		return this.nodes.contains(n);
	}
	
}
