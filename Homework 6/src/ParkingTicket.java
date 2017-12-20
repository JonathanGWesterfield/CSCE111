/**
 * Created by JonathanWesterfield on 11/19/16.
 */

public class ParkingTicket
{
    private ParkedCar thisCar;
    private ParkingMeter thisMeter;
    private PoliceOfficer thisOfficer;

    ParkingTicket(ParkedCar car, ParkingMeter meter, PoliceOfficer officer)
    {
        thisCar = car;
        thisMeter = meter;
        thisOfficer = officer;
    }

    public int getFineAmount()
    {
        return thisOfficer.examine(thisCar, thisMeter);
    }
    /*
    public int getParkingLotNum()
    {
        return thisMeter.getParkingLotNum();
    }*/

    public String ticketPrint()
    {
        String ticket = "";
        if(thisOfficer.examine(thisCar, thisMeter) > 0)
        {
            ticket = "\n" + thisOfficer.toString() + "Lot Number: " + thisMeter.getParkingLotNum() + "\n" + thisCar.toString();
            ticket += "Fine amount: $" + thisOfficer.examine(thisCar, thisMeter);
        }
        else
            ticket += "No Ticket!";
        return ticket;
    }
}
