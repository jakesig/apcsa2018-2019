
/**
 * Should evaluate and print x! (x factorial). For example 3! = 3*2*1 = 6; 5! = 5*4*3*2*1 = 120; etc.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem9
{
    public static int factorial(int x)
    {
        if (x==0) return 0;
        int product = 1;
        for (int i=x; i>0; --i)
        {   
            product *= i;
        }
        return product;
    }
    public static void main(String [] args)
    {
        int x = 5;
        int answer = factorial(x);
        System.out.println("5! = "+answer);
    }
}

