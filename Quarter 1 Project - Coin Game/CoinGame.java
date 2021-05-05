public class CoinGame
{
    public static void main (String [] args) {
        int amount=0;
        int coins=23;
        String toPrint="";
        boolean win=false;
        boolean computerTurn=false;
        boolean userTurn=false;
        User u = new User();
        CPU c=new CPU();
        GameBoard gb=new GameBoard();
        System.out.print("\f");
        if(u.begin()==false) {
            computerTurn=true;
            coins-=c.turn(coins);
            computerTurn=false;
        }
        else {
        }
        while (win==false) {
            userTurn=true;
            computerTurn=false;
            gb.setCoins(coins);
            System.out.println(gb);
            if (u.checkWin(coins,userTurn)==true) {
                System.out.println("CPU Wins!");
                break;
            }
            coins-=u.turn();
            gb.setCoins(coins);
            System.out.println(gb);
            if (c.checkWin(coins,computerTurn)==true) {
                System.out.println("User Wins!");
                break;
            }
            userTurn=false;
            computerTurn=true;
            amount=c.turn(coins);    
            coins-=amount;
            System.out.print("\f");
            System.out.println("Computer takes "+amount);
        }
    }
}
