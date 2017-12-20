import java.util.Scanner;
import java.io.*;

public class FileWriteDemo {
    public static void main(String[] args)
    {
        String filename;
        String friendName;
        int numFriends;

        Scanner reader = new Scanner(System.in);
        System.out.print("How many friends do you have?");
        numFriends = reader.nextInt();

        System.out.println("Enter Filename");
        filename = reader.nextLine();

        PrintWriter outputFile = new PrintWriter(filename);

        for(int i = 1; i <= numFriends; i++)
        {
            System.out.println("Enter the name of friend number " + i + ": ");
            friendName = reader.nextLine();

            outputFile.println(friendName);
        }
    }
}
