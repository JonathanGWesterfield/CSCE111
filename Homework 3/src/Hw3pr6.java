import java.util.Scanner;

public class Hw3pr6
{
    double userBet = 0;
    String word;
    String randToWord;
    int rand1;
    int count = 0;
    Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        Boolean playAgain = false;
        String decision;
        Hw3pr6 Hw = new Hw3pr6();

        Hw.input();

        while(!playAgain)
        {
            Hw.process();
            Hw.output();
            System.out.print("Do you want to play again? (y or n) ");
            decision = reader.next();
            if(decision.equalsIgnoreCase("n") || decision.equalsIgnoreCase("no"))
                playAgain = true;
        }
    }

    void input()
    {
        System.out.print("How much will you bet? ");
        userBet = reader.nextInt();
    }
    void process()
    {
        count = 0;
        String[] roll = new String[3];
        for(int i = 0; i < 3; i++)
        {
            rand1 = (int)(Math.random() * 5);

            switch(rand1)
            {
                case 0:
                    randToWord = "cherries";
                    break;
                case 1:
                    randToWord = "oranges";
                    break;
                case 2:
                    randToWord = "plums";
                    break;
                case 3:
                    randToWord = "bells";
                    break;
                case 4:
                    randToWord = "melons";
                    break;
                case 5:
                    randToWord = "bars";
                    break;
            }

            roll[i] = randToWord;
        }
        System.out.print("You got: ");
        for(int i = 0; i < 3; i++)
        {
            System.out.print(roll[i] + " ");
        }
        System.out.println();

        if(roll[0] == roll[1])
            count++;
        if(roll[1] == roll[2])
            count++;
        else if(roll[0] == roll[2])
            count++;


        if(count == 0)
            userBet /= 2;
        else if(count == 1)
            userBet *= 2;
        else if(count == 2)
            userBet *= 5;
    }

    void output()
    {
        if(count == 0)
        {
            System.out.println("You matched 0 words!");
        }
        else
        {
            System.out.println("You matched " + (count + 1) + " words!");
        }

        System.out.println("Your wager amount is: $" + userBet);
        System.out.println();

        if(userBet < 1)
        {
            System.out.println("You have less than a dollar.\nExiting");
            System.exit(0);
        }

    }
}
