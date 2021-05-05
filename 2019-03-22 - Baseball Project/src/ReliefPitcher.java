
public class ReliefPitcher extends Pitcher{
	private int saves;
	public ReliefPitcher(String name, int jerseryNumber, int innings, double era, double fieldingPct, int saves) {
		super(name, jerseryNumber, innings, era, fieldingPct);
		this.saves = saves;
	}
	public String toString() {
		return super.toString()+"\nSaves: "+saves;
	}
}
