
/**
 * Write a description of class Arrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arrays
{
    public static void main (String [] args) {
        int [] data= {7,3,5,9,-2};
        printArray(data);
        rotate(data);
        printArray(data);
    }
    
    public static void rotate(int[] a) {
        int temp=0;
        for (int i=0; i<a.length; i++) {
            if (i==0) {
                temp=a[a.length-1];
                a[a.length-1]=a[0];
                a[0]=temp;
            }
            else {
                a[i]=temp;
                a[i]=a[i-1];
                a[i-1]=temp;
            }
        }
    }
    
    public static void printArray(int[] a) {
        for(int i=0;i<a.length;++i)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}
