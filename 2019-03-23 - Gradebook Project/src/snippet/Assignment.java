package snippet;
/****************************************************
**
** Assignment class
**
** This class represents an Assignment. 
**
****************************************************/
public class Assignment {
     private String name;           // what qualifiers is/are missing in front of these declarations?
     private double pointsPossible;
     private double pointsEarned;

    // Assignment constructor
    //
    // postcondition: all instance variables are initialized with
    // the given values. 
    public Assignment (String name, double pointsPossible, double pointsEarned) {
    	this.name = name;
    	this.pointsPossible = pointsPossible;
    	this.pointsEarned = pointsEarned;
    }
    
    // zero argument constructor - call the other one and set
    // name = "unknown", pointsPossible and pointsEarned to zero
    public Assignment() {
    	this.name = "unknown";
    	this.pointsPossible = 0.0;
    	this.pointsEarned = 0.0;
    }
    
    // getName accessor method
    //
    // postcondition: returns the name of this Assignment
    public String getName() {
        return name;
    }
    
    // getPointsPossible accessor method
    //
    // postcondition: returns the points possible for this Assignment
    public double getPointsPossible() {
    	return pointsPossible;
    }
    
    // getPointsEarned accessor method
    //
    // postcondition: returns the points earned for this Assignment
    public double getPointsEarned() {
    	return pointsEarned;
    }
}
