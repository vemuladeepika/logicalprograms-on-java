import java.util.Scanner;
class Week{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter weekday number:");
        int weekday=s.nextInt();
        if(weekday==1)
        {
            System.out.println("SUNDAY");
        }else if(weekday==2){
            System.out.println("monday");
        }
        else if(weekday==3){
            System.out.println("tuesday");
        }
        else if(weekday==4){
            System.out.println("wednesday");
        }
        else if(weekday==5){
            System.out.println("thurday");
        }else if(weekday==6){
            System.out.println("friday");
        }
        else if(weekday==7){
            System.out.println("saturday");
        }
        else{
            System.out.println("please enter weekday number between 1-7");
        }
    }
        }