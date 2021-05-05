
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSort
{
    private static int[] toSort = {1,5,4,7,3,78,54,978};
    private static int[] toSort1 = {1};
    private static int[] toSort2 = {};
    private static int[] toSort3 = {8,2,5,6,4,3,7};
    public static void main (String [] args) {
        //test case 1
        System.out.print("Before: ");
        print(toSort);
        bubbleSort(toSort);
        System.out.print("After: ");
        print(toSort);
        //test case 2
        System.out.print("Before: ");
        print(toSort1);
        bubbleSort(toSort1);
        System.out.print("After: ");
        print(toSort1);
        //test case 3
        System.out.print("Before: ");
        print(toSort2);
        bubbleSort(toSort2);
        System.out.print("After: ");
        print(toSort2);
        //test case 4
        System.out.print("Before: ");
        print(toSort3);
        bubbleSort(toSort3);
        System.out.print("After: ");
        print(toSort3);
    }
    
    public static void bubbleSort(int[] arr) {
        for (int j=0; j<arr.length; ++j) {
            for (int i=0; i<arr.length-1; ++i) {
                if (arr[i]>arr[i+1])
                    swap(arr,i,i+1);
                else
                    ;
            }
        }
    }
    
    public static void swap(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    
    public static void print(int[] arr) {
        String toPrint = "[";
        for (int i=0; i<arr.length; ++i) {
            toPrint+=arr[i];
            if (i!=arr.length-1)
                toPrint+=", ";
        }
        System.out.print(toPrint+"]\n");
    }
}
