import java.util.Scanner;
class Example9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter salary:");
        float salary=sc.nextFloat();
        float s1=salary/23000;
        float s2=salary/7000;
        float s3=salary/20000;
        System.out.println("money spent on s1:");
        System.out.println("money spent on s2:");
        System.out.println("money spent on s3:");
    }
}