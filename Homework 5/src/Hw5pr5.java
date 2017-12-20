/**
 * Created by JonathanWesterfield on 11/7/16.
 */

import java.util.*;
import java.io.*;

public class Hw5pr5
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner (System.in);
        MazeCreator mazeCreator = new MazeCreator();
        ArrayList<String> moves = new ArrayList<String>();
        boolean failed = false;

        System.out.println("If program does not perform successfully, run it again\n" +
                "you probably just got it on one of the very few times it fails");
        System.out.print("\nEnter maze size: ");
        int mazeSize = reader.nextInt();

        int[][] maze = mazeCreator.generateMaze(mazeSize);

        mazeCreator.printMaze(maze, mazeSize);

        try
        {
            navigateMaze(maze, moves, mazeCreator, mazeSize);
        }

        catch(Exception e)
        {
            System.out.println("There is no solution");
            mazeCreator.printMaze(maze, mazeSize);
            System.exit(0);
        }


        for(int k = 0; k < moves.size(); k++)
        {
            System.out.println(moves.get(k));
        }

        if(failed)
            System.out.println("There is no solution");
        else
            System.out.println("Exit found successfully!");

        mazeCreator.printMaze(maze, mazeSize);



        System.exit(0);
    }

    public static boolean navigateMaze(int[][] maze, ArrayList<String> moves, MazeCreator mazeCreator, int mazeSize)
    {
        int savePointi = 0;
        int savePointj = 0;
        boolean getOut = false;
        int countFailed = 0;
        int i = mazeSize / 2;
        int j = 0;
        boolean failed = false;

        do
        {
            // go straight
            if(maze[i][j + 1] == 0)
            {
                /*if((maze[i - 1][j] == 0) || maze[i + 1][j] == 0)
                {
                    savePointi = i;
                    savePointj = j;
                }*/

                maze[i][j] = 9;
                moves.add("RIGHT " + (i + 1) + ", " + (j + 1));
                j += 1;
                // mazeCreator.printMaze(maze, mazeSize);
                if(j == (maze.length - 1))
                {
                    maze[i][j] = 9;
                    getOut = true;
                }
            }
            // go up
            else if(maze[i - 1][j] == 0)
            {
                if(maze[i + 1][j] == 0)
                {
                    savePointi = i;
                    savePointj = j;
                }
                maze[i][j] = 9;
                moves.add("UP " + (i + 1) + ", " + (j + 1));
                if((i -= 1) < 0)
                {
                    i = savePointi;
                    j = savePointj;
                }

                // mazeCreator.printMaze(maze, mazeSize);
                if(j == (maze.length - 1))
                {
                    maze[i][j] = 9;
                    getOut = true;
                }
            }
            // go down
            else if(maze[i + 1][j] == 0)
            {
                maze[i][j] = 9;
                moves.add("DOWN " + (i + 1) + ", " + (j + 1));
                if(maze[i - 1][j] == 0)
                {
                    savePointi = i;
                    savePointj = j;
                }

                if((i += 1) == mazeSize)
                {
                    i = savePointi;
                    j = savePointj;
                }

                // mazeCreator.printMaze(maze, mazeSize);
                if(j == (maze.length - 1))
                {
                    maze[i][j] = 9;
                    getOut = true;
                }
            }
            else
            {
                i = savePointi;
                j = savePointj;
                moves.add("BACK TO " + (savePointi + 1) + ", " + (savePointj + 1));

                // go down
                if(maze[i + 1][j] == 0)
                {
                    maze[i][j] = 9;
                    moves.add("DOWN " + (i + 1) + ", " + (j + 1));
                    if(maze[i - 1][j] == 0)
                    {
                        savePointi = i;
                        savePointj = j;
                    }

                    if((i += 1) == mazeSize)
                    {
                        i = savePointi;
                        j = savePointj;
                    }

                    // mazeCreator.printMaze(maze, mazeSize);
                    if(j == (maze.length - 1))
                    {
                        maze[i][j] = 9;
                        getOut = true;
                    }
                }
                // go up
                else if(maze[i - 1][j] == 0)
                {
                    if(maze[i + 1][j] == 0)
                    {
                        savePointi = i;
                        savePointj = j;
                    }
                    maze[i][j] = 9;
                    moves.add("UP " + (i + 1) + ", " + (j + 1));
                    if((i -= 1) < 0)
                    {
                        i = savePointi;
                        j = savePointj;
                    }

                    // mazeCreator.printMaze(maze, mazeSize);
                    if(j == (maze.length - 1))
                    {
                        maze[i][j] = 9;
                        getOut = true;
                    }
                }
                else
                {
                    i = savePointi;
                    j = savePointj;
                    countFailed++;
                }
            }

            if(countFailed >= 30)
            {
                failed = true;
                break;
            }


        } while(!getOut);

        return failed;
    }
}
