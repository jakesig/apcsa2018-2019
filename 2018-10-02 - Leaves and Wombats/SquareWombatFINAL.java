/**
 * Write a description of class SquareWombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SquareWombatFINAL extends Wombat
{
    int length;
    int g;
    public SquareWombatFINAL(int s) {
        super();
        length=s-1;
        g=0;
    }
    @Override public void move() {
        if (length==g) {
            g=0;
            turn(90);
        }
        else {
            super.move(1);
            ++g;
        }
    }
}
