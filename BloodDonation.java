import java.util.Scanner;
class BloodDonation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
        System.out.println("enter weight");
        int weight=sc.nextInt();
        if(age>=18 && weight>=50)
        {
            System.out.println("eligible for donation");
        }
        else
        {
            System.out.println("not eligible");
        }
    }
}