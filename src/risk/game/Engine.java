package risk.game;

public class Engine {
	
	private Continent northAmerica;
	private Continent southAmerica;
	private Continent europe;
	private Continent africa;
	private Continent asia;
	private Continent australia;
	
	
	public Engine() {
		loadGameData();
	}
	public void run() {
		
	}

	private void loadGameData() {
		
		/* North America */
		northAmerica = new Continent("North America", 5, 9);
		northAmerica.setCountry(new Country(true, 3, "Alaska", northAmerica), 0);
		northAmerica.setCountry(new Country(false, 4, "Alberta", northAmerica), 1);
		northAmerica.setCountry(new Country(true, 3, "Central America", northAmerica), 2);
		northAmerica.setCountry(new Country(false, 4, "Eastern United States", northAmerica), 3);
		northAmerica.setCountry(new Country(true, 4, "Greenland", northAmerica), 4);
		northAmerica.setCountry(new Country(false, 4, "Northwest Territory", northAmerica), 5);
		northAmerica.setCountry(new Country(false, 6, "Ontario", northAmerica), 6);
		northAmerica.setCountry(new Country(false, 3, "Quebec", northAmerica), 7);
		northAmerica.setCountry(new Country(false, 4, "Western United States", northAmerica), 8);
		
		/* South America */
		southAmerica = new Continent("South America", 2, 4);
		southAmerica.setCountry(new Country(false, 2, "Argentina", southAmerica), 0);
		southAmerica.setCountry(new Country(true, 4, "Brazil", southAmerica), 1);
		southAmerica.setCountry(new Country(false, 3, "Peru", southAmerica), 2);
		southAmerica.setCountry(new Country(true, 3, "Venezuela", southAmerica), 3);
		
		/* Europe */
		europe = new Continent("Europe", 5, 7);
		europe.setCountry(new Country(false, 4, "Great Britain", europe), 0);
		europe.setCountry(new Country(true, 3, "Iceland", europe), 1);
		europe.setCountry(new Country(false, 5, "Northern Europe", europe), 2);
		europe.setCountry(new Country(false, 4, "Scandinavia", europe), 3);
		europe.setCountry(new Country(true, 6, "Southern Europe", europe), 4);
		europe.setCountry(new Country(true, 6, "Ukraine", europe), 5);
		europe.setCountry(new Country(true, 4, "Western Europe", europe), 6);
		
		/* Africa */
		africa = new Continent("Africa", 3, 6);
		africa.setCountry(new Country(false, 3, "Congo", africa), 0);
		africa.setCountry(new Country(true, 6, "East Africa", africa), 1);
		africa.setCountry(new Country(true, 4, "Egypt", africa), 2);
		africa.setCountry(new Country(false, 2, "Madagascar", africa), 3);
		africa.setCountry(new Country(true, 6, "North Africa", africa), 4);
		africa.setCountry(new Country(false, 3, "South Africa", africa), 5);
		
		/* Asia */
		asia = new Continent("Asia", 7, 12);
		asia.setCountry(new Country(true, 5, "Afghanistan", asia), 0);
		asia.setCountry(new Country(false, 6, "China", asia), 1);
		asia.setCountry(new Country(false, 4, "India", asia), 2);
		asia.setCountry(new Country(false, 4, "Irkutsk", asia), 3);
		asia.setCountry(new Country(false, 2, "Japan", asia), 4);
		asia.setCountry(new Country(true, 5, "Kamchatka", asia), 5);
		asia.setCountry(new Country(true, 6, "Middle East", asia), 6);
		asia.setCountry(new Country(false, 5, "Mongolia", asia), 7);
		asia.setCountry(new Country(true, 3, "Siam", asia), 8);
		asia.setCountry(new Country(false, 5, "Siberia", asia), 9);
		asia.setCountry(new Country(true, 4, "Ural", asia), 10);
		asia.setCountry(new Country(false, 3, "Yakutsk", asia), 11);
		
		/* Australia */
		australia = new Continent("Australia", 2, 4);
		australia.setCountry(new Country(false, 2, "Eastern Australia", australia), 0);
		australia.setCountry(new Country(true, 3, "Indonesia", australia), 1);
		australia.setCountry(new Country(false, 3, "New Guinea", australia), 2);
		australia.setCountry(new Country(false, 3, "Western Australia", australia), 3);
	}
}
