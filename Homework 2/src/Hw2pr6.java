/**
 * Created by JonathanWesterfield on 9/14/16.
 */

import java.util.Scanner;

public class Hw2pr6 {
    public static void main(String[] args)
    {
        String vampireBloodType;
        String personBloodType;
        Scanner reader = new Scanner(System.in);
        boolean safe = false;

        System.out.print("What is the vampires bloodtype? ");
        vampireBloodType = reader.next();
        vampireBloodType= vampireBloodType.toUpperCase(); // Turns all input to uppercase
        System.out.print("What is the person's bloodtype? ");
        personBloodType = reader.next();
        personBloodType = personBloodType.toUpperCase(); // Turns all input to uppercase

        System.out.println(vampireBloodType);
        System.out.println(personBloodType);

        if(vampireBloodType.contains(personBloodType))
            safe = true;

        else if(vampireBloodType.contains("AB+"))
        {
            if(personBloodType.contains("A") && personBloodType.contains("+"))
                safe = true;
        }
        else if(vampireBloodType.contains("AB-"))
        {
            if(personBloodType.contains("A") && personBloodType.contains("-"))
                safe = true;
        }

        if(vampireBloodType.contains("-"))
        {
            if(personBloodType.contains("O-"))
                safe = true;
        }
        else if(vampireBloodType.contains("+"))
        {
            if(personBloodType.contains("O+"))
                safe = true;
        }

        if(safe == true)
            System.out.println("Safe to consume!");
        else
            System.out.println("Not safe to consume!");
    }
}
