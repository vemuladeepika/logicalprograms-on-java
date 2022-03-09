//Write a JAVAprogram to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
public class SumNatural
{
    public static void main(String args[])
    {
        int i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter any number:");
       int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of natural number from 1 to "+ n + "=" +sum);
    }
}