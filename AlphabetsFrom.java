//Write a JAVAprogram to print all alphabets from a to z. - using while loop
import java.util.Scanner;
public class AlphabetsFrom
{
    public static void main(String args[])
    {
        char ch='a';
        System.out.println("lower case alphabets");
        while(ch<='z')
        {
            System.out.println(ch+"");
            ch++;
        }
    }
}