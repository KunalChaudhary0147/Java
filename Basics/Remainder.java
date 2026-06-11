import java.util.Scanner;
public class Remainder {
    public static void main ()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the first number : ");
        double a=input.nextInt();
        System.out.print("Enter the second number: ");
        double b=input.nextInt();
        System.out.println("Remainder of "+a+" when divided by "+b+" is : "+(a%b));
        input.close();
    }
}
