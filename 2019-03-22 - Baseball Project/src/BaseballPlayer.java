
public abstract class BaseballPlayer {
	private String name;
	private int jerseryNumber;
	public BaseballPlayer(String name, int jerseryNumber) {
		this.name = name;
		this.jerseryNumber = jerseryNumber;
	}
	public String toString() {
		return "Name: "+name+"\nJersey Number: "+jerseryNumber;
	}
}
