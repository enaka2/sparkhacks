import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;


public class Moist extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("The Moist Metter");
	     Parent root = FXMLLoader.load(getClass().getResource("frontscreenmoist.fxml"));
		 //Set background color to black
		 root.setStyle("-fx-background-color: #393d3a;");
	     Scene scene = new Scene(root);
		 primaryStage.setScene(scene);
		 primaryStage.show();
	}

}
