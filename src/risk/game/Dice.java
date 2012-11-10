package risk.game;

public class Dice {
	
	private int wert;
	
	/* 1. Angriff
	 * 2. Verteidigung
	 */	
	private int art;

	public Dice(int art){
		this.art = art;
	}
	
	//Ganzzahlige Zufallszahlen zwischen >=x und <y, also [x,y[
	public int getWert() {
		wert =  (int) (Math.random()* (7 - 1) + 1);
		return wert;
	}
	

}
