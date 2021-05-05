
/**
 * Should print the prime numbers from 1 to 50.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem10
{
    public static boolean  isPrime(int x)   // returns true if x is a prime
    {
        boolean answer = true;
        for (int i=1; i<x; ++i)
        {
            if (((x%i)==0) && (i!=1)){ 
                answer = false;
                return answer;
            }
            else
                answer = true;
        }
        return answer;
    }
    public static void main(String [] args)
    {
        int sum=0;
        for (int i = 2; i<=50; ++i){
                if (isPrime(i)==true){
                    System.out.println(i+ " is prime.");
                }
            }
    }
}