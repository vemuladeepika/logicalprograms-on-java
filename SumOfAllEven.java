//Write a JAVAprogram to find sum of all even numbers between 1 to n.
import java.util.Scanner;
public class SumOfAllEven
{
    public static void main(String[] args) 
    {
        int n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter n value");
    n=sc.nextInt();
    for(int i=1;i<=n;i=i+2)
    {
    
        
            sum=i+sum;
        
    }
    System.out.println(sum);
    }
}