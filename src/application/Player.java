package application;

public class Player {

	JSONDecoder a;

	double points, assists, rebounds, steals, blocks, fgp, ftp, turnovers, minutes, tpp;

	public Player(int id) {
		a = new JSONDecoder(id);
		this.points = a.getPoints();
		this.assists = a.getPoints();
		this.rebounds = a.getPoints();
		this.steals = a.getPoints();
		this.blocks = a.getPoints();
		this.fgp = a.getPoints();
		this.ftp=  a.getFtp();
		this.turnovers = a.getTurnovers();
		this.minutes = a.getMinutes();
		this.tpp = a.getTpp();

	}
	
	public void setID(int id) {
		a.SetID(id);
		this.points = a.getPoints();
		this.assists = a.getPoints();
		this.rebounds = a.getPoints();
		this.steals = a.getPoints();
		this.blocks = a.getPoints();
		this.fgp = a.getPoints();
		this.ftp=  a.getFtp();
		this.turnovers = a.getTurnovers();
		this.minutes = a.getMinutes();
		this.tpp = a.getTpp();
	}
}
