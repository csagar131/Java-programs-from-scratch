interface P
{
 void p1();
}
interface Q
{
 void q1();
}
class C
{
 void show()
 { 
  System.out.println("hello");
  }
}
abstract class D extends C implements P,Q
{
 public void p1()
 {
  System.out.println("p1 called");
  }
}
class E extends D
{
 public void q1()
 {
  System.out.println("q1 called");
 }
}
class InterfaceImp
{
 public static void main(String args[])
 {
  E obj=new E();;
  P p;
  Q q;
  p=obj;
  q=obj;
  p.p1();
  q.q1();
  obj.p1();
  obj.show();
 }
}