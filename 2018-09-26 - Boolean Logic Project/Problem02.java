/**
 * Problem #2:
 * Write a method called biggest which returns the larger of two numbers.
 * If the two numbers are the same, return zero.
 * 
 * @author (put your name here) 
 * @version (a version number or a date)
 */
public class Problem02
{
    public static void main(String [] args) {
        
        assert  (biggest(7, 9) == 9) : "failed test #1";
        assert  (biggest(7, -9) == 7) : "failed test #2";
        assert  (biggest(-3, -3) == 0) : "failed test #3";
        
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
        if (y==x) {
            //left blank on purpose
        }
        return z;

    }
}