
/**
 * Problem #1:
 * Write a method called biggest which returns the larger of two numbers.
 * You can assume that the two numbers will not have the same value.
 * 
 * @author (put your name here) 
 * @version (a version number or a date)
 */
public class Problem01
{
    public static void main(String [] args) {
        
        assert  (biggest(7, 9) == 9) : "failed test #1";
        assert  (biggest(7, -9) == 7) : "failed test #2";
        assert  (biggest(-3, -9) == -3) : "failed test #3";
        
        System.out.println("Congratulations. All tests passed. Move on to the next problem.");
    }
    
    public static int biggest(int x, int y) {
        int z=0;
        if (x>y) {
            z=x;
        }
        if (y>x) {
            z=y;
        }
        return z;
    }
}
