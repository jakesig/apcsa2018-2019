import java.util.*;
public class FindValue
{
   public static void main(String [] args) {
       ArrayList<Integer> n = new ArrayList<>(Arrays.asList(5, 7, -3, 4, 67));
       int answer = find(n, 67); // should return a 4
       System.out.println("Expected answer is 4, your answer: " + answer);
       answer = find(n, 68);
       System.out.println("Expected answer is -1, your answer: " + answer);
    }
    
   // write method find() below
   public static int find(ArrayList<Integer> x, int value) {
       return x.indexOf(value);
   }
}
