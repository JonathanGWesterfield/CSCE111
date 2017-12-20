/**
 * This class uses the Car class
 */

public class Hw4Pr4
{
    public static void main(String[] args)
    {
        Car vehicle = new Car("Honda", "Accord");

        for(int i = 1; i <= 10; i++)
        {
            vehicle.accelerate();
            vehicle.setMileage(vehicle.getSpeed());
            System.out.println(" Speed: " + vehicle.getSpeed());
            System.out.println("Mileage: " + vehicle.getMileage());
        }

        while(vehicle.getSpeed() > 0)
        {
            vehicle.brake();
            vehicle.setMileage(vehicle.getSpeed());
            System.out.println("Speed: " + vehicle.getSpeed());
            System.out.println("Mileage: " + vehicle.getMileage());
        }
    }
}
