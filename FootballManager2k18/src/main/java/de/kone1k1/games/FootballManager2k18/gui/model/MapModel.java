package de.kone1k1.games.FootballManager2k18.gui.model;

import java.awt.Dimension;
import java.awt.Point;

import de.kone1k1.games.FootballManager2k18.map.GameMap;
import de.kone1k1.games.FootballManager2k18.map.MapImage;
import javafx.scene.canvas.GraphicsContext;

public class MapModel implements MapModelInterface {

	private GameMap map = new GameMap(new Dimension(20, 20));
	private MapImage mapIMG = new MapImage(map);

	@Override
	public void getMap(GraphicsContext gc) {
		mapIMG.drawMap(gc);
	}

	@Override
	public void buildEntiy(Point location, int id) {
		map.addEntity(new Dimension(1, 1), location, id);

	}

	@Override
	public void removeEntiy(Point location) {
		map.removeEntity(location);

	}

	@Override
	public void registerObserver() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeObserver() {
		// TODO Auto-generated method stub

	}

}
