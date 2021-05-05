public class GameBoard
{
    public int coins=23;
    public String toString() {
        String board="";
        for(int i=0;i<coins;++i) {
            board+="O   ";
            if((i+1)%3==0) {
                board+="\n";
            }
        }
        return board;
    }
    
    public void setCoins(int coin) {
        coins=coin;
    }
}
