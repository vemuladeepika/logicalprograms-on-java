import java.util.*;
public class NestedTryBlockException
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value");
int a=sc.nextInt();
System.out.println("Enter b value");
int b=sc.nextInt();
int ab[]={1,3,4};
try {
System.out.println((a/b));
System.out.println("outer catch block executed");

    try{
       ab[5]=6;
        System.out.println("inner catch block executed");
    
    }

    catch(Exception e)
    {
        System.out.println(e);
        
    }
}

catch(Exception e)
{
    System.out.println(e);
}
}
}

