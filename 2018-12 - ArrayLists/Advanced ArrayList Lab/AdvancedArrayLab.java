import java.util.ArrayList;
import java.util.Collections;
public class AdvancedArrayLab
{
    public static void main (String [] args) {
        ArrayList<Integer> sample = new ArrayList<Integer>();
        sample.add(-1);
        sample.add(-2);
        sample.add(3);
        sample.add(3);
        sample.add(3);
        ArrayList<Double> sampleDouble = new ArrayList<Double>();
        sampleDouble.add(2.2);
        sampleDouble.add(1.4);
        sampleDouble.add(3.5);
        sampleDouble.add(3.7);
        sampleDouble.add(6.8);
        System.out.println("Before: "+sample);
        //Methods used in this lab
        
        //removeOdds(sample);
        //swapFirstLast(sample);
        //reverseOrder(sample)
        //removeLargeSmall(sampleDouble);
        //Collections.shuffle(sample);
        //moveNegatives(sample);
        System.out.println("After: "+sample);
    }
    
    public static void removeOdds(ArrayList<Integer> nums) {
        for (int i=nums.size()-1; i>=0; --i) {
            if (nums.get(i)%2==1 || nums.get(i)%2==-1)
                nums.remove(i);
        }
    }
    
    public static void swapFirstLast(ArrayList<Integer> nums) {
        int temp = nums.get(0);
        nums.set(0,nums.get(nums.size()-1));
        nums.set(nums.size()-1,temp);
    }
    
    public static void removeRepeats(ArrayList<Integer> nums) {
        for (int i=1; i<nums.size(); ++i) {
            if (nums.get(i-1)==nums.get(i)) {
                nums.remove(i);
                --i;
            }
        }
    }
    
    public static void reverseOrder(ArrayList<Integer> nums) {
        for (int i=0; i<nums.size(); ++i) {
            nums.add(nums.remove(nums.size()-1-i));
        }
    }
    
    public static void removeLargeSmall(ArrayList<Double> nums) {
        Double largest=nums.get(0);
        Double smallest=nums.get(0);
        for (int i=0; i<nums.size(); ++i) {
            if (nums.get(i)<smallest)
                smallest=nums.get(i);
            if (nums.get(i)>largest)
                largest=nums.get(i);
        }
        nums.remove(largest);
        nums.remove(smallest);
    }
    
    public static void moveNegatives(ArrayList<Integer> nums) {
        for (int i=nums.size()-1; i>=0; --i) {
            if (nums.get(i)<0) {
                nums.add(nums.remove(i));
            }
        }
    }
}
