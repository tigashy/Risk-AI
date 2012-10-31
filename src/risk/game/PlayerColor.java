package risk.game;

public enum PlayerColor {
	BLUE ("blau"),
	RED ("rot"),
	GREEN ("gruen"),
	PURPLE ("lila"),
	YELLOW ("gelb"),
	ORANGE ("tk");
	
	private final String fileColor;
	
	PlayerColor(String fileColor) {
		this.fileColor = fileColor;
	}
	public String getFileColor() {
		return this.fileColor;
	}
}
