
/**
  * Should print the first n numbers of the fibonacci series starting from 1
 * Ex: fibonacci(6) should print 1, 1, 2, 3, 5, 8
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem11
{
    private int x;
    public static void main (String [] args) {
        fibonacci(6);
    }
    public static void fibonacci(int n)
    {
        if (n <= 1) {
            System.out.println(n);
        }
        n/=2;
        int fibo = 1;
        int fiboPrev = 1;
        for (int i = 0; i<n; ++i) {
            System.out.println(fibo);
            System.out.println(fiboPrev);
            if (i==(n-1)) {
               break; 
            }
            int temp = fibo;
            fibo += fiboPrev;
            temp = fiboPrev;
            fiboPrev+=fibo;
            
        }      
    }
}
