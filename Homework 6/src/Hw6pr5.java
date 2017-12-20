/**
 * Created by JonathanWesterfield on 11/19/16.
 */
import java.util.*;

public class Hw6pr5
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int found = 0;

        System.out.println("Enter 2 words separated by a space: ");
        String phrase1 = reader.next();
        String phrase2 = reader.next();

        phrase1 = phrase1.toLowerCase();
        phrase2 = phrase2.toLowerCase();

        for(int i = 0; i < phrase2.length(); i++)
        {
            found = phrase1.indexOf(phrase2.charAt(i));
            if(found == -1)
                System.out.println("The extra letter is " + phrase2.charAt(i));
            else
                System.out.println("There are no extra letters");
        }
    }
}
