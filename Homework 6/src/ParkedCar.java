/**
 * Created by JonathanWesterfield on 11/19/16.
 */
public class ParkedCar
{
    private String make;
    private String model;
    private int year;
    private String licensePlate;
    private int minParked;

    ParkedCar(String make, String model, int year, String licensePlate, int minParked)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
        this.minParked = minParked;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return  model;
    }

    public int getYear()
    {
        return year;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }

    public int getMinParked()
    {
        return minParked;
    }

    public String toString()
    {
        return "Make: " + make + "\nModel: " + model + "\nYear: " + year + "\nLicense Plate: " + licensePlate+ "\n";
    }
}
