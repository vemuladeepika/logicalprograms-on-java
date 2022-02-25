import java.util.Scanner;
class ArmStrong
{
    public static void main(String args[])
    {
        int n,count=0,a,b,c,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter any integer");
        n=s.nextInt();
        a=n;
        c=n;
        while(a>0)
        {
            a=a/10;
            count++;
        
        }
        while(n>0)
        {
            b=n%10;
            sum=(int)(sum+Math.pow(b,count));
            n=n/10;
        }
        if(sum==c)
        {
            System.out.println("given number is armstrong");
        }
        else
        {
            System.out.println("given number is not armstrong");
        }
    }
}