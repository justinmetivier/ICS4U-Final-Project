package application;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Menu {
	static JSONParser parser = new JSONParser();
	static JSONArray json;
//f is for first name, l is for last name
	String f1, f2, l1, l2;
	Player a, b;

	public Menu() throws ParseException, FileNotFoundException, IOException {
		json = (JSONArray) parser.parse(new FileReader("Players.json"));
		a = new Player();
		b = new Player();
	}

	//uses local json file that has first and last name of players to find player's id
	public static int findPlayer(String first, String last) {
		int id = 0;
		JSONObject temp;
		if (first.length() > 1 && last.length() > 1) {
			// linear search comparing first name and last name
			for (int i = 0; i < json.size(); i++) {
				temp = (JSONObject) json.get(i);
				if (first.equals((String) temp.get("firstName")) && last.equals((String) temp.get("lastName"))) {
					id = (int) ((long) temp.get("playerId"));
					break;
				} else {
					//sets id to -1 if cannot find name
					id = -1;
				}
			}
		} else {
			//sets id to -1 if text fields are blank
			id = -1;
		}

		return id;
	}

	public void showMenu() {


		Button addaplayer, submit;

		GridPane menuroot = new GridPane();
		TextField playerid1 = new TextField();
		TextField playerid2 = new TextField();
		addaplayer = new Button();
		submit = new Button();
		Text title = new Text("NBA Stats Navigator");
		Text instructions = new Text("Enter names in The text fields as first name, then last name \nEach row is a different player\nPlease ensure all names are spelt correctly and captilized\nFor one player stats, enter first and last name in first row");

		TextField first1 = new TextField();
		TextField last1 = new TextField();
		TextField first2 = new TextField();
		TextField last2 = new TextField();

		addaplayer.setText("Add A Player");

		submit.setText("Submit");
		submit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) throws NullPointerException {
				//saves textfields and sets static strings in main to names
				f1 = first1.getText();
				f2 = first2.getText();
				l1 = last1.getText();
				l2 = last2.getText();
				Main.player1Name = f1+" "+l1;
				Main.player2Name = f2+" "+l2;

				//finds id of both players and compares stats, if one player is not valid or blank, will fill 0 for all stats
				a.setID(findPlayer(f1, l1));
				b.setID(findPlayer(f2, l2));
				Main.stats = Comparison.compare(a, b);

				//creates single player and sidebyside view
				SideBySide s = new SideBySide();
				SinglePlayer sing = new SinglePlayer();

				//if both players text fields are filled in and id is valid, sets up and shows two player view
				if (f1.length() > 0 && l1.length() > 0 && f2.length() > 0 && l2.length() > 0&&findPlayer(f1,l1)>0&&findPlayer(f2,l2)>0) {
					s.showTable(Main.stats);
					Main.mainStage.setScene(Main.sideBySide);
					//if one player is filled in and other is blank, and one has valid id, sets up and shows single player view
				} else if(f1.length()>0&&l1.length()>0&&f2.length()==0&&l2.length()==0&&findPlayer(f1,l1)>0) {
					sing.showTable(Main.stats);
					Main.mainStage.setScene(Main.singlePlayer);
				} else {
					//if neither of these happen, the two types of valid input, displays alert saying input is wrong
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Invalid Input!");
					alert.setHeaderText("The input entered does not match the input criteria");
					alert.setContentText("Please try again");

					alert.showAndWait();
				}

			}
		});
		title.setX(0);
		title.setY(200);

		instructions.setX(0);
		instructions.setY(150);

		//adds all elements to pane
		menuroot.add(instructions, 0, 1);

		menuroot.add(first1, 0, 2);

		menuroot.add(last1, 1, 2);

		menuroot.add(first2, 0, 3);

		menuroot.add(last2, 1, 3);

		menuroot.add(submit, 0, 5);

		menuroot.add(title, 0, 0);
		//sets static menu scene to the pane
		Main.menu = new Scene(menuroot, 500, 500);

	}

}
