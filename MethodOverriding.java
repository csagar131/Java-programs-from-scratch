class A
{
 void show()
 {
  System.out.println("show called A");
  }
}
class B extends A
{
 void show()
 {
  super.show();
  System.out.println("show called B");
  
  }
}
class MethodOverriding
{
 public static void main(String args[])
 {
 B b=new B();
b.show(); 
//super.show();  cannot use super in the main class
 }
}