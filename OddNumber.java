import java.util.Scanner;// Write a JAVAprogram to print all odd numbers between 1 to 100. - using while loop
public class OddNumber
{
    public static void main(String[] args) 
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        n=sc.nextInt();
        i=1;
        System.out.println("list of odd numbers:");
        while(i<=n)
        {
            System.out.println(i+"");
            i=i+2;
        }
    }
}