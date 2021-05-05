
public abstract class Pitcher extends BaseballPlayer {
	private int innings;
	private double era;
	private double fieldingPct;
	public Pitcher(String name, int jerseryNumber, int innings, double era, double fieldingPct) {
		super(name, jerseryNumber);
		this.innings = innings;
		this.era = era;
		this.fieldingPct = fieldingPct;
	}
	@Override public String toString() {
		return super.toString() + "\nInnings Pitched: "+innings+"\nERA: "+era+"\nFielding Percent:"+(fieldingPct*100)+"%";
	}
}
