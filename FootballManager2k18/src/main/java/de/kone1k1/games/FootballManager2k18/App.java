package de.kone1k1.games.FootballManager2k18;

import java.net.URL;

import de.kone1k1.games.FootballManager2k18.gui.controller.FacilityController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		final URL url = getClass().getResource("gui/view/FacilityView.fxml");
		final FXMLLoader fxmlLoader = new FXMLLoader(url);
		fxmlLoader.setController(new FacilityController());
		final Parent root = fxmlLoader.load();

		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("Football Manager 2k18");
		primaryStage.show();

	}

	public static void main(String[] args) {

		launch(args);
	}

}
