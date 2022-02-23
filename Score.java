import java.util.Scanner;
class Score
{
    public static void main(String args[]){
    int project=0,internal=0,external=0,totalscore=0;
    Scanner sc=new Scanner(System.in);
   System.out.println("enter project score");
    project=sc.nextInt();
     System.out.println("enter internal score");
    internal=sc.nextInt();
     System.out.println("enter external score");
    external=sc.nextInt();
    if(project>=50&&internal>=50&&external>=50)
    {
        totalscore=(project*70)/100+(internal*20)/100+(external*10)/100;
        System.out.println("total score is:"+totalscore);
    }
    else
    {
        System.out.println("the person is failed");
    }
    if(totalscore>=90)
    {
    System.out.println("A grade");
    }
    else if(totalscore>=75&&totalscore<=90)
    {
        System.out.println("B grade");
    }
    else if(totalscore>=50&&totalscore<=70){
        System.out.println("C grade");
    }
    }
}