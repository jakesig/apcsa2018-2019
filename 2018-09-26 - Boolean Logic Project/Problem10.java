/**
 * Problem #10:
 * 
 * Write a method called fiftyCents which takes 2 integer parameters. The
 * first represents the number of dimes while the second parameter represents
 * the number of nickels. The method returns true if the amount of money
 * implied by the two parameters equals fify cents. 
 * 
 * But if either parameter is 
 * negative, the method must return false and print an appropriate error message
 * to the console saying only positive parameters are allowed.
 * 
 * @author (put your name here) 
 * @version (a version number or a date)
 */
public class Problem10
{
    public static void main(String [] args) {
        
        assert  ( fiftyCents(0,10) ) : "failed test #1";
        assert  ( !fiftyCents(5,1) )   : "failed test #2";
        assert  ( fiftyCents(5,0) )  : "failed test #3";
        assert  ( !fiftyCents(-1,12) )   : "failed test #4";
        
        System.out.println("Congratulations. All tests passed. Move on to the next problem.");
    }
    
    public static boolean fiftyCents(int dimes, int nickels) {
        int int1=dimes*10;
        int int2=nickels*5;
        boolean x=false;
        if (int1<0 || int2<0) {
            x=false;
            System.out.println("Error: Parameter negative");
            return x;
        }
        if ((int1+int2)==50) {
            x=true;
        }
        if ((int1+int2)!=50){
            x=false;
        }
        
        return x;
    }
}