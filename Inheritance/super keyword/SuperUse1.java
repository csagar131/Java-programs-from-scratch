class A
{
 int a=100;
 }
class B extends A
{
 int a=20;
 void show()
 {
  System.out.println(super.a);
  System.out.println(a);
  }
}
public class SuperUse1
{
 public static void main(String args[])
 {
  new B().show();
  }
 }
  