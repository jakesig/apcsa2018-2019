import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (1/11/2019)
 */
public class Deck
{
    //Variable declaration
    
    private ArrayList<Card> deck;
    private ArrayList<String> suits;
    private ArrayList<String> ranks;
    private ArrayList<Card> cards;
    private static final int MAXCARDS = 52;
    int number;
    
    //Constructor that creates an empty deck
    
    public Deck() {
        deck = new ArrayList<Card>();
        cards = new ArrayList<Card>();
        ranks=new ArrayList<String>();
        suits=new ArrayList<String>();
        for (int i=1; i<5; ++i)
            for (int j=1; j<14; ++j)
                cards.add(new Card(i,j));
        init();
    }
    
    /*
    public Deck(Deck other) {
    
    }
    */
    
    //Constructer that creates a deck of size n
    
    public Deck(int n) {
        deck = new ArrayList<Card>();
        cards = new ArrayList<Card>();
        ranks = new ArrayList<String>();
        suits = new ArrayList<String>();
        init();
        for (int i=1; i<5; ++i)
            for (int j=1; j<14; ++j)
                cards.add(new Card(i,j));
        Collections.shuffle(cards);
        if (n>52) {
            number=52;
            System.out.println("Number greater than 52. Deck with 52 cards will be created.");
        }
        else
            number=n;
        for (int i=0; i<number; ++i) {
            deck.add(cards.get(i));
        }
    }    
    
    public void init() {
        ranks.add("Ace");
        ranks.add("2");
        ranks.add("3");
        ranks.add("4");
        ranks.add("5");
        ranks.add("6");
        ranks.add("7");
        ranks.add("8");
        ranks.add("9");
        ranks.add("10");
        ranks.add("Jack");
        ranks.add("Queen");
        ranks.add("King");
        suits.add("Clubs");
        suits.add("Diamonds");
        suits.add("Hearts");
        suits.add("Spades");
    }
    
    public int findCard(String rank, String suit) {
        int numSuit=suits.indexOf(suit)+1;
        int numRank=ranks.indexOf(rank)+1;
        String search = ""+numRank+numSuit;
        String exist= "";
        for (int i=0; i<deck.size(); ++i) {
            exist = ""+deck.get(i).getRank()+deck.get(i).getSuit();
            if (exist.equals(search)) {
                return i;
            }
        }
        return -1;
    }
    
    public void sortDeck() {
        Collections.sort(deck);
    }
    
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }
    
    @Override public String toString() {
        String stringSuit = "";
        String stringRank = "";
        if (deck.size()==0)
            return "[]";
        String toReturn = "[";
        for (int i=0; i<deck.size(); ++i) {
            if (ranks.get(deck.get(i).getRank()-1).equals("10"))
                stringRank="10";
            else
                stringRank=ranks.get(deck.get(i).getRank()-1).substring(0,1);
            stringSuit=suits.get(deck.get(i).getSuit()-1).substring(0,1);
            toReturn+=stringRank+stringSuit;
            if (i!=deck.size()-1)
                toReturn+=", ";
        }
        toReturn+="]";
        return toReturn;
    }
    
    public boolean addCard(String cardRank, String cardSuit) {
        int numSuit=suits.indexOf(cardSuit)+1;
        int numRank=ranks.indexOf(cardRank)+1;
        int find = findCard(cardRank, cardSuit);
        if (find!=-1) {
            return false;
        }
        deck.add(new Card(numSuit, numRank));
        return true;
    }
    
    //Uses the findCard function to seek out and remove a card from the deck
    
    public boolean removeCard(String cardRank, String cardSuit) {
        int find = findCard(cardRank, cardSuit);
        if (find!=-1) {
            deck.remove(find);
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if (deck.size()==52)
            return true;
        return false;
    }
    
    public boolean isSorted() {
        ArrayList<Card> sortedDeck = new ArrayList<Card>();
        for (int i=0; i<deck.size(); ++i)
            sortedDeck.add(new Card(deck.get(i).getSuit(), deck.get(i).getRank()));
        Collections.sort(sortedDeck);
        for (int i=0; i<deck.size(); ++i) {
            if (sortedDeck.get(i).getRank()!=deck.get(i).getRank() || sortedDeck.get(i).getSuit()!=deck.get(i).getSuit())
                return false;
        }
        return true;
    }
}
