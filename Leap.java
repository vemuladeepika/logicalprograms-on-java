import java.util.Scanner;//write a java program whether a year is leap year or not.
class Leap
{
    public static void main(String args[])
    {
        int year;
        System.out.println("Enter a year:");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("Entered year is leap year");
        }
        else
        {
            System.out.println("Entered year is non-leap year");
        }
    }
}