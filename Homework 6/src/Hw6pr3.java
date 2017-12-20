/**
 * Created by JonathanWesterfield on 11/19/16.
 */
import java.util.*;

public class Hw6pr3
{
    public static void main(String[] args)
    {
        int ticketCount = 0;
        ParkedCar car1 = new ParkedCar("Ford", "Mustang", 1964, "H0WD33<3", ((int)(Math.random()*500) + 1));
        ParkedCar car2 = new ParkedCar("Honda", "Ridgeline", 2015, "SAWEM-OFF", ((int)(Math.random()*500) + 1));
        ParkedCar car3 = new ParkedCar("Volkswagen", "Massive Polluter", 2015, "TEASIP", ((int)(Math.random()*500) + 1));

        ParkingMeter meter1 = new ParkingMeter(32, ((int)(Math.random()*500) + 1));
        ParkingMeter meter2 = new ParkingMeter(48, ((int)(Math.random()*500) + 1));
        ParkingMeter meter3 = new ParkingMeter(68, ((int)(Math.random()*500) + 1));

        PoliceOfficer officer = new PoliceOfficer("Major Pain", 10572957);

        ParkingTicket ticket1 = new ParkingTicket(car1, meter1, officer);
        ParkingTicket ticket2 = new ParkingTicket(car2, meter2, officer);
        ParkingTicket ticket3 = new ParkingTicket(car3, meter3, officer);

        if(ticket1.getFineAmount() > 0)
        {
            ticketCount++;
            System.out.println(ticket1.ticketPrint());
        }
        if(ticket2.getFineAmount() > 0)
        {
            ticketCount++;
            System.out.println(ticket2.ticketPrint());
        }
        if(ticket3.getFineAmount() > 0)
        {
            ticketCount++;
            System.out.println(ticket3.ticketPrint());
        }

        if(ticketCount > 0)
            System.out.println("There were " + ticketCount + " tickets written!");
        else
            System.out.println("No Tickets Generated!");

    }
}
