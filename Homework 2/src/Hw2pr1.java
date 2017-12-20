/**
 * Created by JonathanWesterfield on 9/12/16.
 */

import java.util.Scanner;

public class Hw2pr1 {
    public static void main(String[] args)
    {
        int x1;
        int x2;
        int differenceX1;
        int differenceX2;

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        x1 = reader.nextInt();
        x2 = reader.nextInt();

        differenceX1 = Math.abs(x1 - 50);
        differenceX2 = Math.abs(x2 - 50);

        if(x1 < 0 || x2 < 0)
            System.out.println("ERROR: ONE OR BOTH NUMBERS ENTERED IS NEGATIVE");
        else
        {
            if (differenceX1 > differenceX2)
                System.out.println("The number " + x2 + " is closer to 50");
            else if (differenceX1 < differenceX2)
                System.out.println("The number " + x1 + " is closer to 50");
            else
                System.out.println("Both numbers are the same distance from 50");
        }


    }
}
