package application;

public class Comparison {
	
	public static double[][] compare(Player a, Player b){
		double[][] table = new double[3][10];
		for(int i = 0; i<table[0].length;i++) {
			table[0][i] = a.statArray()[i];
		}
		for(int i = 0; i<table[1].length;i++) {
			table[1][i] = b.statArray()[i];
		}
		
		for(int i = 0;i<table[2].length;i++) {
			if(i!=5) {
				table[2][i] = table[0][i]- table[1][i];
			} else {
				table[2][i] = table[1][i]- table[0][i];

			}
		}
		return table;
		
	}

}
