import java.io.*;
/**
 * Write a description of class FileWrite here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FileWrite
{
    public static void main (String [] args) {
        try {
            PrintWriter out=new PrintWriter("output.txt");
            out.write("Good");
            out.flush();
            out.close();
        }
        catch (IOException f) {
           
        }
    }
}
