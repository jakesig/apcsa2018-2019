
/**
 * This version of the Dog class is used as a piece of the DogTrack
 * project. It is given to you to use as is. It should not be necessary
 * for you to add code here to get the project to work. But you may 
 * enhance this class, if you wish.
 * 
 * @author (C. Sarkar) 
 * @version (11/15/14)
 */
public class Dog
{
    String name = "!";    // initialized in the constructor; never changed again
    int position;   // where the dog is on the track currently
    
    // constructor
    public Dog(String n) {
        name = n;
        position = 0; // every dog starts at the starting gate (position 0)
    }
    
    public void setPosition(int p) {
        position = p;
    }
    
    public int getPosition() { return position; }
    
    public String getName() { return name; }
    
    public String getFirstInitial() {
        if (name.length() > 0)
            return name.substring(0,1); // example: if name is "Fido" returns "F"
        else
            return "?";
    }
    
}
