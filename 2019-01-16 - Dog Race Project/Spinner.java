
/**
 * Write a description of class Spinner here.
 *
 * @author (C. Sarkar)
 * @version (1/10/2019)
 */
public class Spinner
{
    private final int MAX;
    private final int MIN;
    
    public Spinner(int minimum, int maximum) {
        MIN = minimum;
        MAX = maximum;
    }

    public int spin() { 
        return ((int) (Math.random()*(MAX - MIN + 1))) + MIN; 
    }

    public static void main(String [] args) {
        Spinner s = new Spinner(1,6); // simulate a die roll
        for (int i=0; i < 50; ++i)
            System.out.println( s.spin() );
    }
}
