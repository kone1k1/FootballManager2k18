package de.kone1k1.games.FootballManager2k18.map;

public enum TileType {

	GRASS, STONE, BUSH, TREE, STADIUM;

	public static TileType getTileByID(int id) {
		for (TileType t : TileType.values()) {
			if (t.ordinal() == id) {
				return t;
			}
		}
		return null;
	}
}
