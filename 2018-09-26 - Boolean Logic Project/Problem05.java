/**
 * Problem #5:
 * Write a method called howManyZeros which takes 5 integer arguments and 
 * returns the numbers of zeros it finds among the arguments.
 * 
 * Hint: First create an integer answer variable and initialize it to zero.
 * As you check each parameter, each time you find one that is zero, increment 
 * the answer variable by one. After all 5 parameters have been checked,
 * return the answer variable.
 * 
 * @author (put your name here) 
 * @version (a version number or a date)
 */
public class Problem05
{
    public static void main(String [] args) {
        
        assert  (howManyZeros(0,0,0,0,0) == 5) : "failed test #1";
        assert  (howManyZeros(0,1,2,3,4) == 1)  : "failed test #2";
        assert  (howManyZeros(-1,-1,-1,-1,-1) == 0)  : "failed test #3";
        
        System.out.println("Congratulations. All tests passed. Move on to the next problem.");
    }
    
    public static int howManyZeros (int a, int b, int c, int d, int e) {
        int counter=0;
        if (a==0) {
            counter++;
        }
        if (b==0) {
            counter++;
        }
        if (c==0) {
            counter++;
        }
        if (d==0) {
            counter++;
        }
        if (e==0) {
            counter++;
        }
        return counter;
    }
}