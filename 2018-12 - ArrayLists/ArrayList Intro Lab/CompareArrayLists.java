import java.util.*;
public class CompareArrayLists
{
    public static void main(String [] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(5, 7, 9));
        ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(5, 7, 9));
        ArrayList<Integer> c = new ArrayList<Integer>(Arrays.asList(5, 7, 8));

        boolean answer = false;
        answer = compare(a, b);
        System.out.println("Expected true, your answer: " + answer);
        answer = compare(a, c);
        System.out.println("Expected false, your answer: " + answer);
    }
    
    // write method compare() here
    public static boolean compare(ArrayList<Integer> x, ArrayList<Integer> y) {
        for (int i=0; i<x.size(); ++i) {
            if (x.get(i)!=y.get(i))
                return false;
        }
        return true;
    }
}
