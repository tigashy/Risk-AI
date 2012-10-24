package risk.game;

public class Engine {
	
	private Continent northAmerica;
	private Continent southAmerica;
	private Continent europe;
	private Continent africa;
	private Continent asia;
	private Continent australia;
	
	
	public Engine() {
		initCountries();
		initGameCards();
	}
	
	public void run() {
		
	}

	private void initCountries() {
		
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
		
		/* Setting neighbors for Alaska */
		northAmerica.getCountry(0).setNeighbor(northAmerica.getCountry(1), 0);
		northAmerica.getCountry(0).setNeighbor(northAmerica.getCountry(5), 1);
		northAmerica.getCountry(0).setNeighbor(asia.getCountry(7), 2);
		
		/* Setting neighbors for Alberta */
		northAmerica.getCountry(1).setNeighbor(northAmerica.getCountry(0), 0);
		northAmerica.getCountry(1).setNeighbor(northAmerica.getCountry(5), 1);
		northAmerica.getCountry(1).setNeighbor(northAmerica.getCountry(6), 2);
		northAmerica.getCountry(1).setNeighbor(northAmerica.getCountry(8), 3);
		
		/* Setting neighbors for Central America */
		northAmerica.getCountry(2).setNeighbor(northAmerica.getCountry(3), 0);
		northAmerica.getCountry(2).setNeighbor(northAmerica.getCountry(8), 1);
		northAmerica.getCountry(2).setNeighbor(southAmerica.getCountry(3), 2);
		
		/* Setting neighbors for Eastern United States */
		northAmerica.getCountry(3).setNeighbor(northAmerica.getCountry(2), 0);
		northAmerica.getCountry(3).setNeighbor(northAmerica.getCountry(6), 1);
		northAmerica.getCountry(3).setNeighbor(northAmerica.getCountry(7), 2);
		northAmerica.getCountry(3).setNeighbor(northAmerica.getCountry(8), 3);
		
		/* Setting neighbors for Greenland */
		northAmerica.getCountry(4).setNeighbor(northAmerica.getCountry(5), 0);
		northAmerica.getCountry(4).setNeighbor(northAmerica.getCountry(6), 1);
		northAmerica.getCountry(4).setNeighbor(northAmerica.getCountry(7), 2);
		northAmerica.getCountry(4).setNeighbor(europe.getCountry(1), 3);
		
		/* Setting neighbors for Northwest Territory */
		northAmerica.getCountry(5).setNeighbor(northAmerica.getCountry(0), 0);
		northAmerica.getCountry(5).setNeighbor(northAmerica.getCountry(1), 1);
		northAmerica.getCountry(5).setNeighbor(northAmerica.getCountry(6), 2);
		northAmerica.getCountry(5).setNeighbor(northAmerica.getCountry(4), 3);
		
		/* Setting neighbors for Ontario */
		northAmerica.getCountry(6).setNeighbor(northAmerica.getCountry(1), 0);
		northAmerica.getCountry(6).setNeighbor(northAmerica.getCountry(3), 1);
		northAmerica.getCountry(6).setNeighbor(northAmerica.getCountry(4), 2);
		northAmerica.getCountry(6).setNeighbor(northAmerica.getCountry(5), 3);
		northAmerica.getCountry(6).setNeighbor(northAmerica.getCountry(7), 4);
		northAmerica.getCountry(6).setNeighbor(northAmerica.getCountry(8), 5);
		
		/* Setting neighbors for Quebec */
		northAmerica.getCountry(7).setNeighbor(northAmerica.getCountry(3), 0);
		northAmerica.getCountry(7).setNeighbor(northAmerica.getCountry(4), 1);
		northAmerica.getCountry(7).setNeighbor(northAmerica.getCountry(5), 2);
		northAmerica.getCountry(7).setNeighbor(northAmerica.getCountry(6), 3);
		
		/* Setting neighbors for Western United States */
		northAmerica.getCountry(8).setNeighbor(northAmerica.getCountry(1), 0);
		northAmerica.getCountry(8).setNeighbor(northAmerica.getCountry(2), 1);
		northAmerica.getCountry(8).setNeighbor(northAmerica.getCountry(3), 2);
		northAmerica.getCountry(8).setNeighbor(northAmerica.getCountry(6), 3);
		
		/* Setting neighbors for Argentina */
		southAmerica.getCountry(0).setNeighbor(southAmerica.getCountry(1), 0);
		southAmerica.getCountry(0).setNeighbor(southAmerica.getCountry(2), 1);
		
		/* Setting neighbors for Brazil */
		southAmerica.getCountry(1).setNeighbor(southAmerica.getCountry(0), 0);
		southAmerica.getCountry(1).setNeighbor(southAmerica.getCountry(2), 1);
		southAmerica.getCountry(1).setNeighbor(southAmerica.getCountry(3), 2);
		southAmerica.getCountry(1).setNeighbor(africa.getCountry(4), 3);
		
		/* Setting neighbors for Peru */
		southAmerica.getCountry(2).setNeighbor(southAmerica.getCountry(0), 0);
		southAmerica.getCountry(2).setNeighbor(southAmerica.getCountry(1), 1);
		southAmerica.getCountry(2).setNeighbor(southAmerica.getCountry(3), 2);
		
		/* Setting neighbors for Venezuela */
		southAmerica.getCountry(3).setNeighbor(southAmerica.getCountry(1), 0);
		southAmerica.getCountry(3).setNeighbor(southAmerica.getCountry(2), 1);
		southAmerica.getCountry(3).setNeighbor(northAmerica.getCountry(2), 2);
		
		/* Setting neighbors for Great Britain */
		europe.getCountry(0).setNeighbor(europe.getCountry(1), 0);
		europe.getCountry(0).setNeighbor(europe.getCountry(2), 1);
		europe.getCountry(0).setNeighbor(europe.getCountry(3), 2);
		europe.getCountry(0).setNeighbor(europe.getCountry(6), 3);
		
		/* Setting neighbors for Iceland */
		europe.getCountry(1).setNeighbor(europe.getCountry(0), 0);
		europe.getCountry(1).setNeighbor(europe.getCountry(3), 1);
		europe.getCountry(1).setNeighbor(northAmerica.getCountry(4), 2);
		
		/* Setting neighbors for Northern Europe */
		europe.getCountry(2).setNeighbor(europe.getCountry(0), 0);
		europe.getCountry(2).setNeighbor(europe.getCountry(3), 1);
		europe.getCountry(2).setNeighbor(europe.getCountry(4), 2);
		europe.getCountry(2).setNeighbor(europe.getCountry(5), 3);
		europe.getCountry(2).setNeighbor(europe.getCountry(6), 4);
		
		/* Setting neighbors for Scandinavia */
		europe.getCountry(3).setNeighbor(europe.getCountry(0), 0);
		europe.getCountry(3).setNeighbor(europe.getCountry(1), 1);
		europe.getCountry(3).setNeighbor(europe.getCountry(2), 2);
		europe.getCountry(3).setNeighbor(europe.getCountry(5), 3);
		
		/* Setting neighbors for Southern Europe */
		europe.getCountry(4).setNeighbor(europe.getCountry(2), 0);
		europe.getCountry(4).setNeighbor(europe.getCountry(5), 1);
		europe.getCountry(4).setNeighbor(europe.getCountry(6), 2);
		europe.getCountry(4).setNeighbor(asia.getCountry(6), 3);
		europe.getCountry(4).setNeighbor(africa.getCountry(2), 4);
		europe.getCountry(4).setNeighbor(africa.getCountry(4), 5);
		
		/* Setting neighbors for Ukraine */
		europe.getCountry(5).setNeighbor(europe.getCountry(2), 0);
		europe.getCountry(5).setNeighbor(europe.getCountry(3), 1);
		europe.getCountry(5).setNeighbor(europe.getCountry(4), 2);
		europe.getCountry(5).setNeighbor(asia.getCountry(0), 3);
		europe.getCountry(5).setNeighbor(asia.getCountry(6), 4);
		europe.getCountry(5).setNeighbor(asia.getCountry(10), 5);
		
		/* Setting neighbors for Western Europe */
		europe.getCountry(3).setNeighbor(europe.getCountry(0), 0);
		europe.getCountry(3).setNeighbor(europe.getCountry(2), 1);
		europe.getCountry(3).setNeighbor(europe.getCountry(4), 2);
		europe.getCountry(3).setNeighbor(africa.getCountry(4), 3);
		
		/* Setting neighbors for Congo */
		africa.getCountry(0).setNeighbor(africa.getCountry(1), 0);
		africa.getCountry(0).setNeighbor(africa.getCountry(4), 1);
		africa.getCountry(0).setNeighbor(africa.getCountry(5), 2);
		
		/* Setting neighbors for East Africa */
		africa.getCountry(1).setNeighbor(africa.getCountry(0), 0);
		africa.getCountry(1).setNeighbor(africa.getCountry(2), 1);
		africa.getCountry(1).setNeighbor(africa.getCountry(3), 2);
		africa.getCountry(1).setNeighbor(africa.getCountry(4), 3);
		africa.getCountry(1).setNeighbor(africa.getCountry(5), 4);
		africa.getCountry(1).setNeighbor(asia.getCountry(6), 5);
		
		/* Setting neighbors for Egypt */
		africa.getCountry(2).setNeighbor(africa.getCountry(1), 0);
		africa.getCountry(2).setNeighbor(africa.getCountry(4), 1);
		africa.getCountry(2).setNeighbor(europe.getCountry(4), 2);
		africa.getCountry(2).setNeighbor(asia.getCountry(6), 3);
		
		/* Setting neighbors for Madagascar */
		africa.getCountry(3).setNeighbor(africa.getCountry(1), 0);
		africa.getCountry(3).setNeighbor(africa.getCountry(5), 1);
		
		/* Setting neighbors for North Africa */
		africa.getCountry(4).setNeighbor(africa.getCountry(0), 0);
		africa.getCountry(4).setNeighbor(africa.getCountry(1), 1);
		africa.getCountry(4).setNeighbor(africa.getCountry(2), 2);
		africa.getCountry(4).setNeighbor(southAmerica.getCountry(1), 3);
		africa.getCountry(4).setNeighbor(europe.getCountry(6), 4);
		
		/* Setting neighbors for South Africa */
		africa.getCountry(5).setNeighbor(africa.getCountry(0), 0);
		africa.getCountry(5).setNeighbor(africa.getCountry(1), 1);
		africa.getCountry(5).setNeighbor(africa.getCountry(3), 2);
	}
	
	private void initGameCards() {
		// TODO Auto-generated method stub
		
	}
}
