import java.util.*;
public class SortedArrayList
{
    public static void main(String [] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(5, 7, 98, 101, 101));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(4, 6, 3, 5, 7, 8, 9));

        boolean answer = isSorted(a);
        System.out.println("Expected true, your answer: " + answer);
        answer = isSorted(b);
        System.out.println("Expected false, your answer: " + answer);
    }
    
    // write method isSorted() below
    public static boolean isSorted(ArrayList<Integer> nums) {
        for(int i=1; i<nums.size(); ++i)
            if (nums.get(i)<nums.get(i-1))
                return false;
        return true;
    }
}
