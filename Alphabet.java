import java.util.Scanner;//7.write a java program to check whether a character is alphabet or not.
class Alphabet
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char ch;
        System.out.println("Enter the character ");
        ch=s.next().charAt(0);
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        System.out.println(ch+" is an alphabet");
        else
        System.out.println(ch+" is not an alphabet");
    }
}