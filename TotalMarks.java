import java.util.Scanner;
class TotalMarks{
    public static void main(String args[]){
        int pm=0,im=0,em=0,total;
        Scanner s=new Scanner(System.in);
        System.out.println("enter pm marks");
        pm=s.nextInt();
        System.out.println("enter im marks");
        im=s.nextInt();
        System.out.println("enter em marks");
        em=s.nextInt();
        total=pm+im+em;
pm=(total*70)/100;
im=(total*20)/100;
em=(total*10)/100;
System.out.println("project marks:" +pm);
System.out.println("internal marks:" +im);
System.out.println("external marks:" +em);
System.out.println("total marks:"+total);
    }
}