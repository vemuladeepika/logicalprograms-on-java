class factorial
{
    static void fact(int a)
    {
           int fact=1;
        for(int i=1;i<=a;i++)
        {
        fact=fact*i;
        }
        System.out.println(fact);
    }
}
class StaticFactorial
{
    public static void main(String args[])
    {
    factorial.fact(5);
    }
}


