import java.util.Scanner;//10.write a java program to check whether a character is upper case or lower case alphabet.
public class Upper
{
public static void main(String args[])
{
    char ch;
 Scanner scan=new Scanner(System.in); 
System.out.println("Enter the character  ");
ch=scan.next().charAt(0);
if(ch>='A' && ch<='Z')
{
    System.out.println(ch+" is an upper case letter ");
}
else if(ch>='a' && ch<='z')
{
    System.out.println(ch+" is a lower case letter ");
}
else
{
    System.out.println(ch+" is not a Alphabets ");
}
}
}