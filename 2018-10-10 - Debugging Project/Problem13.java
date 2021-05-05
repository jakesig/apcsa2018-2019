
/**
 * Write a description of class Problem13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem13
{
    public static void main (String [] args) {
        System.out.println(reverse(198));
    }
    
    public static int reverse (int n) {
       int rem, revNum = 0;
        
       for (int i = -1; i<=n; i++) {
            rem = n%10;
            revNum = revNum * 10 + rem;
            n /= 10; 
        }
        
       return revNum;
    }
}
