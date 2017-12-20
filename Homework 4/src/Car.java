/**
 * Created by JonathanWesterfield on 10/15/16.
 */
public class Car
{
    private String make;
    private String model;
    private int mileage;
    private int speed;

    public Car(String carMake, String carModel)
    {
        make = carMake;
        model = carModel;
        mileage = 0;
        speed = 0;
    }

    public void setMileage(int carMileage)
    {
        mileage += carMileage;
    }

    public void accelerate()
    {
        speed += 5;
    }

    public void brake()
    {
        speed -= 10;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int getMileage()
    {
        return mileage;
    }
}
