//write a program to print factors of a given number.
import java.util.Scanner;
class FactorsOfNum{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
         System.out.println("Enter n value");
         int n=s.nextInt();
         int count=0;
         for(int i=1;i<=n/2;i++){     
             
             if(n%i==0){          
                 count++;
             }
         }
         System.out.println("Number of factors: "+count);
    }
}