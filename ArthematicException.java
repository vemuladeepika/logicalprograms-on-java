import java.util.*;
public class ArthematicException
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value");
int a=sc.nextInt();
System.out.println("Enter b value");
int b=sc.nextInt();
double c=a/b;//division-Arithmetic Exception
System.out.println(c);
}
}