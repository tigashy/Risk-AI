package risk.game;

public class RiscCard {
	
	/*
	 * 0. Joker
	 * 1. Soldier
	 * 2. Cavalryman
	 * 3. Canon
	 */
	private int symbol;
	
	public RiscCard(int symbol) {
		this.symbol = symbol;
	}
	public int getSymbol() {
		return this.symbol;
	}

}
