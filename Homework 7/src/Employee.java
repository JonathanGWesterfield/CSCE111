/**
 * Created by JonathanWesterfield on 11/28/16.
 */
public class Employee
{
    private String name;
    private double payRate;

    Employee() {}

    Employee(String name, double payRate)
    {
        this.name = name;
        this.payRate = payRate;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPayRate(double payRate)
    {
        this.payRate = payRate;
    }
    public String getName()
    {
        return name;
    }
    public double getPayRate()
    {
        return payRate;
    }
}
