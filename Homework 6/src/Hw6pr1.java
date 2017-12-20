/**
 * Created by JonathanWesterfield on 11/19/16.
 */
import java.util.*;

public class Hw6pr1
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the Shape: ");
        String shape = reader.next();
        if(shape.equalsIgnoreCase("circle"))
        {
            System.out.print("Enter radius: ");
            double radius = reader.nextDouble();
            System.out.println("The area of the circle is " + calculateArea(radius));
        }
        else if(shape.equalsIgnoreCase("rectangle"))
        {
            System.out.print("Enter length: ");
            double length = reader.nextDouble();
            System.out.print("Enter width: ");
            double width = reader.nextDouble();
            System.out.println("The area of the rectangle is " + calculateArea(length, width));
        }
        else if(shape.equalsIgnoreCase("trapezoid"))
        {
            System.out.print("Enter height: ");
            double height = reader.nextDouble();
            System.out.print("Enter base 1: ");
            double base1 = reader.nextDouble();
            System.out.print("Enter base 2: ");
            double base2 = reader.nextDouble();
            System.out.println("The area of the rectangle is " + calculateArea(height, base1, base2));
        }
        else
            System.out.println("That is not a recognized shape");

    }

    public static double calculateArea(double radius)
    {
        final double pi = 3.141592653589793238462643383279502;
        return pi * Math.pow(radius, 2);
    }

    public static double calculateArea(double length, double width)
    {
        return length * width;
    }

    public static double calculateArea(double height, double base1, double base2)
    {
        return (height * (base1 + base2)/2);
    }
}
