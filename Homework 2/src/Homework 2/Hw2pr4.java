/**
 * Created by JonathanWesterfield on 9/12/16.
 */

import java.util.Scanner;
public class Hw2pr4 {
    public static void main(String[] args)
    {
        //use .compareto()
        String name1;
        String name2;
        String name3;

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        name1 = reader.next();
        System.out.print("Enter the second name: ");
        name2 = reader.next();
        System.out.print("Enter the third name: ");
        name3 = reader.next();

        if(name1.compareTo(name2) < 0)
        {
            if (name1.compareTo(name3) < 0)
            {
                System.out.println(name1);

                if(name2.compareTo(name3) < 0)
                {
                    System.out.println(name2 + "\n" + name3);
                }
                else
                {
                    System.out.println(name3 + "\n" + name2);
                }
            }
            else
            {
                System.out.println(name3);

                if(name2.compareTo(name1) < 0)
                {
                    System.out.println(name2 + "\n" + name1);
                }
                else
                {
                    System.out.println(name1 + "\n" + name2);
                }
            }
        }
        else
        {
            if(name2.compareTo(name3) < 0)
            {
                System.out.println(name2);

                if(name1.compareTo(name3) < 0)
                {
                    System.out.println(name1 + "\n" + name3);
                }
                else
                {
                    System.out.println(name3 + "\n" + name1);
                }
            }
            else
            {
                System.out.println(name3 + "\n" + name2 + "\n" + name1);
            }
        }

    }
}
