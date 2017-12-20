/**
 * Created by JonathanWesterfield on 11/28/16.
 */
public class Cat extends Pet
{
    private String coat;
    private Boolean lapCat;

    Cat() {}

    Cat(String name, int age, String coat, Boolean lapCat)
    {
        super(name, age);
        this.coat = coat;
        this.lapCat = lapCat;
    }
    public void setCoat(String coat)
    {
        this.coat = coat;
    }
    public void setLapCat(boolean lapCat)
    {
        this.lapCat = lapCat;
    }
    public String getCoat()
    {
        return coat;
    }
    public boolean getLapCat()
    {
        return lapCat;
    }

    @Override
    public String toString()
    {
        String stream = "\nName: " + name + "\nAge: " + age;
        stream += "\nCoat: " + coat + "\nLap Cat?: ";
        if(lapCat)
            stream += "Yes";
        else
            stream += "No";
        return stream;
    }
}
