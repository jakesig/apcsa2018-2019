package TrainLab.copy;
import java.awt.Color;
/**
 * Write a description of class MyPicture here.
 * 
 * @author (C. Sarkar) 
 * @version (V1.0)
 */
public class TrainRunner
{
   public static void main (String [] args)
   {
    //System.out.println("\f"); // clear console
    //System.out.println("Hello world!");
    
    ChooChooTrain t1 = new ChooChooTrain(Color.RED);
    t1.run(500);   
   }
}