import java.io.*;
import java.util.*;
/**
 * Write a description of class Split here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Split
{
    private static ArrayList<String> employees = new ArrayList<String>();
    private static ArrayList<String> ssn = new ArrayList<String>();
    private static ArrayList<String> name = new ArrayList<String>();
    private static ArrayList<String> salary = new ArrayList<String>();
    private static String[] temp = new String[4];
    private static String[] othertemp;
    
    public static void splitString() {
        for (int i=0; i<employees.size(); ++i) {
            if (employees.get(i).substring(employees.get(i).length()-1,employees.get(i).length()).equals(":"))
                temp[2]=" ";
            othertemp = employees.get(i).split(":");
            for (int j=0; j<othertemp.length; ++j) {
                temp[j]=othertemp[j];
            }
            for (int j=0; j<temp.length; ++j)
                if (temp[j]==null)
                    temp[j]="none";
            ssn.add(temp[0]);
            name.add(temp[1]);
            salary.add(temp[2]);
        }
    }
    
    public static void main(String [] args) throws FileNotFoundException {
        FileReader reader = new FileReader("H:\\BlueJ Files\\Quarter 3\\2-2019 - February\\252019 - Split Lab\\employee.txt");
        Scanner inputFile = new Scanner(reader);
        int lineAmt = 0;
        while (inputFile.hasNextLine()) {
            ++lineAmt;
            employees.add(inputFile.nextLine());
        }
        inputFile.close();
        splitString();
        PrintWriter ssnWrite = new PrintWriter("ssn.txt");
        PrintWriter nameWrite = new PrintWriter("name.txt");
        PrintWriter salaryWrite = new PrintWriter("salary.txt");
        for (int i=0; i<employees.size(); ++i) {
            ssnWrite.println(ssn.get(i));
            nameWrite.println(name.get(i));
            salaryWrite.println(salary.get(i));
        }
        ssnWrite.close();
        nameWrite.close();
        salaryWrite.close();
    }
    /* public static void main(String [] args) throws FileNotFoundException {
        PrintWriter outputFile = new PrintWriter("output.txt");
        FileReader reader = new FileReader("C:\\users\\stephen\\desktop\\bluej stuff\\fileIO\\input.txt");
        Scanner inputFile = new Scanner(reader);
        int lineCount = 0;
        while (inputFile.hasNextLine()) {
            ++lineCount;
            String line = inputFile.nextLine();  // read the next line
            outputFile.println("This is line " + lineCount + ": " + line);  // write it to the output file
        }
        inputFile.close();
        outputFile.close();
    }
    */
}
