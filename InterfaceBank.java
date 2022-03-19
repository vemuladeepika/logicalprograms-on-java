interface Bank
{
  abstract void rateOfIntrest();
}
class Sbi implements Bank{
public void rateOfIntrest()
{
System.out.println("rateofintrest is 8");
}
}
class Union implements Bank{
public void rateOfIntrest()
{
System.out.println("rateofintrest is 7");
}
}
class Axis implements Bank{
public void rateOfIntrest()
{
System.out.println("rateofintrest is 6");
}
}
class InterfaceBank
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
