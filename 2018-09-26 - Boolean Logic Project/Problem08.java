/**
 * Problem #8:
 * 
 * Write a method called twoAreOdd which takes 5 integer parameters
 * and returns true if exactly two of them are odd.
 * 
 * Hint: You will need to use the module (%) operator.
 * 
 * @author (put your name here) 
 * @version (a version number or a date)
 */
public class Problem08
{
    public static void main(String [] args) {
        
        assert  ( twoAreOdd(0,2,3,4,5) ) : "failed test #1";
        assert  ( !twoAreOdd(0,2,3,7,5) )   : "failed test #2";
        assert  ( twoAreOdd(7, 7, 10, 12, 14) )   : "failed test #3";
        assert  ( !twoAreOdd(7,9,11,13,15) )   : "failed test #4";
        
        System.out.println("Congratulations. All tests passed. Move on to the next problem.");
    }
    
    public static boolean twoAreOdd(int a, int b, int c, int d, int e) {
        boolean f=false;
        if(a%2==1 && b%2==1 && c%2!=1 && d%2!=1 && e%2!=1) {
           f=true;
        }
        if(a%2==1 && b%2!=1 && c%2==1 && d%2!=1 && e%2!=1) {
           f=true;
        }
        if(a%2==1 && b%2!=1 && c%2!=1 && d%2==1 && e%2!=1) {
           f=true;
        }
        if(a%2==1 && b%2!=1 && c%2!=1 && d%2!=1 && e%2==1) {
           f=true;
        }
        if(a%2!=1 && b%2==1 && c%2==1 && d%2!=1 && e%2!=1) {
           f=true;
        }
        if(a%2!=1 && b%2==1 && c%2!=1 && d%2==1 && e%2!=1) {
           f=true;
        }
        if(a%2!=1 && b%2==1 && c%2!=1 && d%2!=1 && e%2==1) {
           f=true;
        }
        if(a%2!=1 && b%2!=1 && c%2==1 && d%2==1 && e%2!=1) {
           f=true;
        }
        if(a%2!=1 && b%2!=1 && c%2==1 && d%2!=1 && e%2==1) {
           f=true;
        }
        if(a%2!=1 && b%2!=1 && c%2!=1 && d%2==1 && e%2==1) {
           f=true;
        }
        return f;
    }
}