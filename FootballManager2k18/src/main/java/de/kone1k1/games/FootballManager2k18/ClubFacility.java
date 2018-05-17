package de.kone1k1.games.FootballManager2k18;

import java.awt.Dimension;

public class ClubFacility {
	private final int clubID;
	private final Dimension dimension = new Dimension(12, 12);

	public ClubFacility(int clubID) {
		this.clubID = clubID;
	}

	public void buildEntity(ClubEntity entity) {

	}

	public void destructEntity(ClubEntity entity) {

	}

	public void upgradeEntity(Upgradable entity) {
		entity.upgrade();
	}
}
