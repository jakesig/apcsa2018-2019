/**
 * Write a description of class DizzyWombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class DizzyWombatFINAL extends Wombat  
{
    @Override public void move() {
        move(2);
        Random num= new Random();
        int x=num.nextInt(360);
        turn(x);
    }
}
