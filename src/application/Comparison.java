package application;

public class Comparison {
	
	
	//uses the statArray method to create a 2d array of player 1 and 2's stats, and the difference between the two
	//the difference allows for easy decision making for things such as which stats to highlight
	public static double[][] compare(Player a, Player b){
		double[][] table = new double[3][10];
		for(int i = 0; i<table[0].length;i++) {
			table[0][i] = a.statArray()[i];
		}
		for(int i = 0; i<table[1].length;i++) {
			table[1][i] = b.statArray()[i];
		}
		
		for(int i = 0;i<table[2].length;i++) {
			//turnovers (5th index in each array) are different because a player wants less turnovers, not more
			if(i!=5) {
				table[2][i] = table[0][i]- table[1][i];
			} else {
				table[2][i] = table[1][i]- table[0][i];

			}
		}
		
		//debug
		for(int i = 0; i<table.length; i++) {
			for(int j = 0; j<table[i].length;j++) {
				System.out.print(table[i][j]+" ");
			}
			System.out.println();
		}
		return table;
		
	}

}
