/**
 * Created by JonathanWesterfield on 11/28/16.
 */
public class Fish extends Pet
{
    private String scaleColor;
    private String fishType;

    Fish() {}
    Fish(String name, int age, String scaleColor, String fishType)
    {
        super(name, age);
        this.scaleColor = scaleColor;
        this.fishType = fishType;
    }
    public void setScaleColor(String scaleColor)
    {
        this.scaleColor = scaleColor;
    }
    public void setFishType(String fishType)
    {
        this.fishType = fishType;
    }
    public String getScaleColor()
    {
        return scaleColor;
    }
    public String getFishType()
    {
        return fishType;
    }
    @Override
    public String toString()
    {
        String stream = "\nName: " + name + "\nAge: " + age;
        stream += "\nFish type: " + fishType + "\nScale Color: " + fishType;
        return stream;
    }
}
