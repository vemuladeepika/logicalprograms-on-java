//26.Write a Java program to count number of digits in a number. 

import java.util.Scanner;
public class Digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter a number:");
        int num=sc.nextInt();
        for(int i=0;i<=num;i++)
        {
            num=num/10;
           ++count; 
            //count=++count;
        }
        System.out.println("number of digits in the entered integer are: "+count);
    }
}