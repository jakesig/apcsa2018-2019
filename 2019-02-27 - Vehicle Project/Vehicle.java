
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle implements Comparable<Vehicle>
{
    private String type;
    private String color;
    private double weight;
    private int maxSpeed;
    private double price;
    
    public Vehicle(String type, String color, int maxSpeed, double price, double weight) {
        this.type = type;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.weight = weight;
    }
    
    public String getType() {return type;}
    public String getColor() {return color;}
    public double getWeight() {return weight;}
    public int getMaxSpeed() {return maxSpeed;}
    public double getPriceWhenNew() {return price;}
    
    public void setType(String t) {type = t;}
    public void setColor(String c) {color = c;}
    public void setWeight(double w) {weight = w;}
    public void setMaxSpeed(int s) {maxSpeed = s;}
    public void setPriceWhenNew(double p) {price = p;}
    
    @Override public String toString() {
        return "\nType: " + type + "\nColor: " + color + "\nWeight: " + weight + "\nMaximum Speed: " + maxSpeed + "\nPrice: " + price;
    }
    
    @Override public int compareTo(Vehicle other) {
        //By Speed
        /*
        if (other.getMaxSpeed()<maxSpeed) {
            return -1;
        }
        else if (other.getMaxSpeed()>maxSpeed) {
            return 1;
        }
        else {
            return 0;
        }
        */
        //By Price
        
        if (other.getPriceWhenNew()<price) {
            return -1;
        }
        else if (other.getPriceWhenNew()>price) {
            return 1;
        }
        else {
            return 0;
        }
        
        //By color and type 
        /*
        if (other.getColor().compareTo(color)==0) {
            return other.getType().compareTo(type);
        }
        return color.compareTo(other.getColor());
       */
    }
}
