
/**
 * Write a description of class LandVehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LandVehicle extends Vehicle
{
    private int wheels;
    
    public LandVehicle(String type, String color, int maxSpeed, double price, double weight, int wheels) {
        super(type, color, maxSpeed, price, weight);
        this.wheels = wheels;
    }
    
    public int getNumberOfWheels() {return wheels;}
    
    public void setNumberOfWheels(int w) {wheels = w;}
    
    @Override public String toString() {
        return super.toString() + "\nNumber of Wheels: " + wheels;
    }
}
