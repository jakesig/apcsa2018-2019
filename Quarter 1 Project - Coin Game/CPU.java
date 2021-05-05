
/**
 * Write a description of class CPU here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CPU
{
    public boolean checkWin(int coins, boolean computerTurn) {
        if (coins==1 && computerTurn==true) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public int turn(int coins) {
        int computerChoice=0;
        if((coins+1)%3==0 ) {
                computerChoice=1;
            }
        else if((coins+1)%3==1|| coins==22) {
            computerChoice=2;
        }
        return computerChoice;
    }
}
