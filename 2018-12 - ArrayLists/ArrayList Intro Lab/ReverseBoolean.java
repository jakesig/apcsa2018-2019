import java.util.ArrayList;
public class ReverseBoolean
{
    public static void main(String [] args) {
        ArrayList<Boolean> x = new ArrayList<Boolean>();
        x.add(true);
        x.add(true);
        x.add(true);
        x.add(true);
        x.add(false);
        x.add(false);
        System.out.println(x);
        reverseOrder(x); // you have to write this method
        System.out.println(x);
    }
    
    // the method reverseOrder should print the values of the argument in reverse order
    // add your code here
    public static void reverseOrder(ArrayList<Boolean> bools) {
        for (int i=0; i<bools.size(); ++i) {
            bools.add(bools.remove(bools.size()-1-i));
        }
    }
}
