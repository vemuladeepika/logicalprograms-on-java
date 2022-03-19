//3.final with class---we can not inherit that class
class Student
{
final int rollno=123;
final void display()
{
System.out.println("display");
}
}
class Toppers
{
void display()//cant do
{
System.out.println("edit");
}
}
class FinalClass
{
public static void main(String args[])
{
Student s=new Student();

s.display();
System.out.println(s.rollno);
}
}





