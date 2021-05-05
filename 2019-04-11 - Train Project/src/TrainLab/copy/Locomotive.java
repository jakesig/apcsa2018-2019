package TrainLab.copy;

import java.awt.Color;

public class Locomotive extends TrainCar{
	public Locomotive() {
		super();
		Square chimney = new Square();
		chimney.changeSize(20);
		chimney.changeColor(Color.red);
		chimney.moveVertical(-20);
		chimney.moveHorizontal(-20);
		Square chimney1 = new Square();
		chimney1.changeSize(20);
		chimney1.changeColor(Color.red);
		chimney1.moveVertical(-40);
		chimney1.moveHorizontal(-20);
		myParts.add(chimney);
		myParts.add(chimney1);
		for (GeometricShape eachPart : myParts) {
            eachPart.moveVertical(500);  // create the train cars at middle of the screen
            eachPart.makeVisible();
        }
	}
	
	
}
