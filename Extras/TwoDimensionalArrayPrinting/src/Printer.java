
public class Printer {
	public static void main (String [] args) {
		int [] [] life = { {1,2,3,4},{5,6,7,8},{9,0,0,0}};
		for (int i=0; i<life.length; ++i) {
			for (int j=0; j<life[0].length; ++j)
				System.out.print(life[i][j]+"\t");
			System.out.println();
		}
	}
}
