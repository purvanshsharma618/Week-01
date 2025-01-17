import java.util.*;
public class PenDistribution{ 
 public static void main(String[] args) {


        int totalPen = 14;
        int numberOfStudents = 3;

        int PenPerPerson = totalPen/numberOfStudents;
        int PensLeft = totalPen%numberOfStudents;
        
        System.out.println("The Pen Per Student is "+  PenPerPerson + " and the remaining pen not distributed is "+ PensLeft);
 }
}

