import java.util.Scanner;

public class Hw3pr5
{
    public static void main(String[] args)
    {
        int numRows;
        String character;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the size of the pyramid: ");
        numRows = reader.nextInt();
        System.out.print("Enter the character to use: ");
        character = reader.next();

        for(int i = 0; i <= numRows; i++)
        {
            for(int j = i; j < numRows; j++)
            {
                System.out.print(" ");
            }
            for(int k = 0; k < (2 * i) - 1; k++)
            {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
