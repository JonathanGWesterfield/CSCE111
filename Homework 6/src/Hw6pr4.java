/**
 * Created by JonathanWesterfield on 11/16/16.
 */
import java.util.*;
import java.io.*;

public class Hw6pr4
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter a string: ");
        String input = reader.nextLine();

        for(int i = 0; i < input.length(); i++)
        {
            if(isDigit(input.charAt(i)))
            {
                sum += Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        System.out.println("The sum is: " + sum);
    }

    public static boolean isDigit(char character)
    {
        boolean isADigit = false;
        switch(character)
        {
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                isADigit = true;
                break;
            default:
                break;
        }
        return isADigit;
    }
}
