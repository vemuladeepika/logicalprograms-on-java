import java.util.Scanner;
class CheckZero{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int num=s.nextInt();
        if(num==0)
        System.out.println("the number is zero");
        else if(num%2==0)
            System.out.println("the number is even");
        else
        System.out.println("the number is odd");
    }
}