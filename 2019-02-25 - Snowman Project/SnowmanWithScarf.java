
/**
 * Write a description of class Scarf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnowmanWithScarf extends Snowman implements Comparable<Snowman>
{
    private String accessory;
    private String scarfColor;
    
    public SnowmanWithScarf() {
        super(2,"black");
        accessory ="broom";
        scarfColor ="red plaid";   
    }

    @Override public int compareTo(Snowman other)
    {
        if (other.getNumberOfLumps()>getNumberOfLumps())
            return 1;
        if (other.getNumberOfLumps()<getNumberOfLumps())
            return -1;
        return 0;
    }
    
    public String toString()
    {
        return super.toString() + "  " + accessory + "  " + scarfColor;
    }
}
