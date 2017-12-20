/**
 * Created by JonathanWesterfield on 11/19/16.
 */
public class ParkingMeter
{
    private int parkingLotNum;
    private int numMinPurchased;

    ParkingMeter(int parkingLotNum, int numMinPurchased)
    {
        this.parkingLotNum = parkingLotNum;
        this.numMinPurchased = numMinPurchased;
    }

    public int getParkingLotNum()
    {
        return parkingLotNum;
    }

    public int getNumMinPurchased()
    {
        return numMinPurchased;
    }
}
