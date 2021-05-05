/**
 * Problem #4:
 * Write a method called oneFalse which returns true if exactly one of the three
 * boolean parameters is false.
 * 
 * @author (put your name here) 
 * @version (a version number or a date)
 */
public class Problem04
{
    public static void main(String [] args) {
        
        assert  (oneFalse(true, false, true)) : "failed test #1";
        assert  (oneFalse(false, true, true)) : "failed test #2";
        assert  (!oneFalse(true, true, true)) : "failed test #3";
        
        System.out.println("Congratulations. All tests passed. Move on to the next problem.");
    }
    
    public static boolean oneFalse(boolean x, boolean y, boolean z) {
        boolean a=false;
        if (x==false && y==true && z==true) {
            a=true;
        }
        if (x==true && y==false && z==true) {
            a=true;
        }
        if (x==true && y==true && z==false) {
            a=true;
        }
        return a;
    }
}