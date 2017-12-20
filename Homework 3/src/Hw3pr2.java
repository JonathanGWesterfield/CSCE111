import java.util.Scanner;
public class Hw3pr2
{
    public static void main(String[] args)
    {
        float userNum = 1;
        float userSum = 0;
        float average;
        float count = 1;

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number:");
        userNum = reader.nextFloat();

        while(userNum != 0)
        {
            userSum = userSum + userNum;

            average = userSum / count;
            count++;
            System.out.println("The average so far is: " + average);

            System.out.print("Enter a number:");
            userNum = reader.nextFloat();
        }
    }
}
