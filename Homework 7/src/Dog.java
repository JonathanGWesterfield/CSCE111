/**
 * Created by JonathanWesterfield on 11/28/16.
 */
public class Dog extends Pet
{
    private String breed;
    private double weight;

    Dog() {}
    Dog(String name, int age, String breed, double weight)
    {
        super(name, age);
        this.breed = breed;
        this.weight = weight;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    public String getBreed()
    {
        return breed;
    }
    public double getWeight()
    {
        return weight;
    }
    @Override
    public String toString()
    {
        String stream = "\nName: " + name + "\nAge: " + age;
        stream += "\nBreed: " + breed + "\nWeight: " + weight;
        return stream;
    }
}
