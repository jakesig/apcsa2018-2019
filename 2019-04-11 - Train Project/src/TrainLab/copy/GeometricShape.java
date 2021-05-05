package TrainLab.copy;
import java.awt.Color;
/**
 * Write a description of class Shape here.
 * 
 * @author (C. Sarkar) 
 * @version (V1.0)
 */
public abstract class GeometricShape
{
   // protected classification will allow access in derived classes
   protected Color color; 
   protected static final Color DEFAULTCOLOR = Color.GREEN;
   
   protected abstract void draw();
   public abstract void makeVisible();
   
   public void changeColor(Color newColor) {
       color = newColor;
       draw();
   }
   
   public abstract void moveHorizontal(int pixelCount);
   public abstract void moveVertical(int pixelCount);
   
   public void move(int pixelCount) {
       moveHorizontal(pixelCount);
   }
       
}
