package de.kone1k1.games.FootballManager2k18.gui.model;

import java.awt.Point;

import javafx.scene.canvas.GraphicsContext;

public interface MapModelInterface {

	public void getMap(GraphicsContext gc);

	public void buildEntiy(Point location, int id);

	public void removeEntiy(Point location);

	void registerObserver();

	void removeObserver();
}
