
//13.write a java program to input marks of five subjects physics,chemistry,biology,mathematics and computer.
//calculate percentage and grade according to following:
//percentage>=90%:grade A 
//percentage>=80%:grade B
//percentage>=70%:grade C
//percentage>=60%:grade D
//percentage>=40%:grade E
//percentage<40%:grade F

import java.util.Scanner;
public class PercentageSub 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the marks of five subjects::\n");
        float physics=in.nextFloat();
        float chemistry=in.nextFloat();
        float biology=in.nextFloat();
        float mathematics=in.nextFloat();
        float computer=in.nextFloat();

        float total;
        float average;
        float percentage;
        char grade;
        total=physics+chemistry+biology+mathematics+computer;
        average=(float)(total / 5.0);
        percentage=(float)((total / 500.0) * 100);
        if (average >= 90)
            grade = 'A';
        else if (average>=80 && average<90)
            grade = 'B';
        else if (average>=70 && average<80)
            grade = 'C';
        else if (average>=60 && average<70)
            grade = 'D';
        else if(average>=40 && average<50)
            grade = 'E';
        else
            grade='F';
        System.out.println("\nThe Total marks   = " + total + "/500.0");
        System.out.println("The Average marks = " + average);
        System.out.println("The Percentage    = " + percentage + "%");
        System.out.println("The Grade         = '" + grade + "'");
    }
}