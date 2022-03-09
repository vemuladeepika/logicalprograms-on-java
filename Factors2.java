//Write a JAVAprogram to find all factors of a number.
import java.util.Scanner;
public class Factors2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num=sc.nextInt();
        System.out.print("factors of"+num+"are:");
        for(int i=1;i<=num;++i){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
        