class A
{
 void show()
 {
  System.out.println("hello from A");
 }
}
class B extends A
{
 protected void show()
 {
  System.out.println("hello from B");
  super.show();
 }
}
class C extends B
{
 public void show()
 {
  System.out.println("hello from c");
  super.show();
 }
}
class SuperOvvx
{
 public static void main(String args[])
 {
  C oc=new C();
  oc.show();
 }
}