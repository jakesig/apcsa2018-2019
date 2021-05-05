import java.util.Scanner;
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class User
{
    public boolean begin() {
        System.out.println("1: User goes first");
        System.out.println("2: CPU goes first");
        System.out.println("----------------");
        System.out.print("Would you like to go first? ");
        Scanner scan=new Scanner(System.in);
        int response=scan.nextInt();
        if (response==1) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean checkWin(int coins, boolean userTurn) {
        if (coins==1 && userTurn==true) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public int turn() {
        int userChoice=0;
        System.out.print("How many coins would you like to take? ");
        Scanner a=new Scanner(System.in);
        userChoice=a.nextInt();
        System.out.print("\f");
        return userChoice;
    }
}
