/**
 * Created by JonathanWesterfield on 11/28/16.
 */
public class SandwichArtisan extends Employee
{
    private int numSandPerHour;
    private int numCustServedPerHour;

    SandwichArtisan() {}

    SandwichArtisan(String name, double payRate, int numSandPerHour, int numCustServedPerHour)
    {
        super(name, payRate);
        this.numSandPerHour = numSandPerHour;
        this.numCustServedPerHour = numCustServedPerHour;
    }
    public void setNumSandPerHour(int numSandPerHour)
    {
        this.numSandPerHour = numSandPerHour;
    }
    public void setNumCustServedPerHour(int numCustServedPerHour)
    {
        this.numCustServedPerHour = numCustServedPerHour;
    }
    public int getNumSandPerHour()
    {
        return numSandPerHour;
    }
    public int getNumCustServedPerHour()
    {
        return numCustServedPerHour;
    }
}

