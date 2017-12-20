/**
 * Created by JonathanWesterfield on 11/15/16.
 */

import java.util.*;

public class Fraction
{
    private int numerator;
    private int denominator;
    private int numer;
    private int denom;
    private int tempNumer1;
    private int tempNumer2;
    private int tempDenom1;
    private int tempDenom2;

    Fraction(int numer1, int denom1, int numer2, int denom2)
    {
        numerator = numer1;
        tempNumer1 = numer1;
        denominator = denom1;
        tempDenom1 = denom1;
        numer = numer2;
        tempNumer2 = numer2;
        denom = denom2;
        tempDenom2 = denom2;
    }

    @ Override
    public String toString()
    {
        String goingReturn = "Fractions are: " + tempNumer1  + "/" + tempDenom1 + " and ";
        goingReturn += tempNumer2  + "/" + tempDenom2;
        goingReturn += "\nThe two fractions";
        if(Equals())
            goingReturn += " are equal.\n";
        else
            goingReturn += " are NOT equal.\n";
        add();
        if(numerator == denominator)
            goingReturn += "The sum of the fractions is 1.\n";
        else
            goingReturn += "The sum of the fractions is " + numerator + "/" + denominator + ". \n";


        return goingReturn;
    }

    public boolean Equals()
    {
        // reduces the first fraction
        for(int j = 0; j < 10; j++)
        {
            for(int i = 1; i < 10; i++)
            {
                if((numerator % i == 0 ) && (denominator % i == 0))
                {
                    numerator /= i;
                    denominator /= i;
                }
            }
        }
        // reduces the second fraction
        for(int j = 0; j < 10; j++)
        {
            for (int i = 1; i < 10; i++)
            {
                if ((numer % i == 0) && (denom % i == 0))
                {
                    numer /= i;
                    denom /= i;
                }
            }
        }

        boolean isequals = false;
        if((numerator == numer) && (denominator == denom))
            isequals = true;
        return isequals;
    }

    public void add() // int numer, int denom)
    {
        if(denominator == denom)
            numerator += numer;
        else
        {
            // converts to appropriate denominators so they can be added
            numerator *= denom;
            numer *= denominator;
            denominator *= denom;

            // the new numerator
            numerator += numer;

            for(int j = 0; j < 10; j++)
            {
                for(int i = 1; i < 10; i++)
                {
                    if((numerator % i == 0 ) && (denominator % i == 0))
                    {
                        numerator /= i;
                        denominator /= i;
                    }
                }
            }
        }
    }
}

