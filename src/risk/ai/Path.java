package risk.ai;

import java.util.ArrayList;

import risk.game.Country;

public class Path implements Cloneable {
	private ArrayList<Node> nodes;
	private float probabilityOfSuccess;
	private int armiesAvailableForAttack;
	private int currentNodeIndex;

	public Path(Country root) {
		this.nodes = new ArrayList<Node>();
		this.nodes.add(new Node(root));
		this.probabilityOfSuccess = 1f;
		this.armiesAvailableForAttack = root.getNumberOfArmies() - 1;
		this.currentNodeIndex = 0;
	}

	private Path() {

	}
	public boolean armiesLeft() {
		return armiesAvailableForAttack > 1;
	}

	public Node getCurrentNode() {
		return this.nodes.get(currentNodeIndex);
	}

	public int getCurrentPosition() {
		return this.currentNodeIndex;
	}

	public void deleteNode() {
		this.nodes.remove(nodes.size() - 1);
		this.currentNodeIndex--;
		this.armiesAvailableForAttack++;
	}

	public void addNode(Node n) {
		this.nodes.add(n);
		currentNodeIndex++;
		this.probabilityOfSuccess *= (float)this.armiesAvailableForAttack-- / (float)n.getCountry().getNumberOfArmies();

	}

	public ArrayList<Node> getNodes() {
		return this.nodes;
	}

	public float getProbabilityOfSuccess() {
		return this.probabilityOfSuccess;
	}

	@SuppressWarnings("unchecked")
	public Path clone() {
		Path p = new Path();
		p.nodes = (ArrayList<Node>) this.nodes.clone();
		p.probabilityOfSuccess = this.probabilityOfSuccess;
		p.armiesAvailableForAttack = this.armiesAvailableForAttack;
		p.currentNodeIndex = this.currentNodeIndex;
		return p;
	}

}
