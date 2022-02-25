import java.util.Scanner;
class CheckElement
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size=s.nextInt();
        int[] myArray=new int[size];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            myArray[i]=s.nextInt();    
        }
        System.out.println("enter the value to be searched:");
        int searchVal=s.nextInt();
        for(int i=0;i<myArray.length;i++){
        if(myArray[i]==searchVal)
        {
            System.out.println("the index of element "+searchVal+" is:"+i);
        }
        }
    }
}
        
            
    