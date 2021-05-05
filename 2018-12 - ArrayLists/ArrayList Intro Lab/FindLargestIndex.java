import java.util.*;
public class FindLargestIndex
{
    public static void main(String [] args) {
        ArrayList<Double> x = new ArrayList<>(Arrays.asList(1.3, -5.6, 7.0, 2.5));

        int largestIndex = findLargest(x);
        System.out.println("Expected answer is 2, your answer is: " + largestIndex);
        
    }
    
    // write method findLargest() below
    
    public static int findLargest(ArrayList<Double> nums) {
        double largest=nums.get(0);
        for (Double d:nums)
            if (d>largest)
                largest=d;
        return nums.indexOf(largest);
    }
}