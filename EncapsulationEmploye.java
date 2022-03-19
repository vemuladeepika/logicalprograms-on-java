/*create bean class Employee

declare private variables eid,ename,esalary

setters and getters

main class create 2 objects*/
import java.util.*;
class Employe
{
private int eid;
private String ename;
private String salary;
void setEid(int eid)//set the values for private datamembers
{
this.eid=eid;
}
void setEname(String ename)
{
this.ename=ename;
}
void setSalary(String salary)
{
this.salary=salary;
}
//to get the private variables
int getEid()
{
return this.eid;
}
String getEname()
{
return this.ename;
}
String getSalary()
{
return this.salary;
}
}
class EncapsulationEmploye
{
public static void main(String args[])
{
Employe e=new Employe();
Scanner sc=new Scanner(System.in);
System.out.println("enter a eid");
int d=sc.nextInt();
e.setEid(d);
System.out.println("enter name");
String n=sc.next();
e.setEname(n);
System.out.println("enter salary");
String s1=sc.next();
e.setSalary(s1);
System.out.println(e.getEid());
System.out.println(e.getEname());
System.out.println(e.getSalary());
Employe e1=new Employe();
System.out.println("enter a eid");
int n1=sc.nextInt();
e1.setEid(n1);
System.out.println("enter name");
String s2=sc.next();
e1.setEname(s2);
System.out.println("enter salary");
String s3=sc.next();
e1.setSalary(s3);
System.out.println(e1.getEid());
System.out.println(e1.getEname());
System.out.println(e1.getSalary());
}
}
