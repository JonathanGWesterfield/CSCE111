/**
 * Created by JonathanWesterfield on 11/28/16.
 */
public class Pet
{
    protected String name;
    protected int age;

    Pet() {}

    Pet(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
