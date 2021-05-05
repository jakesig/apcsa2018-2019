package snippet;

import java.util.ArrayList;

/****************************************************
**
** CategoryGradebook class
**
** This class represents a CategoryGradebook that calculates
** grades according to the weighted category grading system.
**
****************************************************/
public class CategoryGradebook implements Gradebook {
    // declare any new instance variables that you need here
    // don't forget to make them private!
    // don't declare more that you really need!
    private String [] categories;
    private int [] weights;
    private ArrayList<CategoryAssignment> myGrades;
    // precondition: categories.length == weights.length;
    // categories contains the names of all categories in this Gradebook;
    // weights contains the values of the weights of each corresponding category;
    // each value in weights is between 0 and 100 inclusive
    // postcondition: all instance variables are initialized;
    // if sum of elements in weights is not equal to 100, then the weight of
    // the last category is adjusted so that the sum is equal to 100
    public CategoryGradebook(String[] categories, int[] weights) {
    	this.categories=categories;
    	this.weights=weights;
    	int sum=0;
    	for (int i:weights) sum+=i;
    	if (sum>100) weights[weights.length-1]-=sum-100;
    	if (sum<100) weights[weights.length-1]+=100-sum;
    	myGrades = new ArrayList<CategoryAssignment>();
    }

    // calculateGrade accessor method
    //
    // postcondition: the grade represented by this Gradebook is calculated and
    // returned, according to the weighted category grading system. To calculate this
    // value, first calculate the average of all assignments in each category. Then,
    // multiply each of those values with the value of the weight for that category.
    // Finally, add the values together. This value is between 0 and 100, inclusive.
    // 
    // If your task can be made easier by adding private helper methods to this class,
    // then be sure that they are thoroughly documented with comments. 
    public double calculateGrade() {
        double average = 0.0;
        double assignmentsNum = 0.0;
        double value = 0.0;
        double finalVal = 0.0;
    	for (int i=0; i<categories.length; ++i) {
    		average=0;
    		assignmentsNum=0;
    		value=0;
        	for (CategoryAssignment a:myGrades) {
        		if (a.getCategoryName().equals(categories[i])) {
        			average+=a.getPointsEarned();
        			assignmentsNum+=a.getPointsPossible();
        		}
        		
        	}
        	average/=assignmentsNum;
    		value+=average*weights[i];
        	finalVal+=value;
        }
    	return finalVal;
    }
    
    // add mutator method
    //
    // precondition: assign IS-A CategoryAssignment
    // postcondition: the given Assignment object is added to this Gradebook
    @Override public void add(Assignment assign) {
    	myGrades.add((CategoryAssignment) assign);
    }
}
