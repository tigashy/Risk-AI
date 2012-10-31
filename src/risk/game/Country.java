package risk.game;

import java.awt.Color;

import javax.swing.JLabel;

import risk.gui.ImageLabel;

public class Country {
	
	private boolean continentBorder;
	private Country[] neighbors;
	private String name;
	private int numberOfArmies;
	private Continent continent;
	private ImageLabel label;
	
	
	
	public Country(boolean continentBorder, int numberOfNeighbors, String name, Continent continent, int x, int y, int width, int height, String nameLabel) {
		this.continentBorder = continentBorder;
		this.neighbors = new Country[numberOfNeighbors];
		this.name = name;
		this.numberOfArmies = 0;
		this.continent = continent;
		this.label.setBounds(x, y, width, height);
		label.setForeground(Color.WHITE);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.CENTER);
	}
	
	public void setNeighbor(Country neighbor, int position) {
		this.neighbors[position] = neighbor;
	}

	public int getNumberOfArmies() {
		return numberOfArmies;
	}

	public void setNumberOfArmies(int numberOfArmies) {
		this.numberOfArmies = numberOfArmies;
	}
	
	public void increasseNumberOfArmies(int number) {
		this.numberOfArmies += number;
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
}
