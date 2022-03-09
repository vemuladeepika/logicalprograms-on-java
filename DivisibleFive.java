import java.util.Scanner;
class DivisibleFive
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("emter num");
        int num=sc.nextInt();
        if(num%5==0)
        {
            System.out.println("num is divisible by five");
        }
        else
        {
            System.out.println("num is not divisible by five");
        }
    }
}