
/**
 * Write a description of class WaterVehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterVehicle extends Vehicle
{
    private double tonnage;
   
    public WaterVehicle(String type, String color, int maxSpeed, double price, double weight, double tonnage) {
        super(type, color, maxSpeed, price, weight);
        this.tonnage = tonnage;
    }
    
    public double getGrossTonnage() {return tonnage;}
    
    public void setGrossTonnage(double t) {tonnage = t;}
    
    @Override public String toString() {
        return super.toString() + "\nGross Tonnage: " + tonnage;
    }
}
