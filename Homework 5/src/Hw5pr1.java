/**
 * Created by JonathanWesterfield on 10/31/16.
 */
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Hw5pr1
{
    public static void main(String[] args)
    {
        double min;
        double max;
        double sum = 0;
        double average;
        boolean trend = false; // if true, net gain, else net loss
        int numPrices;
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number of Stock Prices you want to enter: ");
        numPrices = reader.nextInt();

        double[] prices = new double[numPrices];

        for(int i = 0; i < numPrices; i++)
        {
            System.out.print("Enter price " + (i + 1) + ": ");
            prices[i] = reader.nextDouble();
        }

        min = prices[0];
        max = prices[0];

        for(int i = 0; i < numPrices; i++)
        {
            if(prices[i] < min)
                min = prices[i];
            if(prices[i] > max)
                max = prices[i];
            sum += prices[i];
        }
        average = sum / numPrices;

        DecimalFormat df = new DecimalFormat("###.00");

        System.out.println("The minimum price seen was: $" + df.format(min));
        System.out.println("The maximum price seen was: $" + df.format(max));
        System.out.println("The average price was: $" + df.format(average));


        if(prices[0] > prices[numPrices - 1])
            System.out.println("There is an overall loss");
        else if(prices[0] == prices[numPrices - 1])
            System.out.println("There is not trend of loss or gain");
        else
            System.out.println("There is an overall gain");


    }
}
