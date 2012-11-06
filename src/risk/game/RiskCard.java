package risk.game;

public class RiskCard {
	
	/*
	 * 0. Joker
	 * 1. Soldier
	 * 2. Cavalryman
	 * 3. Canon
	 * 4. null
	 */
	private int symbol;
	
	public RiskCard(int symbol) {
		this.symbol = symbol;
	}
	public int getSymbol() {
		return this.symbol;
	}

}
