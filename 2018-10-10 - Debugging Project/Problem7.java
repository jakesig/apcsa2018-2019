
/**
 * Prints the sum of integers from 1 to n.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem7
{
    public static int sum(int n)
    {
        int answer = 1;
        for (int i=1; i<=n; ++i)
        {
            answer += i;
        }
        return answer;
    }
    public static void main(String [] args)
    {
        int x = sum(5);
        System.out.println("sum of 1 to 5 is:" +x);
    }
        
}
