/**
 * Created by JonathanWesterfield on 11/15/16.
 */
import java.util.Scanner;

public class Hw6pr2
{
    public static void main(String[] args)
    {
        boolean valid = false;
        int numer1, denom1, numer2, denom2;
        Scanner reader = new Scanner(System.in);
        System.out.print("Input first numerator: ");
        numer1 = reader.nextInt();
        System.out.print("Input first denominator: ");
        denom1 = reader.nextInt();
        System.out.print("Input second numerator: ");
        numer2 = reader.nextInt();
        System.out.print("Input second denominator: ");
        denom2 = reader.nextInt();
        System.out.println();

        while(!valid)
        {
            if((denom1 == 0) || (denom2 == 0))
                System.out.println("Denominators cannot be zero\nTry again\n");
            else
            {
                valid = true;
                break;
            }
            System.out.print("Input first numerator: ");
            numer1 = reader.nextInt();
            System.out.print("Input first denominator: ");
            denom1 = reader.nextInt();
            System.out.print("Input second numerator: ");
            numer2 = reader.nextInt();
            System.out.print("Input second denominator: ");
            denom2 = reader.nextInt();
        }

        System.out.println();
        Fraction fraction = new Fraction(numer1, denom1, numer2, denom2);
        //fraction.Equals();
        //fraction.add();
        System.out.println(fraction);
    }
}
