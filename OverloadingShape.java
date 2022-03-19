class Shape
{
    void draw(int l,int b)
    {
        System.out.println("The area of rectangle is "+(l*b));
    }
    void draw(int s)
    {
        System.out.println("The area of Square  is "+(4*s));
    }
    void draw(int s1,int s2,int s3)
    {
        System.out.println("The area of triangle "+(0.5*s2*s3));
    }
}
class OverloadingShape
{
    public static void main(String args[])
    {
    Shape s=new Shape();
    s.draw(2);
    s.draw(3,4);
    s.draw(1,2,3);
}
}