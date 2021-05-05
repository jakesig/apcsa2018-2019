package TrainLab.copy;
import java.util.ArrayList;
import java.awt.Color;
/**
 * Abstract class TrainCar - you are free to modify this class
 * 
 * @author (C. Sarkar)
 * @version (V1.0)
 */
public abstract class TrainCar {
    // derived class can access protected variables directly
    protected ArrayList<GeometricShape> myParts; 
    
    public TrainCar() {
        // myParts must be populated in concrete constructor in derived class
        // with all the various geometric shapes used to construct this TrainCar
        myParts = new ArrayList<GeometricShape>();
        
        Square body = new Square();
        myParts.add(body);
        
        
        Wheel frontWheel = new Wheel(Color.YELLOW); // you have to write Wheel class
        // position the wheels under the body
        frontWheel.moveVertical(80);
        frontWheel.moveHorizontal(30);
        myParts.add(frontWheel);
        
        // position the wheels under the body
        Wheel rearWheel = new Wheel(Color.YELLOW);
        rearWheel.moveVertical(80);
        rearWheel.moveHorizontal(110);
        myParts.add(rearWheel);
        
        this.changeColor(Train.DEFAULTCOLOR);   // set the initial color to the DEFAULT
        for (GeometricShape eachPart : myParts) {
            eachPart.moveVertical(500);  // create the train cars at middle of the screen
            eachPart.makeVisible();
        }
    }
    
    public void changeColor(Color newColor) {
        for (GeometricShape eachPart : myParts) {
                eachPart.changeColor(newColor);
        }
    }
    
     public void moveHorizontal(int pixels) {
        for (GeometricShape eachPart : myParts)
            eachPart.moveHorizontal(pixels);
     }
}
