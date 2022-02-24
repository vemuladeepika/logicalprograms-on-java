//write a program to print 1-n numbers
import java.util.Scanner;
class PrintNum{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter n value");
        int n=s.nextInt();  
          int i=0;
          
          for(i=1;i<=n;i++){     
              
              System.out.print(i+" ");
          }                                        
    }
}