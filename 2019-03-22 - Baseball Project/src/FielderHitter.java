
public class FielderHitter extends Hitter {
	private double fieldPct;
	public FielderHitter(String name, int jerseryNumber, int atBat, int hits, int rbi, int homeRuns, double fieldPct) {
		super(name, jerseryNumber, atBat, hits, rbi, homeRuns);
		this.fieldPct = fieldPct;
	}
	@Override public String toString() {
		return super.toString()+"\nFielding Percent: "+(fieldPct*100)+"%";
	}
}
