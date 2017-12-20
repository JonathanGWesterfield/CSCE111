/**
 * Created by JonathanWesterfield on 10/31/16.
 */
import java.io.*;
import java.util.*;
//import PowerBall;

public class Hw5pr2
{
    public static void main(String[] args)
    {
        int[] lotteryNum = new int[6];
        Scanner reader = new Scanner(System.in);
        int numMatches;
        System.out.println("Enter the 6 lottery numbers");
        for(int i = 0; i < 6; i++)
        {
            System.out.print((i + 1) + ": ");
            lotteryNum[i] = reader.nextInt();
        }
        /*for(int i = 0; i < 6; i++)
        {
            System.out.print(lotteryNum[i]);
        }*/
        System.out.println();
        PowerBall powerball = new PowerBall();

        numMatches = powerball.checkMatch(lotteryNum);

        switch (numMatches)
        {
            case 1:
                System.out.println("Your ticket matched 1 number!\nYou've won $4!");
                break;
            case 2:
                System.out.println("Your ticket matched 2 numbers!\nYou've won $7!");
                break;
            case 3:
                System.out.println("Your ticket matched 3 numbers!\nYou've won $100!");
                break;
            case 4:
                System.out.println("Your ticket matched 4 numbers!\nYou've won $10,000!!!");
                break;
            case 5:
                System.out.println("Your ticket matched 5 numbers!\nYOU'VE WON $1 MILLION!!!");
                break;
            case 6:
                System.out.println("Your ticket matched 6 numbers!\nYOU'VE WON THE GRAND PRIZE!!!");
                System.out.println("YOU WIN $450 MILLION!!!");
                break;
            default:
                System.out.println("No numbers match\nYou've won nothing");
        }
    }
}
