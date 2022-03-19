//1.final with variable=we can not change that value

class Student
{
final int rollno=123;
void display()
{
System.out.println("display");
}
}
class Toppers
{
void display()
{
System.out.println("edit");
}
}
class FinalVariable
{
public static void main(String args[])
{
Student sc=new Student();

sc.display();
System.out.println(sc.rollno);
}
}