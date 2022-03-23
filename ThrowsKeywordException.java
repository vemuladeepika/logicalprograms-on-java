class ThrowsKeywordException
{
    static void check() throws ArithmeticException
    {
        System.out.println("inside check function");
    }
    public static void main(String args[]) 
    {
        try {
            
       check();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}