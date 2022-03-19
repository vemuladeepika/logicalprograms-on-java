//2.final with method----we can not override that method

 final class Student
{
final int rollno=123;
void display()
{
System.out.println("display");
}
}

class FinalMethod
{
public static void main(String args[])
{
Student s=new Student();

s.display();
System.out.println(s.rollno);
}
}