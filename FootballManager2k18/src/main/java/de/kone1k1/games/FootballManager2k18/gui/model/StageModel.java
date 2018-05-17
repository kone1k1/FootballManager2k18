package de.kone1k1.games.FootballManager2k18.gui.model;

import javafx.stage.Stage;

public class StageModel {

	private static Stage stage;

	private StageModel() {
	}

	public static Stage getStage() {

		if (stage == null) {
			stage = new Stage();
		}
		return stage;
	}

}
