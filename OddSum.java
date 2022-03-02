//24.Write a Java program to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
class OddSum{
public static void main (String args[]){
int i,num;  
int oddSum=0;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the number for num:");
num=scan.nextInt();
i=0;
while(i<=num){  
if(i%2==1){
    oddSum=oddSum+i;
 i++;
}
}
System.out.println("Sum of all odd numbers are: "+oddSum);
}
}