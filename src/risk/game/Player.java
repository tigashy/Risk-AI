package risk.game;

import java.util.ArrayList;

public class Player {
	private Color c;
	private ArrayList<Country> controledCountries;
	private RiscCard[] riscCard;
	
	public Player(Color c ){
		this.c = c;
		this.riscCard = new RiscCard[5];
	}
}


