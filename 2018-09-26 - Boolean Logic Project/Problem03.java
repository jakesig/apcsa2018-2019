/**
 * Problem #3:
 * Write a method called biggest which returns the larger of three numbers.
 * You can assume that no two numbers will have the same value.
 * 
 * @author (put your name here) 
 * @version (a version number or a date)
 */
public class Problem03
{
    public static void main(String [] args) {
        
        assert  (biggest(7, 6, 9) == 9) : "failed test #1";
        assert  (biggest(7, -9, 0) == 7) : "failed test #2";
        assert  (biggest(-3, -9, 0) == 0) : "failed test #3";
        
        System.out.println("Congratulations. All tests passed. Move on to the next problem.");
    }
    
    public static int biggest(int x, int y, int z) {
        int a=0;
        if (y>x && y>z) {
            a=y;
        }
        if (x>y && x>z) {
            a=x;
        }
        if (z>x && z>y) {
            a=z;
        }
        return a;
    }
}