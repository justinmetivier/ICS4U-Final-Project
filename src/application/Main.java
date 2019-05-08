package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		Player a = new Player(202331);
		Player b = new Player(203081);
		double[][] table = Comparison.compare(a, b);
		for(int i = 0; i<table.length;i++) {
			for(int j = 0; j<table[i].length;j++) {
				System.out.print(table[i][j]+" ");
			}
			System.out.println();
		}
		

		
	}
}
