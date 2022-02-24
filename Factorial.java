//write a program to print factorial of a given number.
import java.util.Scanner;
class Factorial
{
    public static void main(String args[])
    {
        int i,n,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number:");
         n=sc.nextInt();
        for( i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of the number:"+fact);
    }
}