package de.kone1k1.games.FootballManager2k18.map;

import java.awt.Dimension;
import java.awt.Point;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GameMap {

	private int[][] map;

	public GameMap(Dimension dimension) {
		map = new int[dimension.height][dimension.width];
	}

	public void addEntity(Dimension dimension, Point location, int id) {

		if (isInBoundery(dimension, location) && noCollision(dimension, location)) {
			for (int i = location.y; i < dimension.getHeight() + location.y; i++) {
				for (int j = location.x; j < dimension.getWidth() + location.x; j++) {
					map[j][i] = id;
				}
			}
		}

	}

	public void removeEntity(Point location) {
		if (location.x <= map.length && location.y <= map.length) {
			map[location.x][location.y] = 0;
		}
	}

	private boolean isInBoundery(Dimension dimension, Point location) {

		int maxPosX = (int) (dimension.getWidth() + location.x);
		int maxPosY = (int) (dimension.getHeight() + location.y);
		if (maxPosX <= map[0].length && maxPosY <= map.length) {
			return true;
		} else {

			return false;

		}
	}

	private boolean noCollision(Dimension dimension, Point location) {

		boolean result = true;

		for (int i = location.y; i < dimension.getHeight() + location.y; i++) {
			for (int j = location.x; j < dimension.getWidth() + location.x; j++) {
				if (map[j][i] != 0) {
					System.out.println("testr");
					result = false;
				}
			}
		}
		return result;
	}

	public int[][] getMap() {
		return map;
	}
}
