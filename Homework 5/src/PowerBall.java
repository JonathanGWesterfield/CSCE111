/**
 * Created by JonathanWesterfield on 10/31/16.
 */
import java.util.*;
import java.io.*;

public class PowerBall
{
    private int[] winningNum = new int[6];

    PowerBall()
    {
        for(int i = 0; i < winningNum.length; i++)
        {
            int rand = (int)(Math.random() * 10);
            winningNum[i] = rand;
        }
    }

    int checkMatch(int[] lotteryNum)
    {
        int count = 0;
        for(int i = 0; i < winningNum.length; i++)
        {
            if(winningNum[i] == lotteryNum[i])
                count++;
        }
        return count;
    }

}
