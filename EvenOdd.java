import java.util.Scanner;
class EvenOdd
{
    public static void main(String args[])
    {
        int n,even=0,odd=0;
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number of elements in array:");
        n=s.nextInt();
        int[]a=new int[n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even=even+a[i];
            }
            else
            {
                odd=odd+a[i];
            }
        }
         System.out.println("sum of even numbers:"+even); 
         System.out.println("sum of odd numbers:"+odd);
         
    }
}