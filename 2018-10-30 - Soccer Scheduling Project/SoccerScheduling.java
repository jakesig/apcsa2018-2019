/**
 * 
 *
 * Jacob Sigman
 * 11/5/2018
 */
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class SoccerScheduling {
    private Scanner scan;
    private FileWriter output;
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
        System.out.print("All teams read. Proceed to scheduling? (0/1)");
        Scanner k = new Scanner(System.in);
        int g = k.nextInt();
        if (g==1)
            System.out.print("\f");
        else
            System.exit(0);
        return newLength;
    }
    public String[] findTeams(int length) {
        boolean odd=false;
        if (length%2==1) {
            length+=1;
            odd=true;
        }
        try {
            scan = new Scanner(new File("H:\\BlueJ Files\\10302018 - Soccer Scheduling\\input.txt")); //Use the address for your own file
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }
        String[] newTeam=new String[length];
        //Makes the team array
        for (int j=0; j<length; ++j) {
            if (scan.hasNextLine()==false && odd==true)
                newTeam[j]="Nobody";
            else
                newTeam[j]=scan.nextLine();
        }
        return newTeam;
    }
    public int gameAmt(int teams) {
        int games=0;;
        if (teams%2==0)
            games=teams/2;
        if (teams%2==1)
            games=(teams-1)/2;
        return games;
    }
    public int roundAmt(int teams) {
        int rounds=0;
        if (teams%2==0)
            rounds=teams-1;
        if (teams%2==1)
            rounds=teams;
        return rounds;
    }
    public String pull(String[] arr, int i) {
        return arr[i];
    }
    public String[] rotate(String[] str, SoccerScheduling obj) {
        String[] rotation=new String[str.length];
        rotation[0]=str[0];
        for (int i=1; i<str.length-1; ++i) {
            if (i==1)
                rotation[i]=obj.pull(str, str.length-1);
            else
                rotation[i]=obj.pull(str, i-1);
            if (i==1)
                rotation[i+1]=obj.pull(str, i);
            else
                rotation[i+1]=obj.pull(str, i);
        }
        return rotation;
    }
    public String[] printGames(String[] array) {
        String[] arr = new String[array.length/2];
        for(int i=0; i<arr.length; ++i) {
            arr[i]=array[i]+ " plays " + array[array.length-(i+1)];
        }
        return arr;
    }
    public static void main (String [] args) {
        SoccerScheduling x=new SoccerScheduling();
        int length=x.findLength();
        String[] team=x.findTeams(length);
        int games=x.gameAmt(length);
        int rounds=x.roundAmt(length);
        String[] rotationFirst=x.rotate(team, x);
        System.out.println(rounds + " rounds will be played.");
        System.out.println(games+" games will be played per round.");
        System.out.println("----------");
        String[] rotation=x.rotate(team, x);
        //Prints the array (Just to make sure that it worked)
        try {
            PrintWriter output = new PrintWriter("output.txt");
        }
        catch (IOException e) {
        }
        for (int i=0; i<rounds; ++i) {
            System.out.println("Round "+(i+1));
            rotation=x.rotate(rotation, x);
            String[] toPrint=x.printGames(rotation);
            for (int j=0; j<toPrint.length; ++j)
                if (toPrint[j].contains("Nobody")) {
                    //left blank
                }
                else
                    System.out.println(toPrint[j]);
            System.out.println("----------");
        } 
        System.out.println("End of schedule.");       
    } 
}
