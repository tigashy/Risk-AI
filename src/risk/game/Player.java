package risk.game;

import java.util.ArrayList;

public class Player {
	private PlayerColor c;
	private ArrayList<Country> controledCountries;
	private RiskCard[] riscCard;
	
	public Player(PlayerColor c ){
		this.c = c;
		this.riscCard = new RiskCard[5];
		this.controledCountries = new ArrayList<Country>(42);
	}
	public PlayerColor getColor() {
		return this.c;
	}
	public void addCountry(Country c) {
		this.controledCountries.add(c);
	}
}


