package risk.ai;

import java.util.ArrayList;

import risk.game.Country;

public class Path {
	private ArrayList<Country> countries;
	private int numberOfArmies;
	
	public Path(Country root) {
		this.countries = new ArrayList<Country>();
		this.countries.add(root);
		this.numberOfArmies = root.getNumberOfArmies();
	}
	public void addCountry(Country c) {
		this.countries.add(c);
		this.numberOfArmies += c.getNumberOfArmies();
	}
	public ArrayList<Country> getCountries() {
		return this.countries;
	}
	public int getNumberOfArmies() {
		return this.numberOfArmies;
	}
	
}
