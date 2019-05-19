package application;

public class Player {

	JSONDecoder a;

	double points, assists, rebounds, steals, blocks, fgp, ftp, turnovers, minutes, tpp;

	public Player() {
		//creates new JSON decoder
		a = new JSONDecoder();
	}
	
	public void setID(int id) {
		//if id is valid, assign all JSON stats to instance variables, else, set stats to zero
		if(id>0) {
		JSONDecoder.SetID(id);
		this.points = a.getPoints();
		this.assists = a.getAssists();
		this.rebounds = a.getRebounds();
		this.steals = a.getSteals();
		this.blocks = a.getBlocks();
		this.fgp = a.getFgp();
		this.ftp=  a.getFtp();
		this.turnovers = a.getTurnovers();
		this.minutes = a.getMinutes();
		this.tpp = a.getTpp();
		} else {
			this.points = 0;
			this.assists = 0;
			this.rebounds = 0;
			this.steals = 0;
			this.blocks = 0;
			this.fgp = 0;
			this.ftp= 0;
			this.turnovers = 0;
			this.minutes = 0;
			this.tpp =0;
		}
	}
	
	//puts all stats into a 1d array and returns
	public double[] statArray() {
		double[] array = new double[10];
		array[0] = this.points;
		array[1] = this.assists;
		array[2] = this.rebounds;
		array[3] = this.steals;
		array[4] = this.blocks;
		array[5] = this.turnovers;
		array[6] = this.minutes;
		array[7] = this.fgp;
		array[8] = this.tpp;
		array[9] = this.ftp;
		return array;
	}
}
