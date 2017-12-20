/**
 * Created by JonathanWesterfield on 9/13/16.
 */

import java.util.Scanner;

public class Hw2pr5
{
    public static void main(String[] args)
    {
        int speedLimit;
        int userSpeed;
        int milesOver;
        int rate1 = 7;
        int rate2 = 3;
        int rate3 = 1;
        int option1;
        int option2;
        int option3;

        Scanner reader = new Scanner(System.in);

        System.out.print("Input the offenders speed : ");
        userSpeed = reader.nextInt();
        System.out.print("Input the speed limit : ");
        speedLimit = reader.nextInt();

        milesOver = userSpeed - speedLimit;

        if(userSpeed > speedLimit)
        {
            option1 = 50 + (milesOver) * rate1;
            option2 = 70 + (milesOver) * rate2;
            option3 = 100 + (milesOver) * rate3;

            if (option1 <= option2 && option1 <= option3) {
                System.out.println("With option 1 you'd pay : $" + option1);
            } else if (option2 <= option1 && option2 <= option3) {
                System.out.println("With option 2 you'd pay : $" + option2);
            } else if (option3 <= option1 && option3 <= option2) {
                System.out.println("With option 3 you'd pay : $" + option3);
            }
        }
        else
        {
            System.out.println("User was not violating the speed limit");
        }
    }
}
