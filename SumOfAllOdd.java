//Write a JAVAprogram to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
public class SumOfAllOdd
{
    public static void main(String[] args) 
    {
        int n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter n value");
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        if((i%2)==1)
        {
    
        
            sum += i;
        
}    }
    System.out.println(sum);
    }
}
