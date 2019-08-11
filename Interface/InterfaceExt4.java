interface A
{
 void f1();
}
interface B extends A
{
 void f2();
}
abstract class C implements B
{
 public void f1()
 {
  System.out.println("f1 called");
 }
}
class D extends C
{
 public void f2()
 {
  System.out.println("f2 called");
  }
}
class InterfaceExt4
{
 public static void main(String args[])
 {
  A a;
  B b;
  D d=new D();
  a=d;
  b=d;
  a.f1();
  b.f2();
  d.f1();
  d.f2();
  }
}
 
 