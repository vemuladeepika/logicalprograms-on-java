import java.util.*;
class Student
{
    int rollno;
    String name;
    String section;
    int marks;
    String address;
    
    //constructor overloading
    Student(int rollno,String name,String section,int marks,String address)
    {
        this.rollno=rollno;
        this.name=name;
        this.section=section;
        this.marks=marks;
        this.address=address;
        
    }
     
    Student()
    {
        this(123,"deepika","A",50,"sircilla");
    }
    Student(int r)
    {
        rollno=r;
    }
    //static methods
    static void collgename()
    {
        System.out.println("bitlabs");
    }
    
    
    void display()
    {
        System.out.println(rollno+"\n"+name+"\n"+section+"\n"+marks+"\n"+address);
    }
    
    void reading()
    {
        System.out.println(name+" reading");
    }
    void writing()
    {
        this.reading();
        System.out.println(name+" Writing");
    }
    
    
}
class StaticStudent2
{
    public static void main(String args[])
    {
        Student std1=new Student(123,"deepika","A",90,"sircilla");
     
      //Student.collegename="bitlabs1";
        System.out.println("Student 1 informatio");
        std1.display();
        //System.out.println(Student.collegename);
        std1.reading();
        std1.writing();
        Student.collgename();
        Student std2=new Student(345);
      
        System.out.println("Student 2 informatio");
      std2.display();
      //System.out.println(Student.collegename);
        std2.reading();
        std2.writing();
        Student.collgename();
         Student std3=new Student();
      
        System.out.println("Student 3 informatio");
      std3.display();
      //System.out.println(Student.collegename);
        std3.reading();
        std3.writing();

        
    }
}