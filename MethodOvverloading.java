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
  System.out.println("show called B");
  }
}
class MethodOverrloading
{
 public static void main(String args[])
 {
 B b=new B();
b.show(); 
 }
}