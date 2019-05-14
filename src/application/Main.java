package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Main extends Application {

	public static Stage mainStage;
	public static Scene menu, sideBySide, singlePlayer;
	public static double[][] stats;


	public static void main(String[] args) {
		launch(args);
	}

	public void initialize(Stage primaryStage) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			mainStage = primaryStage;
			

			Menu mainMenu = new Menu();
			SideBySide s = new SideBySide();
			mainMenu.showMenu();
			s.showTable(stats);

			
			
			

			mainStage.setScene(menu);
			initialize(primaryStage);

		primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}