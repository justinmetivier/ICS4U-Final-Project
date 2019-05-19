package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class SideBySide extends Table {

	public void showTable(double[][] stats) {
		Scene sideBySide;
		GridPane table = new GridPane();
		Button menu = new Button();
		Text title = new Text("Side By Side");

		//displays titles for stats of player 1, spaced two apart
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
		table.add(name, 1, 1);
		table.add(ppg1, 0, 3);
		table.add(apg1, 0, 5);
		table.add(rpg1, 0, 7);
		table.add(bpg1, 0, 9);
		table.add(spg1, 0,11);
		table.add(topg1, 0, 13);
		table.add(fgp1, 0, 15);
		table.add(tpp1, 0, 17);
		table.add(ftp1, 0, 19);
		table.add(mins1, 0, 21);

		//titles for player 2
		Text ppg2 = new Text("PPG");
		Text apg2 = new Text("APG");
		Text rpg2 = new Text("RPG");
		Text bpg2 = new Text("BPG");
		Text spg2 = new Text("SPG");
		Text topg2 = new Text("TOPG");
		Text fgp2 = new Text("FG%");
		Text tpp2 = new Text("3PT%");
		Text ftp2 = new Text("FT%");
		Text mins2 = new Text("Mins");

		table.add(ppg2, 2, 3);
		table.add(apg2, 2, 5);
		table.add(rpg2, 2, 7);
		table.add(bpg2, 2, 9);
		table.add(spg2, 2,11);
		table.add(topg2, 2, 13);
		table.add(fgp2, 2, 15);
		table.add(tpp2, 2, 17);
		table.add(ftp2, 2, 19);
		table.add(mins2, 2, 21);
		
		//displays stats of player 1

		Text ppgval1 = new Text("" + Main.stats[0][0]);
		Text apgval1 = new Text("" + Main.stats[0][1]);
		Text rpgval1 = new Text("" + Main.stats[0][2]);
		Text bpgval1 = new Text("" + Main.stats[0][3]);
		Text spgval1 = new Text("" + Main.stats[0][4]);
		Text topgval1 = new Text("" + Main.stats[0][5]);
		Text fgpval1 = new Text("" + Main.stats[0][7]);
		Text tppval1 = new Text("" + Main.stats[0][8]);
		Text ftpval1 = new Text("" + Main.stats[0][9]);
		Text minsval1 = new Text("" + Main.stats[0][6]);

		table.add(ppgval1, 1, 3);
		table.add(apgval1, 1, 5);
		table.add(rpgval1, 1, 7);
		table.add(bpgval1, 1, 9);
		table.add(spgval1, 1, 11);
		table.add(topgval1, 1, 13);
		table.add(fgpval1, 1, 15);
		table.add(tppval1, 1, 17);
		table.add(ftpval1, 1, 19);
		table.add(minsval1, 1, 21);
		
		//stats of player 2

		Text ppgval2 = new Text("" + Main.stats[1][0]);
		Text apgval2 = new Text("" + Main.stats[1][1]);
		Text rpgval2 = new Text("" + Main.stats[1][2]);
		Text bpgval2 = new Text("" + Main.stats[1][3]);
		Text spgval2 = new Text("" + Main.stats[1][4]);
		Text topgval2 = new Text("" + Main.stats[1][5]);
		Text fgpval2 = new Text("" + Main.stats[1][7]);
		Text tppval2 = new Text("" + Main.stats[1][8]);
		Text ftpval2 = new Text("" + Main.stats[1][9]);
		Text minsval2 = new Text("" + Main.stats[1][6]);
		Text name2 = new Text(Main.player2Name);

		//if one stat is greater than the other, highlight the greater one
		if (Main.stats[2][0] < 0)
			ppgval2.setFill(Color.GREEN);
		else
			ppgval1.setFill(Color.GREEN);

		if (Main.stats[2][1] < 0)
			apgval2.setFill(Color.GREEN);
		else
			apgval1.setFill(Color.GREEN);

		if (Main.stats[2][2] < 0)
			rpgval2.setFill(Color.GREEN);
		else
			rpgval1.setFill(Color.GREEN);

		if (Main.stats[2][3] < 0)
			bpgval2.setFill(Color.GREEN);
		else
			bpgval1.setFill(Color.GREEN);

		if (Main.stats[2][4] < 0)
			spgval2.setFill(Color.GREEN);
		else
			spgval1.setFill(Color.GREEN);

		if (Main.stats[2][5] < 0)
			topgval2.setFill(Color.GREEN);
		else
			topgval1.setFill(Color.GREEN);

		if (Main.stats[2][7] < 0)
			fgpval2.setFill(Color.GREEN);
		else
			fgpval1.setFill(Color.GREEN);

		if (Main.stats[2][8] < 0)
			tppval2.setFill(Color.GREEN);
		else
			tppval1.setFill(Color.GREEN);

		if (Main.stats[2][9] < 0)
			ftpval2.setFill(Color.GREEN);
		else
			ftpval1.setFill(Color.GREEN);

		if (Main.stats[2][6] < 0)
			minsval2.setFill(Color.GREEN);
		else
			minsval1.setFill(Color.GREEN);
		
		//adds stats of player 2
		table.add(name2, 3, 1);
		table.add(ppgval2, 3, 3);
		table.add(apgval2, 3, 5);
		table.add(rpgval2, 3, 7);
		table.add(bpgval2, 3, 9);
		table.add(spgval2, 3, 11);
		table.add(topgval2, 3, 13);
		table.add(fgpval2, 3, 15);
		table.add(tppval2, 3, 17);
		table.add(ftpval2, 3, 19);
		table.add(minsval2, 3, 21);

		
		//back to menu button
		menu.setText("Back to Menu");
		table.add(menu, 0, 25);
		menu.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) throws NullPointerException {

				Main.mainStage.setScene(Main.menu);

			}
		});
		Main.sideBySide = new Scene(table, 400, 400);

	}

}
