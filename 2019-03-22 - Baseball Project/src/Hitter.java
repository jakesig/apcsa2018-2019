
public abstract class Hitter extends BaseballPlayer{
	private int atBat;
	private int hits;
	private int rbi;
	private int homeRuns;
	public Hitter(String name, int jerseryNumber, int atBat, int hits, int rbi, int homeRuns) {
		super(name, jerseryNumber);
		this.atBat = atBat;
		this.hits = hits;
		this.rbi = rbi;
		this.homeRuns = homeRuns;
	}
	@Override public String toString() {
		return super.toString()+"\nTimes at Bat: "+atBat+"\nHits: "+hits+"\nRBI: "+rbi+"\nHome Runs: "+homeRuns;
	}
}
