import java.util.ArrayList;
/**
 * This is a practice of using methods in ArrayLists.
 *
 * @author (J. Sigman)
 * @version (12/6/2018)
 */
public class ArrayListPractice
{
    //Prints an arrayList or an array (depends on how you type it up)
    
    public static void printList(double [] nums) {
        for (double n:nums)
            System.out.println(n);
    }
    
    // Locate the index of the largest integer in the array
    
    public static int locateLargest(ArrayList<Integer> nums) {
        int index=0;
        for (int i=0; i<nums.size(); ++i) {
            if (nums.get(i)>nums.get(index))
                index=i;
        }
        return index;
    }
    
    //Retuns true if the ArrayList nums contains the value target
    
    public static boolean find(ArrayList<Integer> nums, int target) {
        return nums.contains(target);
    }
    
    //Rotates an ArrayList to the left
    
    public static void rotate(ArrayList<Integer> nums) {
        int shiftVal = nums.remove(0);
        nums.add(shiftVal);
        
        //alternative: nums.add(nums.remove(0));
    }
    
    //Rotates an ArrayList to the right
    
    public static void rotateRight(ArrayList<Integer> nums) {
        int shiftVal = nums.remove(nums.size()-1);
        nums.add(0,shiftVal);
        
        //alternative: nums.add(0, nums.remove(nums.size()-1));
    }
    
    //Removes all of the sevens from the array
    
    public static void removeSevens(ArrayList<Integer> nums) {
        for (int i=0; i<nums.size(); ++i)
            if (nums.get(i)==7) {
                nums.remove(i);
                --i;
            }
        
        //alternative: reverse parse the array.
        //alternative: use a while loop.
    }
    
    //Main method
    
    public static void main (String [] args) {
        //Setup
        
        ArrayList<Integer> y = new ArrayList<Integer>();
        y.add(3);
        y.add(7);
        y.add(7);
        y.add(5);
        y.add(7);
        y.add(12);
        
        double [] dub = {3.4,1.0,-5.6};
        //System.out.println(y);
        
        //locateLargest test
        
        System.out.println("*locateLargest*\nIndex of the largest value: " + locateLargest(y));
        System.out.println("--------------------");
        
        //find test
        
        int valueToFind = 0;
        System.out.println("*find*\nDid I find " +valueToFind + " in the array? " + find(y,valueToFind));
        System.out.println("--------------------");
        
        //rotate test
        System.out.println("*rotate*\nPre-rotate: " + y);
        rotate(y);
        System.out.println("Post-rotate: " + y);
        System.out.println("--------------------");
        
        //rotateRight test
        
        System.out.println("*rotateRight*\nPre-rotate: " + y);
        rotateRight(y);
        System.out.println("Post-rotate: " + y);
        System.out.println("--------------------");
        
        //removeSevens test
        
        System.out.println("*removeSevens*\nPre-Remove: " +y);
        removeSevens(y);
        System.out.println("Post-Remove: " +y);
        System.out.println("--------------------");
        
        //for-each loop printing test
        
        System.out.println("*for-each printing test*");
        printList(dub);
    }
}
