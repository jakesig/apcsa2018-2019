/**
 * Problem #7:
 * 
 * Write a method called howManyOdd which takes 5 integer parameters
 * and returns how many of them are odd.
 * 
 * Hint: You will need to use the module (%) operator.
 * 
 * @author (put your name here) 
 * @version (a version number or a date)
 */
public class Problem07
{
    public static void main(String [] args) {
        
        assert  (howManyOdd(1,2,3,4,5) == 3) : "failed test #1";
        assert  (howManyOdd(1,3,3,4,5) == 4)  : "failed test #2";
        assert  (howManyOdd(5,5,5,5,5) == 5)  : "failed test #3";
        assert  (howManyOdd(0,0,0,0,0) == 0)  : "failed test #4";
        
        System.out.println("Congratulations. All tests passed. Move on to the next problem.");
    }
    
    public static int howManyOdd(int a, int b, int c, int d, int e) {
        int counter=0;
        if (a%2==1) {
            counter++;
        }
        if (b%2==1) {
            counter++;
        }
        if (c%2==1) {
            counter++;
        }
        if (d%2==1) {
            counter++;
        }
        if (e%2==1) {
            counter++;
        }
        return counter;
    }
}