class P {
int a = 20;
}
class Q extends P {
void display() {
System.out.println("The value of a into Q class is:" + a);
}
}
class InheritanceR extends P {
void display() {
System.out.println("The value of a into R class is:" + a);
}
public static void main(String args[])
{
Q q1 = new Q();
q1.display();
InheritanceR r1 = new InheritanceR();
r1.display();
}
}