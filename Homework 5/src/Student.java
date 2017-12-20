/**
 * Created by JonathanWesterfield on 11/6/16.
 */
import java.text.*;

public class Student
{
    private String name;
    private double avgGrade;
    private String letterGrade;

    Student(String StudentName, double avg, String letter)
    {
        name = StudentName;
        avgGrade = avg;
        letterGrade = letter;
    }

    public String getName()
    {
        return name;
    }

    public double getAvgGrade()
    {
        return avgGrade;
    }

    public String getLetterGrade()
    {
        return letterGrade;
    }

   /* @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("##.0");
        String output;
        output = name + "\t\t|" + df.format(avgGrade) + "\t\t|" + letterGrade;
        return output;
    }*/
}
