import java.util.Scanner;
import java.util.Random;

public class Hw3pr4
{
    public static void main(String[] args)
    {
        int moveCountHare = 0;
        int moveCountTortoise = 0;
        int moveCountSheep = 0;
        int moveCountWolf = 0;

        for(int i = 0; i < 10; i++)
        {
            moveCountHare += Haremove(i);
            moveCountTortoise += tortoiseMove();
            moveCountSheep += sheepMove(i);
            moveCountWolf += wolfMove(i);
        }

        System.out.print("The Hare: Moves randomly 13 - 17 miles per timestep, but see itself in the ");
        System.out.println("lead and falls asleep on timesteps 2 - 9 and does not move.");
        System.out.print("The Tortoise:Moves randomly 1 - 2 miles per timestep, but ");
        System.out.println("gets to move twice per step due to its determination.");
        System.out.print("The sheep: Moves randomly 6 - 10 miles on even timesteps, but gets ");
        System.out.println("lost and moves -2 miles backwards on odd timesteps.");
        System.out.print("The wolf: Moves randomly 4 - 5 miles per timestep, but stops ");
        System.out.println("to huff and puff on steps 3, 6 and 9.\n");
        System.out.println("The Hare ran " + moveCountHare + " miles.");
        System.out.println("The Tortoise ran " + moveCountTortoise + " miles.");
        System.out.println("The Sheep ran " + moveCountSheep + " miles.");
        System.out.println("The wolf ran " + moveCountWolf + " miles.\n");

        int[] raceMoves = new int[]{moveCountHare, moveCountTortoise, moveCountSheep, moveCountWolf};

        int max = moveCountHare;
        for(int i = 0; i < raceMoves.length; i++)
        {
            if(raceMoves[i] > max)
            {
                max = raceMoves[i];
            }
        }

        if(max == moveCountHare)
            System.out.println("The winner is the Hare!!!");
        else if(max == moveCountTortoise)
            System.out.println("The winner is the Tortoise!!!");
        else if(max == moveCountSheep)
            System.out.println("The winner is the Sheep!!!");
        else
            System.out.println("The winner is the Wolf!!!");
    }

    public static int Haremove(int moveNow)
    {
        int hareMove = 0;
        if(moveNow < 2 || moveNow > 9)
            hareMove = (int) (Math.random() * 5) + 13;
        return hareMove;
    }

    public static int tortoiseMove()
    {
        int moveCountTortoise = 2 * ((int)(Math.random() * 2) + 1);
        return moveCountTortoise;
    }

    public static int sheepMove(int timeStep)
    {
        int moveCountSheep = 0;
        if(timeStep % 2 == 0)
            moveCountSheep = (int)(Math.random() * 5) + 6;
        else
            moveCountSheep = -2;

        return moveCountSheep;
    }

    public static int wolfMove(int timeStep)
    {
        int moveCountWolf = 0;
        if(timeStep == 3 || timeStep == 6 || timeStep == 9)
            moveCountWolf = 0;
        else
            moveCountWolf = (int)(Math.random() * 2) + 4;
        return moveCountWolf;
    }
}
