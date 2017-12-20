/**
 * Created by JonathanWesterfield on 11/28/16.
 */
import java.util.*;
public class Hw7pr2
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<Pet>();
        boolean lap = false;

        System.out.print("How many pets will you enter?: ");
        int numPets = reader.nextInt();

        for(int i = 1; i <= numPets; i++)
        {
            System.out.print("What kind of animal is it?: ");
            String animal = reader.next();

            // validates the user input
            while(!animal.equalsIgnoreCase("Fish") && !animal.equalsIgnoreCase("Dog") && !animal.equalsIgnoreCase("Cat"))
            {
                System.out.println("Incorrect Animal\nMust be either a: dog, cat, or fish\nTry again");
                System.out.print("What kind of animal is it?: ");
                animal = reader.next();
            }
            // puts in pet information based on the animal it is
            if(animal.equalsIgnoreCase("Dog"))
            {
                reader.nextLine();
                System.out.print("What is the dog's name?: ");
                String name = reader.nextLine();
                System.out.print("What is the dog's age?: ");
                int age = reader.nextInt();
                reader.nextLine();
                System.out.print("What is the dog's breed?: ");
                String breed = reader.nextLine();
                System.out.print("What is the dog's weight (lbs)?: ");
                double weight = reader.nextDouble();

                Dog dog = new Dog(name, age, breed, weight);
                pets.add(dog);
                System.out.println("Pet added to the list\n");
            }
            else if(animal.equalsIgnoreCase("Cat"))
            {
                reader.nextLine();
                System.out.print("What is the cat's name?: ");
                String name = reader.nextLine();
                System.out.print("What is the cat's age?: ");
                int age = reader.nextInt();
                reader.nextLine();
                System.out.print("Describe the cat's fur: ");
                String fur = reader.nextLine();
                System.out.print("Is the cat a lap cat? (yes or no): ");
                String lapCat = reader.next();
                // checks for VALID INPUT
                while(!lapCat.equalsIgnoreCase("yes") && !lapCat.equalsIgnoreCase("no"))
                {
                    System.out.println("Invalid Choice\nMust answer either 'yes' or 'no'\nTry Again");
                    System.out.print("Is the cat a lap cat? (yes or no): ");
                    lapCat = reader.next();
                }
                if(lapCat.equalsIgnoreCase("yes"))
                    lap = true;
                else
                    lap = false;

                Cat cat = new Cat(name, age, fur, lap);
                pets.add(cat);
                System.out.println("Pet added to the list\n");
            }
            else
            {
                reader.nextLine();
                System.out.print("What is the fish's name?: ");
                String name = reader.nextLine();
                System.out.print("What is the fish's age?: ");
                int age = reader.nextInt();
                reader.nextLine();
                System.out.print("What type of fish is it?: ");
                String fishType = reader.nextLine();
                System.out.print("What is the fish's scale color?: ");
                String scaleColor = reader.next();

                Fish fish = new Fish(name, age, fishType, scaleColor);
                pets.add(fish);
                System.out.println("Pet added to the list\n");
            }
        }

        //prints out the animals in order: fish, cat, dog
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < pets.size(); j++)
            {
                if(i == 0)
                {
                    if(pets.get(j) instanceof Fish)
                    {
                        System.out.println(pets.get(j).toString());
                    }
                }
                else if(i == 1)
                {
                    if(pets.get(j) instanceof Cat)
                    {
                        System.out.println(pets.get(j).toString());
                    }
                }
                else
                {
                    if(pets.get(j) instanceof Dog)
                    {
                        System.out.println(pets.get(j).toString());
                    }
                }
            }
        }
    }
}
