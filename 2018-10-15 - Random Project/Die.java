public class Die
{
    public static int dieRoll() {
        int answer=(int)(6*Math.random())+1;
        return answer;
    }
    public static void main (String [] args) {
        for(int i=0; i<100;++i)
        System.out.println(dieRoll());
    }
}
