package de.kone1k1.games.FootballManager2k18.gui.controller;

import java.awt.Point;
import java.net.URL;
import java.util.ResourceBundle;
import de.kone1k1.games.FootballManager2k18.gui.model.MapModel;
import de.kone1k1.games.FootballManager2k18.map.MapImage;
import de.kone1k1.games.FootballManager2k18.map.TileType;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class FacilityController implements Initializable {

	@FXML
	private Canvas imgMap;

	@FXML
	private Button btnBuild;

	@FXML
	private Button btnRemove;

	@FXML
	private Label labelMoney;

	@FXML
	private ChoiceBox<TileType> cbEntity;

	private GraphicsContext gc;
	private MapModel mModel = new MapModel();

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		gc = imgMap.getGraphicsContext2D();
		mModel.getMap(gc);

		cbEntity.getItems().setAll(TileType.values());
		cbEntity.setValue(TileType.STONE);

		btnBuild.setOnAction(this::buildButtonPressed);

		imgMap.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> buildHandle(event));

	}

	private void buildHandle(MouseEvent event) {

		int x = (int) event.getX() / MapImage.tW;
		int y = (int) event.getY() / MapImage.tH;
		System.out.println("X: " + x + " Y: " + y);
		Point loc = new Point(x, y);

		if (event.isSecondaryButtonDown()) {
			mModel.removeEntiy(loc);
		} else if (event.isPrimaryButtonDown()) {
			mModel.buildEntiy(loc, cbEntity.getValue().ordinal());
		}
		mModel.getMap(gc);
	}

	protected void buildButtonPressed(ActionEvent event) {

	}
}
