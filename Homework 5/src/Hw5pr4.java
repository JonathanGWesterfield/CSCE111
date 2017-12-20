/**
 * Created by JonathanWesterfield on 11/6/16.
 */

import java.util.*;
import java.io.*;

public class Hw5pr4
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String stringStudents;
        int numStudents;
        String studentName;
        double studentAverage;
        String stringStudentAverage;
        String studentLetterGrade = "Invalid Grade";
        String placeHolder1 = "Name";
        String placeHolder2 = "Average";
        String placeHolder3 = "Grade";
        ArrayList<Student> studentList = new ArrayList<Student>();


        System.out.print("Input number of Students: ");
        stringStudents = reader.nextLine();
        numStudents = Integer.parseInt(stringStudents);

        for(int i = 0; i < numStudents; i++)
        {
            System.out.print("Student Name: ");
            studentName = reader.nextLine();
            System.out.print("Student Average: ");
            stringStudentAverage = reader.nextLine();
            studentAverage = Double.parseDouble(stringStudentAverage);

            if((studentAverage >= 90) && (studentAverage <= 100))
                studentLetterGrade = "A";
            else if (studentAverage >= 80)
                studentLetterGrade = "B";
            else if(studentAverage >= 70)
                studentLetterGrade = "C";
            else if(studentAverage >= 65)
                studentLetterGrade = "D";
            else if((studentAverage < 65) && (studentAverage >= 0))
                studentLetterGrade = "F";
            else
                System.out.println("Not a valid student average");

            studentList.add(new Student(studentName, studentAverage, studentLetterGrade));
        }
        System.out.printf("%-20s\t|" + "%10s\t|" + "%10s\n", placeHolder1, placeHolder2, placeHolder3);
        for(int i = 0; i < numStudents; i++)
        {
            System.out.printf("%-20s\t|" + "%10.1f\t|" + "%10s\n",studentList.get(i).getName(),
                    studentList.get(i).getAvgGrade(), studentList.get(i).getLetterGrade());
        }
    }
}

