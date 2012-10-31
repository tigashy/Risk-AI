package risk.game;

public enum Color {
	BLUE ("blau"),
	RED ("rot"),
	GREEN ("gruen"),
	PURPLE ("lila"),
	YELLOW ("gelb"),
	ORANGE ("tk");
	
	private final String fileColor;
	
	Color(String fileColor) {
		this.fileColor = fileColor;
	}
	public String getFileColor() {
		return this.fileColor;
	}
}
