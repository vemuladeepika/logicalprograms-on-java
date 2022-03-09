//Write a JAVAprogram to check whether a number is Prime number or not.
import java.util.Scanner;
class PrimeOrNot1
{
    public static void main(String args[])
    {
        int i=2;
        boolean flag=false;
         
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num=sc.nextInt();
        while(i<=num/2)
        {
            if(num%i==0){
                flag=true;
                break;
            }
        
        ++i;
    }
        if(!flag)
        System.out.println(num +"is a prime number");
        else
        System.out.println("not a prime number");
    }
}