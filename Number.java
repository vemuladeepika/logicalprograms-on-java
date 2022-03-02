//17. Write a Java program to print all natural numbers from 1 to n.using while loop 

import java.util.Scanner;
public class Number
{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int num=s.nextInt();  
    int i=0;
    while(i<=num)
        {
        System.out.print(i+" ");
          i++;
        }                        
    }
}