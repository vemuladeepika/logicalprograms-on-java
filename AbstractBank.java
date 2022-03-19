abstract class Bank
{
  abstract void rateOfIntrest();
}
class Sbi extends Bank{
void rateOfIntrest()
{
System.out.println("rateofintrest is 8");
}
}
class Union extends Sbi{
void rateOfIntrest()
{
System.out.println("rateofintrest is 7");
}
}
class Axis extends Union{
void rateOfIntrest()
{
System.out.println("rateofintrest is 6");
}
}
class AbstractBank
{
public static void main(String args[])
{
    Sbi s=new Sbi();
s.rateOfIntrest();
Union b=new Union();
b.rateOfIntrest();
Axis u=new Axis();
u.rateOfIntrest();
}
}

