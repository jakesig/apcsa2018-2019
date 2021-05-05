import java.util.Scanner;
public class Problem8
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = kb.nextInt();
        System.out.print("Enter the second number: ");
        double num2 = kb.nextInt();
        double average = (num1+num2)/2;
        System.out.print("Average of "+num1+" and "+num2+" is: "+average);
        
    }
}
