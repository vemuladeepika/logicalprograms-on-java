interface Animal
{
   abstract void eat();
   }
   class Dog implements Animal
   {
       public void eat()
       {
           System.out.println("dog is eating");
       }
   }
   class Cat implements Animal
   {
       public void eat()
       {
           System.out.println("cat is eating");
       }
   }
   class InterfaceAnimal
   {
       public static void main(String args[])
       {
           Dog d= new Dog();
           d.eat();
           Cat c=new Cat();
           c.eat();
       }
   }