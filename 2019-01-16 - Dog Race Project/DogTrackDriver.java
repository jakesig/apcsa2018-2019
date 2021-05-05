import java.util.Scanner;   
/**
 * Write a description of class DogTrackDriver here.
 * 
 * @author (C. Sarkar) 
 * @version (11/15/14)
 */
public class DogTrackDriver
{

  public static void main(String[] args){     
    // first, determine the track size
    System.out.println("Enter an int > 3: size of the track");     
    Scanner s = new Scanner(System.in);      
    int sizeOfTrack = s.nextInt();      
    System.out.println("track Size: " + sizeOfTrack);    
    
    // now create a dog track
    DogTrack d = new DogTrack(sizeOfTrack, "Fido", "Spot", "Rover");  
    
    // simulate the race
    System.out.println(d);  // show dogs in their starting positions
    while (!d.isOver()) {  // repeat until there is at least one winner
            d.move(0, d.spin()); // move fido 
            d.move(1, d.spin()); // move spot
            d.move(2, d.spin()); // move rover
            System.out.println(d);  // show the new track positions and repeat
    }  
    
    d.printWinners(); // after race is over, print the winners
  } 
}

