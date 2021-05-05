/**
 * Write a description of class RectangleWombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RectangleWombat extends Wombat 
{
    int length;
    int width;
    int cwidth;
    int clength;
    boolean wOK;
    boolean lOK;
    public RectangleWombat(int l, int w) {
        super();
        length=l;
        width=w;
        cwidth=0;
        clength=0;
        lOK=true;
        wOK=false;
    }
    @Override public void move() {
    while (lOK==true) {
        if (length==clength) {
            clength=0;
            super.turn(90);
            if (width==cwidth) {    
                cwidth=0;
                super.turn(90);  
            }
            else {
                move();
                ++cwidth;
                break;
            }
        }
        else {
            super.move(1);
            ++clength;
        }
    }
        
    
}
}
