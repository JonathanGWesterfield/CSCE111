import java.text.DecimalFormat;
import java.util.*;

/**
 * Utilizes the Coin.java class to play a game in which the user tosses 3 coins
 * If after tossing a bunch of times and the value of the coins is a dollar, the user wins
 * Heads equals add the value of the coin, else add nothing
 */
public class Hw4Pr5
{
    public static void main(String[] args)
    {
        String play;
        Scanner reader = new Scanner(System.in);
        Coin quarter = new Coin(.25);
        Coin dime = new Coin(.1);
        Coin penny = new Coin(.01);
        double total;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Would you like to play? (y or n): ");
        play = reader.next();
        if(play.equalsIgnoreCase("y") || play.equalsIgnoreCase("yes"))
        {
            do {
                total = 0.0;
                while (total < 1)
                {
                    quarter.toss();
                    dime.toss();
                    penny.toss();
                    if (quarter.getFace() == "Heads")
                        total += quarter.getValue();
                    if (dime.getFace() == "Heads")
                        total += dime.getValue();
                    if (penny.getFace() == "Heads")
                        total += penny.getValue();

                    System.out.println("Coin 1: " + quarter.getFace());
                    System.out.println("Coin 2: " + dime.getFace());
                    System.out.println("Coin 3: " + penny.getFace());
                    System.out.println("The total is : $" + df.format(total));
                    System.out.println();
                }
                if (total == 1)
                    System.out.println("You got $1!\nYOU WIN!!!\n");
                else
                    System.out.println("Total is greater than $1.\nBUST\n");


                System.out.print("Would you like to play? (y or n): ");
                play = reader.next();
            } while (play.equalsIgnoreCase("y") || play.equalsIgnoreCase("yes"));

            System.out.println("\nExiting");
            System.exit(0);
        }
        else
        {
            System.out.println("\nExiting");
            System.exit(0);
        }
    }

}


