import java.util.Scanner;//11.write a java program to input week number and print week day.
class   WeekAll
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter weekday number: ");
        int weekday=sc.nextInt();
        if(weekday==1)
        {
            System.out.println("monday");
        }
         else if(weekday==2) 
         { 
             System.out.println("tuesday");
             
         }
         else if(weekday==3) 
         { 
             System.out.println("wednesday");
             
         }
         else if(weekday==4) 
         { 
             System.out.println("thrusday");
             
         }
         else if(weekday==5) 
         { 
             System.out.println("friday");
             
         }
         else if(weekday==6) 
         { 
             System.out.println("saturday");
             
         }
         else if(weekday==7) 
         { 
             System.out.println("sunday");
             
         }
         else
         {
         System.out.println("please enter weekday number between 1-7");    
         }

    }
}