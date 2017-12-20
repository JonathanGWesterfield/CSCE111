/**
 * Created by JonathanWesterfield on 11/16/16.
 */
import java.io.*;
import java.util.*;

public class Hw6pr6
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = reader.nextLine();
        phrase = phrase.toLowerCase();
        String altPhrase = "";

        for(int i = 0; i < phrase.length(); i++)
        {
            if(isalnum(phrase.charAt(i)) == true)
            {
                altPhrase += phrase.charAt(i);
            }
            else
                continue;
        }

        char[] charAltPhrase = altPhrase.toCharArray();
        System.out.println();

        if(isPalindrome(charAltPhrase))
            System.out.println("The phrase is a palindrome");
        else
            System.out.println("The phrase is not a palindrome");
    }
    public static boolean isPalindrome(char[] phrase)
    {
        boolean isPal = false;
        for(int i = 0; i < phrase.length; i++)
        {
            if(phrase[i] == phrase[(phrase.length - 1 - i)])
            {
                isPal = true;
            }
        }
        return isPal;
    }

    public static boolean isalnum(char character)
    {
        boolean isAlNum = false;
        switch(character)
        {
            case '!':
            case ',':
            case '.':
            case ';':
            case ' ':
            case '/':
            case '?':
                break;
            default:
                isAlNum = true;
                break;
        }
        return isAlNum;
    }
}
