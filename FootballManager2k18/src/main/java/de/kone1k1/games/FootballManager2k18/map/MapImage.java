package de.kone1k1.games.FootballManager2k18.map;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class MapImage {

	private final GameMap gameMap;
	private Image tileSet;

	public static final int tW = 32;
	public static final int tH = 32;

	public MapImage(GameMap gameMap) {
		this.gameMap = gameMap;
		tileSet = new Image(this.getClass().getResourceAsStream("tileset.png"));
	}

	public void drawMap(GraphicsContext gc) {

		int[][] map = gameMap.getMap();

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				drawTile(gc, TileType.getTileByID(map[i][j]), i * tW, j * tH);
			}
		}
	}

	private void drawTile(GraphicsContext gc, TileType t, int desX, int desY) {

		// 10 Anzahl der Kästchen im Tileset
		int mx = t.ordinal() % 10;
		int my = t.ordinal() / 10;

		gc.drawImage(tileSet, mx * tW, my * tH, tW, tH, desX, desY, tW, tH);

	}

}
