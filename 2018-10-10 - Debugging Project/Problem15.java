
/**
 * 
 * Return the sum of two 6-sided dice rolls, each in the range 1..6. 
 * However, if noDoubles is true, if the two dice show the same value, 
 * increment one die to the next value, wrapping around to 1 if its 
 * value was 6.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Problem15
{
    public static void main (String [] args) {
        System.out.println(withoutDoubles(2,2,true));
    }
    
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles) {
            if (die1 == die2) {
                if (die1 != 6){
                    die1+=1;
                    return die1 + die2;}
                else {
                    return 1 + die2;}
            } 
        }
        
        return die1 + die2;
    }

}
