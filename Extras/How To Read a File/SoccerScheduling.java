/**
 * This code will help you in reading from a file.
 *
 * Jacob Sigman
 * 11/5/2018
 */
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class SoccerScheduling
{
    private Scanner scan;
    public int findLength() {
        try {
            scan = new Scanner(new File("H:\\BlueJ Files\\10302018 - Soccer Scheduling\\input.txt"));
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }
        int newLength=0;
        String getNext="";
        while (scan.hasNextLine()) {
            getNext=scan.nextLine();
            //Confirms that it has read a team
            System.out.println("Team "+(newLength+1)+" has been read as: "+getNext);
            newLength++;
        }
        return newLength;
    }
    public String[] findTeams(int length) {
        try {
            scan = new Scanner(new File("H:\\BlueJ Files\\10302018 - Soccer Scheduling\\input.txt")); //Use the address for your own file
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }
        String[] newTeam=new String[length];
        //Makes the team array
        for (int j=0; j<length; ++j)
            newTeam[j]=scan.nextLine();
        return newTeam;
    }

    public static void main (String [] args) {
        SoccerScheduling x=new SoccerScheduling();
        int length=x.findLength();
        String[] team=x.findTeams(length);
        //Prints the array (Just to make sure that it worked)
        for(int i=0; i<team.length; ++i)
            System.out.println(team[i]);
    }
}
