import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args)
    {
        // double r=5;
        // System.out.println("Area of circle is : "+(3.1415*r*r));


        // Using input

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the radius of circle : ");
        double r=input.nextDouble();
        System.out.println("Area of circle is : "+(3.1415*r*r));
        input.close();
    }
}
