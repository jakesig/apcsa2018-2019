
/**
 * Write a description of class SnowBird here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SnowBird extends Snowman
{
    private String destination;
    private String airline;
    public SnowBird(int lumps, String hat, String d, String a) {
        super(lumps, hat);
        destination = d;
        airline = a;
    }
    
    @Override public String toString() {
        return super.toString() + "Destination: " + destination + "\nAirline" + airline;
    }
}
