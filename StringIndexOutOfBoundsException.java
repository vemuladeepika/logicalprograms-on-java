import java.util.*;
public class StringIndexOutOfBoundsException
{
public static void main(String[] args) {
String s="deepika";
System.out.println(s.length());
try {
System.out.println(s.charAt(8));
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Hello World");
}
}