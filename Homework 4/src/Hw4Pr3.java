import java.util.*;

/** Program plays a game of unwinnable rock paper scissors. If the user enters a choice,
 * the program either defeats the user or forces a tie.
 */
public class Hw4Pr3 {
    public static void main(String[] args) {
        String userChoice;
        String play;
        int choiceToNumber = 0;
        Scanner reader = new Scanner(System.in);

        System.out.print("Do you want to play a game of Rock, Paper, Scissors? (y or n): ");
        play = reader.next();

        if (play.equalsIgnoreCase("y") || play.equalsIgnoreCase("yes"))
        {
            do
            {
                System.out.print("Rock, Paper, or Scissors?: ");
                userChoice = reader.next();

                if (userChoice.equalsIgnoreCase("Rock"))
                    choiceToNumber = 1;
                else if (userChoice.equalsIgnoreCase("paper"))
                    choiceToNumber = 2;
                else if (userChoice.equalsIgnoreCase("scissors"))
                    choiceToNumber = 3;
                else
                {
                    System.out.println("That is not a valid choice!!!");
                    System.out.println();
                    continue;
                }

                int result = RockPaperScissors(choiceToNumber);
                if (result == choiceToNumber)
                    System.out.println("Its a tie!!!");
                else if (result == (choiceToNumber + 1))
                    System.out.println("YOU LOSE!!!");

                System.out.print("Do you want to play again? (y or n): ");
                play = reader.next();
                System.out.println();
            } while ((play.equalsIgnoreCase("y") || play.equalsIgnoreCase("yes")));
        }
        else
        {
            System.out.println("Exiting");
            System.exit(0);
        }

        System.out.println("Exiting");
        System.exit(0);
    }

    public static int RockPaperScissors(int choice) {
        if (choice == 1)
            choice += (int) (Math.random() * 2);
        else if (choice == 2)
            choice += (int) (Math.random() * 2);
        else if (choice == 3)
            choice += (int) (Math.random() * 2);
        switch(choice)
        {
            case 1:
                System.out.println("\nComputer chooses Rock");
                break;
            case 2:
                System.out.println("\nComputer chooses Paper");
                break;
            case 3:
                System.out.println("\nComputer chooses Scissors");
                break;
            case 4:
                System.out.println("\nComputer chooses Rock");
                break;
        }
        return choice;
    }
}
