class ThrowKeyword
{
static void validate(int age)
{
if(age<18)
{
throw new ArithmeticException("not eligible for vote");
}
else
{
System.out.println("Eligible for vote");
}
}
public static void main(String args[])
{
try {
validate(15);
}
catch(Exception e) {
System.out.println(e);
}
finally {
}
}
}