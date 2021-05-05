import java.util.*;
public class BaseballTeam {
	private String name;
	private ArrayList<BaseballPlayer> team;
	public BaseballTeam(String name) {
		this.name = name;
		team=new ArrayList<BaseballPlayer>();
	}
	public void addPlayer(BaseballPlayer player) {
		team.add(player);
	}
	public String toString() {
		String toReturn="Team Name: "+name;
		for (BaseballPlayer b:team) {
			toReturn+="\n-------------\n";
			toReturn+=b.toString();
		}
		return toReturn;
	}
}
