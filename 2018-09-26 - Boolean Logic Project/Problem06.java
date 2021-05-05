/**
 * Problem #6:
 * Write a method called distanceFrom17 which takes an integer argument and 
 * returns a non-negative integer that describes how far the parameter is away 
 * from 17. 
 * 
 * Hint: You will need to use the Math.abs() method to get the absolute distance.
 * 
 * @author (put your name here) 
 * @version (a version number or a date)
 */
public class Problem06
{
    public static void main(String [] args) {
        
        assert  (distanceFrom17(17) == 0) : "failed test #1";
        assert  (distanceFrom17(20) == 3)  : "failed test #2";
        assert  (distanceFrom17(14) == 3)  : "failed test #3";
        assert  (distanceFrom17(-3) == 20)  : "failed test #4";
        
        System.out.println("Congratulations. All tests passed. Move on to the next problem.");
    }
    
    public static int distanceFrom17(int x) {
        int dist=Math.abs(17-x);
        return dist;

    }
}