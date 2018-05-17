package de.kone1k1.games.FootballManager2k18.map;

public enum TileType {

	GRASS, STONE, BUSH, BUILDING_TL, BUILDING_TR, NOTHING1, NOTHING2, NOTHING3, NOTHING4, NOTHING5,
	TREE, STUMP, ROTTENTREE, BUILDING_BL, BUILDING_BR;

	public static TileType getTileByID(int id) {
		for (TileType t : TileType.values()) {
			if (t.ordinal() == id) {
				return t;
			}
		}
		return null;
	}
}
