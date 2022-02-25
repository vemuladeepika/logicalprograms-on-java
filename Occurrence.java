import java.util.Scanner;
class Occurrence
{
    public static void main(String args[])
    {
        int n,x,count=0,i=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of elements in array:");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter all the elements:");
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("enter the element of which you want to count number of occurences:");
        x=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                count++;
            }
        }
        System.out.println("number of occurrenceof the element:"+count);
    }
}