//Write a JAVAprogram to count total number of even and odd elements in an array.
import java.util.Scanner;
class ArrayOddEven
{
    public static void main(String args[]){
        int size,i;
        int evenCount=0,oddCount=0;
       Scanner sc=new Scanner(System.in);
        System.out.println("please enter number of elements in an array:");
        size=sc.nextInt();
        int[]a=new int[size];
        System.out.println("please enter"+size+"elements of array:");
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<size;i++)
        {
            if(a[i]%2==0){
                evenCount++;
            }
                else
                {
                    oddCount++;
                }
                System.out.println("\n total number of even numbers in this array="+evenCount);
                System.out.println("\n total number of odd nummber in this array="+oddCount);
            }
        }
        }
    