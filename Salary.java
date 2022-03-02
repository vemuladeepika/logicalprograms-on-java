//14.write a java program to input basic salary of an employee and calculate its gross salary according to following:
//basic-salary<=10000:HRA=20%,DA=80%
//basic-salary<=20000:HRA=25%,DA=90%
//basic-salary>20000:HRA=30%,DA=95%
import java.util.Scanner;
class Salary
{
 public static void main(String args[]) 
 {
  float Basic_salary,DA,HRA,da1,hra1,GrossPayment;
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter Basic Salary Of Employee: ");
  Basic_salary=scan.nextFloat();
  System.out.println("Enter Basic DA Of Employee: "); 
  da1=scan.nextFloat();
  System.out.println("Enter Basic HRA Of Employee: ");
  hra1=scan.nextFloat();
  DA=(da1*Basic_salary)/100;
  HRA=(hra1*Basic_salary)/100;
  GrossPayment=Basic_salary+DA+HRA;
  System.out.println("Gross Salary Of Employee: "+GrossPayment);
  }
}