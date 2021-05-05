
/**
 * Write a description of class JakePic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JakePic
{
    public static void main (String [] args) {
        
    Circle sun = new Circle();
    sun.moveHorizontal(250);
    sun.moveVertical(100);
    sun.changeColor("red");
    sun.changeSize(80);
    
    Square body = new Square();
    body.makeVisible();
    body.changeColor("magenta");
    body.changeSize(300);
    body.moveVertical(200);
    
    Triangle roof = new Triangle();
    roof.makeVisible();
    roof.changeSize(200,300);
    roof.moveHorizontal(160);
    roof.moveVertical(35);
    
    Square window11 = new Square();
    window11.makeVisible();
    window11.changeSize(60);
    window11.moveVertical(300);
    window11.moveHorizontal(50);
    
    Square window12 = new Square();
    window12.makeVisible();
    window12.changeSize(60);
    window12.moveVertical(240);
    window12.moveHorizontal(50);
    
    Square window21 = new Square();
    window21.makeVisible();
    window21.changeSize(60);
    window21.moveVertical(300);
    window21.moveHorizontal(190);
    
    Square window22 = new Square();
    window22.makeVisible();
    window22.changeSize(60);
    window22.moveVertical(240);
    window22.moveHorizontal(190);
    
    Square door1 = new Square();
    door1.makeVisible();
    door1.moveVertical(470);
    door1.moveHorizontal(135);
    
    Square door2 = new Square();
    door2.makeVisible();
    door2.moveVertical(440);
    door2.moveHorizontal(135);
    
    sun.makeVisible();
    sun.slowMoveVertical(-120);
}
}
