import java.util.Scanner;
import java.io.*;

public class Hw3pr3
{
    public static void main(String[] args) throws IOException
    {
        String filename;
        String word;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        filename = keyboard.next();
        System.out.print("Enter a word: ");
        word = keyboard.next();
        //file has the word 11 times
        int count = 0;
        Scanner inputFile = new Scanner(new File(filename));
        while(inputFile.hasNext())
        {
            String matchWord = inputFile.next();
            if(word.equalsIgnoreCase(matchWord))
            {
                count++;
            }
        }

        System.out.println("The word \"" + word + "\" occurs " + count + " times in the file.");

    }
}
