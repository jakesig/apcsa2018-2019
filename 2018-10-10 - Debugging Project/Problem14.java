
/**
 * 
 * Given 2 positive int values, return the larger value 
 * that is in the range 10..20 inclusive, or return 0 if 
 * neither is in that range.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Problem14
{
   public static void main (String [] args) {
       System.out.println(max1020(8,9));
   }
   
   public static int max1020(int a, int b) {
       if (b>a) {
           int temp = a;
           a = b;
           b = temp;
       }
       
       if (a >= 10 && a <= 20) return a;
       if (b >= 10 && b <= 20) return b; 
       return 0; 
   }
}
