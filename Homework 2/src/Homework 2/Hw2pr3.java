/**
 * Created by JonathanWesterfield on 9/12/16.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Hw2pr3
{
    public static void main(String[] args)
    {
        double mercuryYear = 88.0;
        double venusYear = 224.7;
        double marsYear = 687.0;
        double jupiterYear = 4332;
        double neptuneYear = 60200;
        double earthAge;
        double planetAge;
        String userPlanet;

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your age: ");
        earthAge = reader.nextDouble();

        if(earthAge > 0)
        {
            System.out.print("Mercury\nVenus\nMars\nJupiter\nNeptune\nEnter one of the Planets listed: ");
            userPlanet = reader.next();
            System.out.println();

            earthAge = earthAge * 365.25;
            DecimalFormat df = new DecimalFormat("##.0");

            if(userPlanet.equals("Mercury"))
            {
                planetAge = earthAge / mercuryYear;
                System.out.println("Your age on " + userPlanet + " is " + df.format(planetAge) + " years old!");
            }
            else if(userPlanet.equals("Venus"))
            {
                planetAge = earthAge / venusYear;
                System.out.println("Your age on " + userPlanet + " is " + df.format(planetAge) + " years old!");
            }
            else if(userPlanet.equals("Mars"))
            {
                planetAge = earthAge / marsYear;
                System.out.println("Your age on " + userPlanet + " is " + df.format(planetAge) + " years old!");
            }
            else if(userPlanet.equals("Jupiter"))
            {
                planetAge = earthAge / jupiterYear;
                System.out.println("Your age on " + userPlanet + " is " + df.format(planetAge) + " years old!");
            }
            else if(userPlanet.equals("Neptune"))
            {
                planetAge = earthAge / neptuneYear;
                System.out.println("Your age on " + userPlanet + " is " + df.format(planetAge) + " years old!");
            }
            else
                System.out.println("Planet does not match choices listed");
        }
        else
            System.out.println("Your age cannot be negative.");

    }
}
