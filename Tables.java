import java.util.Scanner;
class Tables
{
    public static void main(String args[])
    {
        int n,i;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("multiplication table of"+n);
        for(i=1;i<=10;i++)
        System.out.println(n+"*"+i+"="+(n*i));
    }
}