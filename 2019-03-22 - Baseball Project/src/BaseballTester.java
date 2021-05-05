
public class BaseballTester {
	public static void main(String [] args) {
		BaseballTeam yanks = new BaseballTeam("Yankees");    // make a new team with zero players

		// create all the ball players
		// name, jersey, innings, ERA, fielding pct
		StartingPitcher tt = new StartingPitcher("Terukazu  Tanaka", 18, 30, 2.00, 0.975);
		StartingPitcher ne = new StartingPitcher("Nathan Eovaldi", 30, 10, 5.00, 0.902);
		// name, jersey, at bats, hits, rbi, home runs, fielding pct
		FielderHitter dj = new FielderHitter("Derek Jeter", 2,  36, 12, 7, 5, 0.987);
		// name, jersey atbats hits, rbi, home runs 
		DesignatedHitter ar = new DesignatedHitter("Alex Rodriguez", 13, 80, 20, 100, 15); // no field pct
		// name, jersey, innings, ERA, fielding pct, saves
		ReliefPitcher ac = new ReliefPitcher("Aroldis Chapman", 54, 10, 2.50, 0.915, 5); // 5 saves
		ReliefPitcher db = new ReliefPitcher("Dellan Betances", 68, 20, 3.50, 0.815, 3); // 3 saves

		// add the ball players to the team
		yanks.addPlayer(tt); // add tanaka
		yanks.addPlayer(dj); // add jeter
		yanks.addPlayer(ne); // add eovaldi
		yanks.addPlayer(ar); // add arod
		yanks.addPlayer(ac); // aroldis chapman
		yanks.addPlayer(db); // dellan betances

		// print out individual player statistics
		System.out.println(dj);	   // print out jeter’s stats
		System.out.println(ac); // print out aroldis’ stats

		// print out all the yankee statistics
		// team ERA should be calculated like this:
		// each pitchers innings times each pitchers era all added together
		// and then the entire total is divided by total innings pitched by the team
		// 
		// to calculate team fielding percentage just calculate the average fielding percentage of all the 
		// of all the non-designated hitter players on the team.

		System.out.println(yanks);

		}

}
