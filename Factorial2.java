//Write a JAVAprogram to calculate factorial of a number
 import java.util.Scanner;
public class Factorial2
{
    public static void main(String args[])
    {
        int i,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of"+num+ "is" +fact);
    }
}