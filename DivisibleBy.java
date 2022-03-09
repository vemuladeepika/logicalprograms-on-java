import java.util.Scanner;//write a program to find the number is divisible by 5 and 11 or not
public class DivisibleBy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num=sc.nextInt();
        
        if(num%5==0 && num%11==0)
        {
            System.out.println("num is divisible by five and 11");
        }
        else
        {
            System.out.println("num is not divisible by five and 11");
        }
    }
}