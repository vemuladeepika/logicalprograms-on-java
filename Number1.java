//18.Write a Java program to print all natural numbers in reverse (from n to 1).using while loop 
import java.util.Scanner;
public class Number1
{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=s.nextInt();  
    int i=0;
    while(i>=1)
        {
        System.out.print(i+" ");
          i--;
        }                        
    }
}