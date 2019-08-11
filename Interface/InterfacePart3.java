interface A
{
 void f1();
 void f2();
}
abstract class B implements A
{
  public void f1()
 {
  System.out.println("f1 called");
  }
}
class C extends B
{
public void f2()
 {
  System.out.println("f2 called");
  }
}
class InterfacePart3
{
 public static void main(String args[])
 {
  C c=new C();
  c.f1();
  c.f2();
 }
}