package application;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class SideBySide{



	public void  showTable(double[][] stats) {
		Scene sideBySide;
		GridPane table = new GridPane();
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
		table.add(ppg1, 0, 0);
		table.add(apg1, 0, 1);
		table.add(rpg1, 0, 2);
		table.add(bpg1, 0, 3);
		table.add(spg1, 0, 4);
		table.add(topg1, 0, 5);
		table.add(fgp1, 0, 6);
		table.add(tpp1, 0, 7);
		table.add(ftp1, 0, 8);
		table.add(mins1, 0, 9);
		Main.sideBySide = new Scene(table, 400, 400);
	}







}
