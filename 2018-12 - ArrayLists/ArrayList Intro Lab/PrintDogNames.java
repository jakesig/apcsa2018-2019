import java.util.ArrayList;
public class PrintDogNames
{
    public static void main(String [] args) {
        ArrayList<Dog> someDogs = new ArrayList<Dog>();
        someDogs.add ( new Dog("Fido") );
        someDogs.add ( new Dog("Rover") );
        someDogs.add ( new Dog("Spot") );
        someDogs.add ( new Dog("Snoopy") );
        someDogs.add ( new Dog("Snoop Doggy Dog") );

        printDogs(someDogs); // you have to write this method
    }
    
    // write the method printDogs below. you MUST use a for-each loop 
    // to print the dog names
    public static void printDogs(ArrayList<Dog> d) {
        for (Dog x:d)
            System.out.println(x.getName());
    }
}
