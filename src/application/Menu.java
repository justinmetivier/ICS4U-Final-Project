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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Menu {
	static JSONParser parser = new JSONParser();
	static JSONArray json;
	
	String f1, f2, l1, l2;
	Player a, b;
	public boolean submitted;

	public Menu() throws ParseException, FileNotFoundException, IOException {
		json = (JSONArray) parser.parse(new FileReader("Players.json"));
		a = new Player();
		b = new Player();
	}

	public static int findPlayer(String first, String last) {
		int id = 0;
		JSONObject temp;
		if(first.length()>1&&last.length()>1) {
		//linear search comparing first name and last name
		for(int i = 0; i<json.size();i++){
			temp = (JSONObject) json.get(i);
			if(first.equals((String)temp.get("firstName"))&&last.equals((String)temp.get("lastName"))){
				id = (int)((long) temp.get("playerId"));
				break;
			} else {
				id = -1;
			}
		}
		} else {
			id = -1;
		}
		
		return id;
	}
	
	
	public void showMenu() {
		
		submitted = false;
		
		Button addaplayer, submit;
		
		GridPane menuroot = new GridPane();
		TextField playerid1 = new TextField();
		TextField playerid2 = new TextField();
		addaplayer = new Button();
		submit = new Button();
		Text title = new Text("NBA Stats Navigator");
		Text instructions = new Text("Select One-Player Stats or Two-Player Comparison");
		
		TextField first1 = new TextField();
		TextField last1 = new TextField();
		TextField first2 = new TextField();
		TextField last2 = new TextField();
		
		addaplayer.setText("Add A Player");
		
		submit.setText("Submit");
		submit.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) throws NullPointerException{
		    	f1 = first1.getText();
		    	f2 = first2.getText();
		    	l1 = last1.getText();
		    	l2 = last2.getText();
		    	submitted = true;
		    	
		    	Main.mainStage.setScene(Main.sideBySide);
				a.setID(findPlayer(f1,l1));
				b.setID(findPlayer(f2,l2));
				Main.stats = Comparison.compare(a, b);

		    }
		});		
		title.setX(0);
		title.setY(200);
		
		instructions.setX(0);
		instructions.setY(150);
		
		menuroot.add(instructions, 0, 1);
		
		menuroot.add(first1, 0, 2);

		menuroot.add(last1, 1, 2);

		menuroot.add(first2, 0, 3);
		
		menuroot.add(last2, 1, 3);

		menuroot.add( submit, 0 ,5);
	
		menuroot.add(title, 0, 0);
		Main.menu = new Scene(menuroot, 500, 500);

				
	}

}
