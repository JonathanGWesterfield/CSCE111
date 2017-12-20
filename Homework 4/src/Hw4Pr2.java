import java.util.Scanner;

public class Hw4Pr2
{
    public static void main(String[] args)
    {
        double fish1Length;
        double fish1Freq;
        double fish2Length;
        double fish2Freq;
        double fish3Length;
        double fish3Freq;
        int timeSec;
        double FishDistance1;
        double FishDistance2;
        double FishDistance3;
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter length of fish1: ");
        fish1Length = reader.nextDouble();
        System.out.print("Enter tail beat frequency of fish1: ");
        fish1Freq = reader.nextDouble();

        System.out.print("Enter length of fish2: ");
        fish2Length = reader.nextDouble();
        System.out.print("Enter tail beat frequency of fish2: ");
        fish2Freq = reader.nextDouble();

        System.out.print("Enter length of fish3: ");
        fish3Length = reader.nextDouble();
        System.out.print("Enter tail beat frequency of fish3: ");
        fish3Freq = reader.nextDouble();
        System.out.println();

        for(int i = 1; i <= 20; i++)
        {
            System.out.print("After " + i + " seconds, ");
            System.out.printf("fish1 swam %.2f cm, ", fishDistance(fish1Length, fish1Freq, i));
            System.out.printf("fish2 swam %.2f cm, ", fishDistance(fish2Length, fish2Freq, i));
            System.out.printf("fish3 swam %.2f cm\n", fishDistance(fish3Length, fish3Freq, i));
        }
    }

    public static double fishDistance(double L, double f, double s)
    {
        return (s / 4) * (L * (3 * f - 4));
    }
}
