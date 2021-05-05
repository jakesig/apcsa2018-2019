/**
 * Problem #9:
 * 
 * Write a method called closeTo20 which takes 2 integer parameters
 * and returns true if one of the arguments (but not both) is within 5 of 20.
 * 
 * Hint: You will need to use the Math.abs() method.
 * 
 * @author (put your name here) 
 * @version (a version number or a date)
 */
public class Problem09
{
    public static void main(String [] args) {
        
        assert  ( closeTo20(0,20) ) : "failed test #1";
        assert  ( !closeTo20(19,22) )   : "failed test #2";
        assert  ( !closeTo20(0,50) )   : "failed test #3";
        assert  ( closeTo20(15,100) )   : "failed test #4";
        
        System.out.println("Congratulations. All tests passed. Move on to the next problem.");
    }
    
    public static boolean closeTo20(int x, int y) {
        int dist1=Math.abs(20-x);
        int dist2=Math.abs(20-y);
        boolean bool=false;
        if (dist1<=5 && dist1>=-5){
            bool=true;
        }
        if (dist2<=5 && dist2>1-5){
            bool=true;
        }
        if ((dist1<=5 && dist1>=-5) && (dist2<=5 && dist2>1-5)) {
            bool=false;
        }
        return bool;
    }
}