package application;

public class Player {

	JSONDecoder a;

	double points, assists, rebounds, steals, blocks, fgp, ftp, turnovers, minutes, tpp;

	public Player(int id) {
		a = new JSONDecoder(id);
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

	}
	
	public void setID(int id) {
		a.SetID(id);
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
	}
	
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
