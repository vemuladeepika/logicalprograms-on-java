class calculator
{
    static void cube(int a)
    {
        System.out.println(a*a*a);
    }
}
class StaticCalculater
{
    public static void main(String args[])
    {
        calculator.cube(5);
    }
}