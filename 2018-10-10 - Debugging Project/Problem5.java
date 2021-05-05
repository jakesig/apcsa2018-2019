
/**
 * Should add the numbers from 1 to 100 and print the result.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem5
{
    public static void main(String [] args)
    {
        int sum=0;
        for (int i = 1; i<=100; ++i)
                sum += i;
        System.out.println(sum);
    }
}