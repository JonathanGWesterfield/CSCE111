/**
 * Created by JonathanWesterfield on 9/12/16.
 */

import java.util.Scanner;

public class Hw2pr2
{
    public static void main(String[] args)
    {
        int determineTeen;
        int userNumber;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        userNumber = reader.nextInt();

        determineTeen = userNumber % 100;

        if(determineTeen > 12 && determineTeen < 20)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
