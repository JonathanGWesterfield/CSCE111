import java.util.Scanner;

public class Hw4Pr1
{
    public static void main(String[] args)
    {
        double triangleSide;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter length of one side of the triangle: ");
        triangleSide = reader.nextDouble();

        equilateralArea(triangleSide);
    }

    public static void equilateralArea(double triangleSide)
    {
        double bigArea = Math.pow(triangleSide, 2) * (Math.sqrt(3)/4);
        double smallArea = Math.pow((triangleSide / 2), 2) * (Math.sqrt(3)/4);
        double triforceArea = bigArea - smallArea;
        System.out.printf("The area of the triforce is %.2f", triforceArea);
    }
}
