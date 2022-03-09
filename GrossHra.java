/* Write a JAVAprogram to input basiJAVAsalary of an employee and calculate its Gross salary according to following:
BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%
BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%
BasiJAVASalary > 20000 : HRA = 30%, DA = 95*/
import java.util.Scanner;
public class GrossHra
{
    public static void main(String args[])
    {
        float bs=0,gs=0,da=0,hra=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter basic salary");
        bs=sc.nextFloat();
        if(bs<=10000){
        hra=(bs/100)*20;
        da=(bs/100)*80;
        gs=hra+da+bs;
        System.out.println("gross salary:"+gs);
    }
   else if(bs<=20000){
        hra=(bs/100)*25;
        da=(bs/100)*90;
        gs=hra+da+bs;
        System.out.println("gross salary:"+gs);
    }
    else if(bs>20000){
        hra=(bs/100)*30;
        da=(bs/100)*95;
        gs=hra+da+bs;
        System.out.println("gross salary:"+gs);
}
}
}