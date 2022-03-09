//Write a JAVAprogram to check whether a character is alphabet or not.
import java.util.Scanner;
public class AlphabetNot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("Enter the first charecter: ");
        ch=sc.next().charAt(0);
        if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
        {
            System.out.print("is an alphabet");
        }else
        {
            System.out.print("not an alphabet");
        }
    }
}