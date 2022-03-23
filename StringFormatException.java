
/* 3. Write a program to accept firstName, lastName and mobileNumber in string
 format. 


Print number of characters in firstName and lastName, and print sum of digits of a mobileNumber.


Handle NumberFormatException while converting mobileNumber to long.*/


import java.util.*;

class StringFormatException{
public static void main(String[] args){
    int digit;
    int sum = 0;
   
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first Name:");
    String firstname=sc.next();
    System.out.print("Enter last Name:");
    String lastname=sc.next();
   
    System.out.print("Enter Mobile Number:");
    String mobilenumber=sc.next();
    try{
    long number=Long.parseLong(lastname);
}
catch(Exception e){
    System.out.println(e);
}
    System.out.println("length of firstNameis:"+firstname.length());
    System.out.println("length of lastNameis:"+lastname.length());
    System.out.println("Mobile number is:"+mobilenumber);
    
}
}