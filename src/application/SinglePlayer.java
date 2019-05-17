package application;

import java.util.Arrays;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class SinglePlayer extends Table{


	public void showTable(double[][] stats) {
		Scene sideBySide;
		GridPane table = new GridPane();
		Button menu = new Button();
		Text title = new Text("Single Player");

		Text ppg1 = new Text("PPG");
		Text apg1 = new Text("APG");
		Text rpg1 = new Text("RPG");
		Text bpg1 = new Text("BPG");
		Text spg1 = new Text("SPG");
		Text topg1 = new Text("TOPG");
		Text fgp1 = new Text("FG%");
		Text tpp1 = new Text("3PT%");
		Text ftp1 = new Text("FT%");
		Text mins1 = new Text("Mins");
		Text name = new Text(Main.player1Name);
		
		table.add(title, 1, 0);
		table.add(name, 0, 1);
		table.add(ppg1, 0, 3);
		table.add(apg1, 0, 5);
		table.add(rpg1, 0, 7);
		table.add(bpg1, 0, 9);
		table.add(spg1, 0, 11);
		table.add(topg1, 0, 13);
		table.add(fgp1, 0, 15);
		table.add(tpp1, 0, 17);
		table.add(ftp1, 0, 19);
		table.add(mins1, 0, 21);
		
		Text ppgval = new Text("" + Math.abs(Main.stats[2][0]));
		Text apgval = new Text("" + Math.abs(Main.stats[2][1]));
		Text rpgval = new Text("" + Math.abs(Main.stats[2][2]));
		Text bpgval = new Text("" + Math.abs(Main.stats[2][3]));
		Text spgval = new Text("" + Math.abs(Main.stats[2][4]));
		Text topgval = new Text("" + Math.abs(Main.stats[2][5]));
		Text fgpval = new Text("" + Math.abs(Main.stats[2][7]));
		Text tppval = new Text("" + Math.abs(Main.stats[2][8]));
		Text ftpval = new Text("" + Math.abs(Main.stats[2][9]));
		Text minsval = new Text("" + Math.abs(Main.stats[2][6]));
		
		table.add(ppgval, 1, 3);
		table.add(apgval, 1, 5);
		table.add(rpgval, 1, 7);
		table.add(bpgval, 1, 9);
		table.add(spgval, 1, 11);
		table.add(topgval, 1, 13);
		table.add(fgpval, 1, 15);
		table.add(tppval, 1, 17);
		table.add(ftpval, 1, 19);
		table.add(minsval, 1, 21);





		
		menu.setText("Back to Menu");
		table.add(menu, 0, 25);
		menu.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) throws NullPointerException{
		    	
		    	
		    	Main.mainStage.setScene(Main.menu);
			

		    }
		});			
		Main.singlePlayer = new Scene(table, 400, 400);	}
	
	

}
