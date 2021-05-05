/**
 * Write a description of class BipolarWombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BipolarWombat extends Wombat
{
    public BipolarWombat() {
        super();
    }
    @Override public void move() {
        int x=0;
        if (x%2==0) {
            
            super.setRotation(180);
            super.move(1);
            x++;
        }
        if (x%2==1){
            super.setRotation(0);
            super.move(1);
            x++;
        }
    }
}
