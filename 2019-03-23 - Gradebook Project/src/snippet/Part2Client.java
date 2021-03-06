package snippet;

/****************************************************
**
** Client class for Part 2
**
** This class is a Gradebook client, and is used
** to test the CategoryAssignment and CategoryGradebook
** classes.
**
** First, write a program that declares an CategoryAssignment 
** object, and then invokes all CategoryAssignment methods using
** that object. Print the return values to the screen, and
** verify that the CategoryAssignment class works properly. 
**
** Then, delete or comment out that code, and 
** write a program that declares a CategoryGradebook
** object, and adds CategoryAssignment objects to it. Then, 
** invoke the calculateGrade method on the CategoryGradebook
** object, and print the resulting value to the screen. 
**
** Do you have a class in school that uses a weighted 
** category grading system, and in which you know your
** grades? You can use your own grades to test your
** CategoryGradebook and CategoryAssignment classes! 
** Otherwise, you can use the following data:
**
** The two categories in this example are "Labs" and "Tests".
** Each has a weight of 50.
**
** name         pts available         pts earned    category
** Lab 1        30                    27            Labs
** Lab 2        30                    30            Labs
** Test 1       30                    30            Tests
** Lab 3        30                    30            Labs
** Lab 4        30                    30            Labs
** Test 2       30                    15            Tests
** Test 3       30                    0             Tests
** 
** The grade printed should be 73.75
**
** After this works, you should change your code so that the
** CategoryGradebook is instantiated with weights of 50 and 75
** in each category. The constructor should reduce the second
** weight to 50, and the grade calculated for this data should
** be the same as above.
**
** Then, instantiate the CategoryGradebook with weights of 50
** and 25 in each category. The constructor should increase the 
** second weight to 50, and the grade calculated for this data 
** should be the same as above.
**
****************************************************/
public class Part2Client {
    public static void main(String[] args) {
    	/*System.out.println("CategoryAssignment Class Test");
        CategoryAssignment newProj = new CategoryAssignment("Projects","Complex Numbers Lab", 100.0, 98);
        System.out.println("Category: " + newProj.getCategoryName());
        System.out.println("Name: " + newProj.getName());
        System.out.println("Possible Points: " + newProj.getPointsPossible());
        System.out.println("Earned Points: " + newProj.getPointsEarned());
        */
    	String [] cat = {"Labs", "Tests"};
    	int [] weights = {50, 75};
    	CategoryGradebook book2 = new CategoryGradebook(cat, weights);
    	book2.add(new CategoryAssignment("Labs", "Lab 1", 30, 27));
    	book2.add(new CategoryAssignment("Labs", "Lab 2", 30, 30));
    	book2.add(new CategoryAssignment("Tests", "Test 1", 30, 30));
    	book2.add(new CategoryAssignment("Labs", "Lab 3", 30, 30));
    	book2.add(new CategoryAssignment("Labs", "Lab 4", 30, 30));
    	book2.add(new CategoryAssignment("Tests", "Test 2", 30, 15));
    	book2.add(new CategoryAssignment("Tests", "Test 3", 30, 0));
    	System.out.println("Grade: "+book2.calculateGrade()); 
    }
}
