import java.util.Scanner;//5.write a java program to check whether a number is even or odd.
class EvenOdd
{
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter an integer number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Entered number is even");
        }
        else
        {
            System.out.println("Entered number is odd");
        }
    }
}