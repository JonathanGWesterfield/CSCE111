/**
 * Created by JonathanWesterfield on 11/19/16.
 */
public class PoliceOfficer
{
    private String officerName;
    private int badgeNum;

    PoliceOfficer(String name, int badgeNum)
    {
        this.officerName = name;
        this.badgeNum = badgeNum;
    }

    public String getOfficerName()
    {
        return officerName;
    }

    public int getBadgeNum()
    {
        return badgeNum;
    }

    public int examine(ParkedCar car, ParkingMeter meter)
    {
        int overTime = 0;
        if(car.getMinParked() > meter.getNumMinPurchased())
        {
            overTime = car.getMinParked() - meter.getNumMinPurchased();
            // System.out.println("Car is parked illegally");
        }
        int fine = overTime;
        if(fine > 0)
            return fine;
        else
            return 0;
    }

    public String toString()
    {
        return "Officer: " + officerName + "\nBadge: " + badgeNum + "\n";
    }
}
