//16.write a java program to print day of week name using switch case.
import java.util.*;
public class Switch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter weekday number: ");
        int weekday=sc.nextInt();
        switch(weekday)
        {
            case 1:
            System.out.println("monday");
            break;
            case 2:   
         System.out.println("tuesday");
            break;
            case 3: 
             System.out.println("wednesday");
             break;
            case 4:
             System.out.println("thrusday");
             break;
             case 5:
             System.out.println("friday");
             break;
              case 6:
             System.out.println("saturday");
             break;
         case 7:
             System.out.println("sunday");
         default:
         System.out.println("INVALID CHOICE");    
         }

    }
}