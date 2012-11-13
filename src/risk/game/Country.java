package risk.game;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import risk.gui.ImageLabel;

public class Country implements Comparable<Country> {
	
	private boolean continentBorder;
	private Country[] neighbors;
	private String name;
	private int numberOfArmies;
	private Continent continent;
	private ImageLabel label;
	private Player player;
	private int continentOrder;
	
	public Country(boolean continentBorder, int numberOfNeighbors, String name, Continent continent, int x, int y, int width, int height, String nameLabel, int continentOrder) {
		this.continentBorder = continentBorder;
		this.neighbors = new Country[numberOfNeighbors];
		this.name = name;
		this.numberOfArmies = 1;
		this.continent = continent;
		this.label = new ImageLabel();
		this.label.setBounds(x, y, width, height);
		this.label.setForeground(Color.WHITE);
		this.label.setHorizontalTextPosition(JLabel.CENTER);
		this.label.setVerticalTextPosition(JLabel.CENTER);
		this.label.setName(nameLabel);
		this.label.setText("1");
		this.continentOrder = continentOrder;
	}
	
	public void setNeighbor(Country neighbor, int position) {
		this.neighbors[position] = neighbor;
	}
	
	public boolean hasEnemyNeighbor() {
		for (Country c:this.neighbors) {
			if (c.player != this.player) {
				return true;
			}
		}
		return false;
	}

	public int getNumberOfArmies() {
		return numberOfArmies;
	}

	public void setNumberOfArmies(int numberOfArmies) {
		this.numberOfArmies = numberOfArmies;
		label.setText("" + numberOfArmies);
	}
	
	public void increasseNumberOfArmies(int number) {
		this.numberOfArmies += number;
		label.setText("" + numberOfArmies);
	}

	public boolean isContinentBorder() {
		return continentBorder;
	}

	public Country[] getNeighbors() {
		return neighbors;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return this.name + "(" + numberOfArmies + ")";
	}

	public Continent getContinent() {
		return continent;
	}
	
	public ImageLabel getLabel() {
		return this.label;
	}
//	public void setColor(PlayerColor c, int number) {
//		//String filePath = "Images/" + this.continent.toString() + "/" + number + "/" + c.getFileColor()));
//		label.setIcon(new ImageIcon("Images/" + this.continent.toString() + "/" + number + "/" + c.getFileColor() + ".gif"));
//	}
	public void updateColor() {
		label.setIcon(new ImageIcon("Images/" + this.continent.toString() + "/" + (this.continentOrder + 1) + "/" + this.player.getColor().getFileColor() + ".gif"));
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	/**
	 * Note: this class has a natural ordering that is inconsistent with equals
	 * @param o
	 * @return
	 */
	@Override
	public int compareTo(Country c) {
		return this.numberOfArmies - c.numberOfArmies;
	}
}
