/**
 * Created by JonathanWesterfield on 11/5/16.
 */
import java.io.*;
import java.util.*;

public class Hw5pr3
{
    public static void main(String[] args) throws IOException
    {
        Scanner reader = new Scanner(new File("Football.txt"));
        Scanner keyboard =  new Scanner(System.in);
        String[] FirstDList = new String[200];
        String[][] footballArray = new String[200][2];
        String questionYear;
        int questionYearInt;

        int count = 0;
        while(reader.hasNext())
            FirstDList[count++] = reader.nextLine();

        for(int i = 0; i < count; i++)
        {
            String date = FirstDList[i].substring(0, 4);
            String team = FirstDList[i].substring(5);
            for(int j = 0; j < 2; j++)
            {
                if(j == 0)
                    footballArray[i][j] = date;
                else
                    footballArray[i][j] = team;
            }
        }

        for(int i  = 0; i < count; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(footballArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("What year are you looking for?: ");
        questionYear = keyboard.next();
        questionYearInt = Integer.parseInt(questionYear);

        if (questionYearInt < 1967 || questionYearInt > 2015)
        {
            System.out.println("That year is not on record");
            System.exit(0);
        }

        for(int i = 0; i < count; i++)
        {
            if(footballArray[i][0].equalsIgnoreCase(questionYear))
                System.out.println("The team that won that year was the " + footballArray[i][1] + ".");
        }
    }
}
