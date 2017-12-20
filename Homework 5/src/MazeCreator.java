import java.util.Random;

public class MazeCreator {
    private static Random r = new Random();

    public MazeCreator() {
    }

    public static int[][] generateMaze(int var0)
    {
        int[][] var1 = new int[var0][var0];

        for(int var2 = 0; var2 < var0; ++var2)
        {
            for(int var3 = 0; var3 < var0; ++var3)
            {
                var1[var2][var3] = 1;
            }
        }

        var1[var0 / 2][0] = 0;
        nextpath(var1, var0, var0 / 2, 0);
        return var1;
    }

    public static void nextpath(int[][] var0, int var1, int var2, int var3)
    {
        if(var3 < var1 - 1)
        {
            boolean var8 = false;
            boolean var9 = false;
            double var4 = r.nextDouble();
            double var6 = 0.6D;
            if(var3 + 1 < var1 && var0[var2][var3 + 1] != 0 && var4 < var6)
            {
                var0[var2][var3 + 1] = 0;
                nextpath(var0, var1, var2, var3 + 1);
                var8 = true;
            }

            var4 = r.nextDouble();
            if(var2 - 1 >= 0 && var0[var2 - 1][var3] != 0)
            {
                if(var8)
                {
                    var6 = 0.3D;
                }
                else
                {
                    var6 = 0.5D;
                }

                if(var4 < var6)
                {
                    var0[var2 - 1][var3] = 0;
                    nextpath(var0, var1, var2 - 1, var3);
                    var9 = true;
                }
            }

            var4 = r.nextDouble();
            if(var2 + 1 < var1 && var0[var2 + 1][var3] != 0)
            {
                if(!var8 && !var9)
                {
                    var6 = 1.0D;
                }
                else
                {
                    var6 = 0.3D;
                }

                if(var4 < var6)
                {
                    var0[var2 + 1][var3] = 0;
                    nextpath(var0, var1, var2 + 1, var3);
                }
            }

        }
    }

    public static void printMaze(int[][] var0, int var1)
    {
        System.out.println("Maze (size = " + var1 + ", start = (" + var1 / 2 + ", 0), 1 = wall, 0 = open path): ");

        for(int var2 = 0; var2 < var1; ++var2)
        {
            if(var2 == var1 / 2) {
                System.out.print("START --> ");
            } else {
                System.out.print("          ");
            }

            for(int var3 = 0; var3 < var1; ++var3)
            {
                System.out.print(var0[var2][var3]);
            }

            System.out.println(" --> EXIT");
        }

    }
}
