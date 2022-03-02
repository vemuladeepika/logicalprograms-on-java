//27.Write a Java program to find first and last digit of a number. 
public class First{
public static void main(String args[]){
int number=23569875;
int firstdigit=0;
int lastdigit=0;
lastdigit=number%10;
System.out.println("last digit:"+lastdigit);
while(number!=0){
firstdigit=number%10;
number=number/10;
}
System.out.println("first digit:"+firstdigit);
}
}