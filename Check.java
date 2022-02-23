import java.util.Scanner;
class Check{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        
        int num=s.nextInt();
        if(num%2==0)
        System.out.println("the number is even");
        else
        System.out.println("the number is odd");
    }
}