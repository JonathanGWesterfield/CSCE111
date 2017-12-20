import java.util.Random;

/**
 * Created by JonathanWesterfield on 10/15/16.
 */
public class Coin
{
    private double value;
    private boolean face;

    public Coin(double coinValue)
    {
        value = coinValue;
        toss();
    }

    public void toss()
    {
        Random rand = new Random();
        face = rand.nextBoolean();
    }

    public double getValue()
    {
        return value;
    }

    public String getFace()
    {
        if(face == true)
            return "Heads";
        else
            return "Tails";
    }
}
