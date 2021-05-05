
/**
 * Write a description of class JakePic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JakePic
{
    public static void main (String [] args) {
        Circle body = new Circle();
        body.changeSize(400);
        body.moveHorizontal(75);
        body.moveVertical(100);
        body.changeColor("red");
        body.makeVisible();
        for (int i=0; i<23; ++i) {
            Circle tail = new Circle();
            tail.changeSize(100);
            tail.moveHorizontal(i*3);
            tail.moveVertical(i*5);
            tail.changeColor("green");
            tail.makeVisible();
        }
        Triangle tip = new Triangle();
        tip.changeSize(100,50);
        tip.changeColor("blue");
        tip.makeVisible();
    }
}
