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
	
	public Player checkIfControledByOnePlayer() {
		Player p = this.countries[0].getPlayer();
		boolean singleOwner = true;
		for (int i = 1; i < this.countries.length; i++) {
			if (p != this.countries[i].getPlayer()) {
				singleOwner = false;
				break;
			}
		}
		if (singleOwner) {
			return p;
		} else {
			return null;
		}
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
