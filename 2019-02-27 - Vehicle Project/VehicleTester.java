import java.util.*;
/**
 * Write a description of class VehicleTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VehicleTester
{
    public static void main(String [] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add( new Car("Red", 80, 27340.90, 3340.0) ); // color, speed, price, weight 
        vehicles.add( new Boat("Blue", 40, 60000.00, 1250.0, 2000.00) ); // color, speed, price, weight, tonnage 
        vehicles.add( new Car("Blue", 75, 17000.00, 2200.0) ); // color, speed, price, weight 
        
        System.out.println("Before: " + vehicles);
        Collections.sort(vehicles);
        System.out.println("After: " + vehicles);
    }
}
