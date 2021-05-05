import java.util.*;
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card implements Comparable<Card>
{
    //variable declaration
    
    private int suit;
    private int rank;
    
    //Constructor creates a new card
    
    public Card(int s, int r) {
        suit=s;
        rank=r;
    }
    
    //Getters (no setters needed)
    
    public int getSuit() {
        return suit;
    }
    
    public int getRank() {
        return rank;
    }
    
    @Override public int compareTo(Card other) {
        if (suit<other.suit)
            return -1;
        if (suit>other.suit)
            return 1;
        else {
            if (rank<other.rank)
                return -1;
            else
                return 1;
        }
    }
}
