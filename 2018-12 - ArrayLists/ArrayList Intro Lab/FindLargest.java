import java.util.*;
public class FindLargest
{
    public static void main(String [] args) {
        ArrayList<Double> x = new ArrayList<>(Arrays.asList(1.3, -5.6, 7.0, 2.5)); // here is another way to initialize an ArrayList
        ArrayList<Double> y = new ArrayList<>(Arrays.asList(-1.4, -3.5, -2.0, -0.6, -2.7 ));

        double largest = findLargest(x); // you have to write this method
        System.out.println("Expected answer is 7.0, your answer is: " + largest);
        largest = findLargest(y);
        System.out.println("Expected answer is -0.6, your answer is: " + largest);
    }
    
    // write method findLargest, below
    // you MUST use a for-each loop
    public static double findLargest(ArrayList<Double> nums) {
        double largest=nums.get(0);
        for (Double d:nums)
            if (d>largest)
                largest=d;
        return largest;
    }
}
