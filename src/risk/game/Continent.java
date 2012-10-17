package risk.game;


public class Continent {

	private String name;
	private Country[] countries;
	private int bonusArmies;
	
	public Continent(String name, int bonusArmies, int numberOfCountries) {
		this.name = name;
		this.bonusArmies = bonusArmies;
		this.countries = new Country[numberOfCountries];
	}

	public String toString() {
		return name;
	}

	public Country[] getCountries() {
		return countries;
	}
	
	public Country getCountry(int position) {
		return countries[position];
	}

	public int getBonusArmies() {
		return bonusArmies;
	}
	public void setCountry(Country country, int position) {
		this.countries[position] = country;
	}
}
