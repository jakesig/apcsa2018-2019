import java.util.ArrayList;
public class DogKennel
{
    private ArrayList <Dog> dogs;
    
    public DogKennel() { /* constructor method not shown */ }
    
    public void addAdog(Dog d) { 
        dogs.add(d);
    }
    
    public boolean find(String dogName) {
        for (int i=0; i<dogs.size(); ++i) {
           if (((dogs.get(i)).getName()).equals(dogName))
               return true;
        }
        return false;
    }
    
    public boolean remove(String dogName) {
        for (int i=dogs.size()-1; i>=0; --i) {
            if (((dogs.get(i)).getName()).equals(dogName)) {
                dogs.remove(i);
                return true;
            }
        }
    }

    public ArrayList<Dog> findChampions(int medals) {
        ArrayList<Dog> toReturn = new ArrayList<Dog>();
        for (Dog d:dogs) {
            if (d.getMedals()>=medals)
                toReturn.add(d);
        }
        return toReturn;
    }
}
