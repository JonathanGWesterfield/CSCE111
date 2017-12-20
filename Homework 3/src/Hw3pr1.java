import java.util.Scanner;

public class Hw3pr1 {
    public static void main(String[] args)
    {
        int n;
        int sum = 0;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = reader.nextInt();

        for(int i = 0; i <= n; i++)
        {
            if(i % 3 == 0)
                sum += i;
        }

        System.out.println("The sum is " + sum);

    }
}
