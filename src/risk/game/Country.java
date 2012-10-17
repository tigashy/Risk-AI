package risk.game;


public class Country {
	
	private boolean continentBorder;
	private Country[] neighbours;
	private String name;
	private int numberOfArmies;
	private Continent continent;
	
	public Country(boolean continentBorder, int numberOfNeighbours, String name, Continent continent) {
		this.continentBorder = continentBorder;
		this.neighbours = new Country[numberOfNeighbours];
		this.name = name;
		this.numberOfArmies = 0;
		this.continent = continent;
	}
	
	public void setNeighbour(Country neighbour, int position) {
		this.neighbours[position] = neighbour;
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

	public Country[] getNeighbours() {
		return neighbours;
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
