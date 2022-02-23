import java.util.Scanner;
class Bill
{
    public static void main(String args[])
    {
        double units=0,bill=0,gst=0,finalbill=0,oneunit=34.50;
        Scanner s=new Scanner(System.in);
        System.out.println("enter units");
        units=s.nextInt();
       bill=units*34.50;
       gst=(bill*18)/100;
       finalbill=bill+gst;
       System.out.println("final bill:"+finalbill);
    }
}
