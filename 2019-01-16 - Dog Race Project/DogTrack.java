import java.util.ArrayList;
/**
 * Dogtrack simulates a dog race between three mechanical dogs.
 * 
 * @author (C. Sarkar) 
 * @version (11/15/14)
 */

public class DogTrack // Version A
{
    private static final int NUMOFDOGS = 3;
    private static final int MAXSPIN = 5;
    private static final int MINSPIN = 1;
    private int size;
    private Dog[] competitors;
    
    // constructor takes 4 arguments: size of track (int) and three dog names (String)
    // after initiailzing the tracksize variable, we have to create the array of three
    // dog pointers and initialize each pointer to point to a newly created Dog object.
    // precondition: sizeOfTrack must be an integer greater than 3.
    public DogTrack(int sizeOfTrack, String name0, String name1, String name2) {
        competitors = new Dog[NUMOFDOGS];
        competitors[0] = new Dog(name0); 
        competitors[1] = new Dog(name1); 
        competitors[2] = new Dog(name2);
        size=sizeOfTrack;
    }
    
    @Override public String toString() {
        String toPrint="";
        int before = 0;
        for (Dog d:competitors) {
            if (d.getPosition()>=size)
                before=size-1;
            else
                before=d.getPosition();
            for (int i=0; i<before; ++i)
                toPrint+="-";
            toPrint+=d.getFirstInitial();
            for (int i=1; i<size-d.getPosition(); ++i)
                toPrint+="-";
            toPrint+="\n";
        }
        return toPrint;
    }
    
    // method spin() returns an integer between 1 and 5 inclusive.
    // it uses the Math.random() method to generate the random number in
    // the range 0 ... 0.9999. This number is then properly scaled to produce 
    // an integer which is one of the following values: 0, 1, 2, 3, 4, 5.
    
    public int spin() {
        Spinner s = new Spinner(MINSPIN, MAXSPIN);
        return s.spin();
    }
    
    // isOver() returns true if any of the dogs are at the end position of the track 
    // (position tracksize -1).
    
    public boolean isOver() {
        for (Dog d:competitors)
            if (d.getPosition()==size-1)
                return true;
        return false;
    }
 
    
    // method printWinners() prints "Dog X has won" for each dog that has
    // reached the end position on the track. Note there can be zero, one, two
    // or three winners.
    
    public void printWinners() {
        for (Dog d:competitors)
            if (d.getPosition()>=size-1) 
                System.out.println(d.getName() + " has won!");
    }
    
    // precondition: dogIndex must be 0, 1, or 2 because there are only three dogs
    public void move(int dogIndex, int advance) {
        competitors[dogIndex].setPosition(competitors[dogIndex].getPosition()+advance);
    }
}
