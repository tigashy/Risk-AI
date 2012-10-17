package risk.game;

public class RiscCard {
	private Symbol symbol;
	private Country country;
	
	public RiscCard(Symbol symbol, Country country) {
		this.symbol = symbol;
		this.country = country;
	}
	
	public Country getCountry() {
		return this.country;
	}
	
	public Symbol getSymbol() {
		return this.symbol;
	}

}
