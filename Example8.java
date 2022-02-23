import java.util.Scanner;
class Example8
{
    public static void main(String args[])
    {
        float bs=0,da=0,gs=0,hra=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic salary of employee:");
        bs=sc.nextFloat();
        hra=(bs/100)*56;
        da=(bs/100)*90;
        gs=hra+da+bs;
        System.out.println("hra amount:"+hra);
        System.out.println("da amount:"+da);
        System.out.println("gross amount:"+gs);
       
    }
}