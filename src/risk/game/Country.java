package risk.game;


public class Country {
	
	private boolean continentBorder;
	private Country[] neighbors;
	private String name;
	private int numberOfArmies;
	private Continent continent;
	
	public Country(boolean continentBorder, int numberOfNeighbors, String name, Continent continent) {
		this.continentBorder = continentBorder;
		this.neighbors = new Country[numberOfNeighbors];
		this.name = name;
		this.numberOfArmies = 0;
		this.continent = continent;
	}
	
	public void setNeighbor(Country neighbor, int position) {
		this.neighbors[position] = neighbor;
	}

	public int getNumberOfArmies() {
		return numberOfArmies;
	}

	public void setNumberOfArmies(int numberOfArmies) {
		this.numberOfArmies = numberOfArmies;
	}
	
	public void increasseNumberOfArmies(int number) {
		this.numberOfArmies += number;
	}

	public boolean isContinentBorder() {
		return continentBorder;
	}

	public Country[] getNeighbors() {
		return neighbors;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return this.name + "(" + numberOfArmies + ")";
	}

	public Continent getContinent() {
		return continent;
	}
}
