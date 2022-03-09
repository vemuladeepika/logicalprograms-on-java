import java.util.Scanner;//20. Write a JAVAprogram to print all even numbers between 1 to 100. - using while loop
public class EvenNumber
{
    public static void main(String[] args) 
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        n=sc.nextInt();
        i=2;
        System.out.println("list of even numbers:");
        while(i<n)
        {
            System.out.println(i+"");
            i=i+2;
        }
    }
}