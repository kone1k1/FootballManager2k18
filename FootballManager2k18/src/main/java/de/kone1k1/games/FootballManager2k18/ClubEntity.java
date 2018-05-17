package de.kone1k1.games.FootballManager2k18;

import java.awt.Dimension;

import de.kone1k1.games.FootballManager2k18.map.TileType;

public class ClubEntity {

	private String name;
	private String description;
	private int monthlyCosts;
	private Dimension entityDimension;
	private TileType tile;

	public ClubEntity(String name, String description, int monthlyCosts, Dimension size) {
		this.name = name;
		this.description = description;
		this.monthlyCosts = monthlyCosts;
		this.entityDimension = size;

	}

	public void setMonthlyCosts(int monthlyCosts) {
		this.monthlyCosts = monthlyCosts;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getMonthlyCosts() {
		return monthlyCosts;
	}

	public Dimension getDimension() {
		return entityDimension;
	}
}
