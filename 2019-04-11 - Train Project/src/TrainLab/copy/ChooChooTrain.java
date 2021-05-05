package TrainLab.copy;
import java.awt.Color;
import java.util.ArrayList;
public class ChooChooTrain implements Train {
    private ArrayList<TrainCar> myCars;
    
    public ChooChooTrain(int length, int cars) {
        this(Train.DEFAULTCOLOR); // default color
    }
    
    public ChooChooTrain(Color color) {
        
        myCars = new ArrayList<TrainCar>();
        // insert code to add a locomotive to the arraylist
        myCars.add(new Locomotive());
        myCars.get(0).moveHorizontal(100);
        myCars.add(new BoxCar());
        myCars.add(new BoxCar());
        myCars.get(2).moveHorizontal(-110);
        // insert code to add a boxcar to the arraylist
           
        this.changeColor(color.RED); // set the color to what the user wants
    }
    
    public void changeColor(Color newColor) {
        for (TrainCar eachCar : myCars)
           eachCar.changeColor(newColor);
    }
    
    public void run(int pixels) {
        for (int i=0; i<pixels; i+=20) {
        	myCars.get(0).moveHorizontal(20);
        	myCars.get(1).moveHorizontal(20);
        	myCars.get(2).moveHorizontal(20);
        }
    }
}

