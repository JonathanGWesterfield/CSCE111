/**
 * Created by JonathanWesterfield on 11/28/16.
 */
public class QueenManager extends Employee
{
    private int numEmployeesManaged;
    private double payBonus;

    QueenManager() {} // default constructor

    QueenManager(String name, double payRate, int numEmployeesManaged)
    {
        super(name, payRate);
        this.numEmployeesManaged = numEmployeesManaged;
    }

    public void calcPayBonus(SandwichArtisan art[])
    {
        int totalCustServed = 0;
        for(int i = 0; i < art.length; i++)
        {
            totalCustServed += art[i].getNumCustServedPerHour();
        }
        payBonus = totalCustServed * 2;
    }

    public void setNumEmployeesManaged(int numEmployeesManaged)
    {
        this.numEmployeesManaged = numEmployeesManaged;
    }
    public int getNumEmployeesManaged()
    {
        return numEmployeesManaged;
    }
    public double getPayBonus()
    {
        return payBonus;
    }

}
