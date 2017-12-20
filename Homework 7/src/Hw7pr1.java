/**
 * Created by JonathanWesterfield on 11/28/16.
 */
import java.text.DecimalFormat;
import java.util.*;

public class Hw7pr1
{
    public static void main(String[] args)
    {
        QueenManager manager = new QueenManager("Boss Mann", 10.50, 3);
        SandwichArtisan artisan1 = new SandwichArtisan("Steph Curry", 8.50, 27, 13);
        SandwichArtisan artisan2 = new SandwichArtisan("Jennifer Winters" , 7.25, 20, 18);
        SandwichArtisan artisan3 = new SandwichArtisan("Claire Frazier", 7.85, 25, 17);

        SandwichArtisan[] artisanArray = new SandwichArtisan[3];
        artisanArray[0] = artisan1;
        artisanArray[1] = artisan2;
        artisanArray[2] = artisan3;

        manager.calcPayBonus(artisanArray);

        DecimalFormat df = new DecimalFormat("##.00");
        System.out.println("Manager: " + manager.getName() + "\nManager Pay bonus: $" + df.format(manager.getPayBonus()));

        int maxNum = artisanArray[0].getNumCustServedPerHour();
        SandwichArtisan bestEmployee = artisanArray[0];
        for(int i = 0; i < artisanArray.length; i++)
        {
            if (artisanArray[i].getNumCustServedPerHour() > maxNum)
            {
                maxNum = artisanArray[i].getNumCustServedPerHour();
                bestEmployee = artisanArray[i];
            }
        }

        System.out.println(bestEmployee.getName() + " served the most customers!");
        System.out.println(bestEmployee.getName() + " is the Employee of the month!");
    }
}
