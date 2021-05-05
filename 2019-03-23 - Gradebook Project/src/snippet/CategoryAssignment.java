package snippet;

/****************************************************
**
** CategoryAssignment class
**
** This class represents an CategoryAssignment.
** Do not add any additional methods to this class.
**
****************************************************/
public class CategoryAssignment extends Assignment// something is missing at the end of this line
{
    private String category;
	// declare any new instance variables that you need here
    // don't forget to make them private!
    // don't declare more that you really need!
    
    // CategoryAssignment constructor
    //
    // postcondition: all instance variables are initialized with
    // the given values.     
    public CategoryAssignment (String category, String name, double pointsPossible, double pointsEarned) {
        super(name, pointsPossible, pointsEarned);
        this.category=category;
    }
    
    // getCategoryName accessor method
    //
    // postcondition: returns the name of the category associated
    // with this CategoryAssignment
    public String getCategoryName() {
    	return category;
    }
}
